package com;

import com.alibaba.fastjson.JSON;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class demo {
    public static void main(String[] args) {
        Map<String,Object> map=new HashMap<>();
        String a="[\"{\"name\":\"5616161\",\"password\":\"516\",\"qq\":\"1561\",\"address\":\"61\",\"remarks\":\"61\"}\"]";
        String str = "[{\"num\":\"408\",\"data\":\"258369\"},{\"num\":\"410\",\"data\":\"741852\"},{\"num\":\"412\",\"data\":\"11111\"}]";
        List list =new ArrayList();
        list.add("666");
        list.add("888");
         JSONObject jsonObject=new JSONObject();
        JSONObject s=JSONObject.fromObject(str);
        JSONObject jsonArray=JSONObject.fromObject(str);
      /*  System.out.println(ss);*/
    }
}
