package com.controller;

import com.dao.QueryDao;
import com.dao.query;
import com.util.Vip;
import com.dao.impl.insertServiceimpl;
import com.util.DemoDate;
import com.util.DemoResult;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.*;

@RestController
@CrossOrigin(origins ="*")
public class DemoController {
    @Autowired
    QueryDao queryDao;
    @Autowired
    query Query;
    public static List<Vip> list = new ArrayList<>();
    private final com.dao.insertService insertService = new insertServiceimpl();
    java.util.Date date = new Date();
    String Date = DemoDate.NewDate(date);
    @RequestMapping(value = "/user/insert", method = RequestMethod.POST)
    public DemoResult insert(@RequestBody Vip vip) throws SQLException {
            boolean flag=Query.search(vip.getUsername());//判断用户名是否相同
            if (flag){
            Vip vip1=queryDao.Insert(vip);
            String s = insertService.insert(vip1);
            JSONObject jsonArray=JSONObject.fromObject(s);
            return DemoResult.ok().meta("data",jsonArray).message(Date);
            }else{
                return DemoResult.exist().message("exist").meta("status",28004).data("用户名已被注册",true);
            }/*else {
                return DemoResult.error().message("error");
            }*/
    }
    @GetMapping(value = "/test")
    public Object test() {
        return "Hello SpringBoot with Docker!";
    }
}
