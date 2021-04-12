package com.dao.impl;

import com.alibaba.fastjson.JSON;
import com.util.Vip;
import com.dao.insertService;

public class insertServiceimpl implements insertService {
    @Override
    public String insert(Vip vip) {
        return JSON.toJSONString(vip);
    }
}
