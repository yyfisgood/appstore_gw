package com.jd.appstore.gateway.domain.response;

import com.jd.appstore.gateway.domain.obj.ResultObj;

/**
 * Created by IntelliJ IDEA.
 * User: gaoyang
 * Date: 12-7-18
 * Time: 下午8:21
 * To change this template use File | Settings | File Templates.
 */
public class UserLoginRes{

    private ResultObj resultObj;
    private String pin;
    private String token;

    public ResultObj getResultObj() {
        return resultObj;
    }

    public void setResultObj(ResultObj resultObj) {
        this.resultObj = resultObj;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
