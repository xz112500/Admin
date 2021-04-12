package com.util;

import com.alibaba.fastjson.JSON;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class DemoResult {
    private Boolean success;
    private Integer status;
    private String message;
    private Map<String, Object> data = new HashMap<String, Object>();
    private  Map<String, Object> meta = new HashMap<String, Object>();
     public DemoResult(){}

    public static DemoResult ok(){
         DemoResult d=new DemoResult();
         d.setSuccess(ResultCodeEnum.SUCCESS.getSuccess());
         d.setStatus(ResultCodeEnum.SUCCESS.getStatus());
         d.setMessage(ResultCodeEnum.SUCCESS.getMessage());
         return d;
    }
    public static  DemoResult error(){
         DemoResult d=new DemoResult();
         d.setSuccess(ResultCodeEnum.UNKNOWN_REASON.getSuccess());
         d.setStatus(ResultCodeEnum.UNKNOWN_REASON.getStatus());
         d.setMessage(ResultCodeEnum.UNKNOWN_REASON.getMessage());
         return d;
    }
    public static DemoResult exist(){
         DemoResult d=new DemoResult();
         d.setSuccess(ResultCodeEnum.REGISTERED_ERROR.getSuccess());
         d.setStatus(ResultCodeEnum.REGISTERED_ERROR.getStatus());
         d.setMessage(ResultCodeEnum.REGISTERED_ERROR.getMessage());
         return d;
    }
    public static DemoResult setResult(ResultCodeEnum result){
         DemoResult d=new DemoResult();
         d.setSuccess(result.getSuccess());
         d.setStatus(result.getStatus());
         d.setMessage(result.getMessage());
         return d;
    }
    public DemoResult success(Boolean success){
         this.setSuccess(success);
         return this;
    }
    public DemoResult message(String message){
         this.setMessage(message);
         return this;
    }
    public DemoResult status(Integer status){
         this.setStatus(status);
         return this;
    }
    public DemoResult data(String key,Object value){
         this.data.put(key, value);
         return this;
    }
    public DemoResult meta(String key,Object value){
         this.meta.put(key, value);
         return this;
    }
    public DemoResult data(Map<String, Object> map) {
        this.setData(map);
        return this;
    }
    }
