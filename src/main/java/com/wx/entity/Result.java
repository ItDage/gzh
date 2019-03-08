package com.wx.entity;/**
 * Created by huayu on 2019/3/8.
 */

import org.springframework.stereotype.Component;

/**
 * @ClassName Result
 * @Description
 * @Author huayu
 * @Date 2019/3/8 16:26
 * @Version 1.0
 **/
@Component
public class Result {

    private int errCode;

    private String errmsg;

    private String access_token;

    private String expires_in;


    public int getErrCode() {
        return errCode;
    }

    public void setErrCode(int errCode) {
        this.errCode = errCode;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getExpires_in() {
        return expires_in;
    }

    public void setExpires_in(String expires_in) {
        this.expires_in = expires_in;
    }

    @Override
    public String toString() {
        return "Result{" +
                "errCode=" + errCode +
                ", errmsg='" + errmsg + '\'' +
                ", access_token='" + access_token + '\'' +
                ", expires_in='" + expires_in + '\'' +
                '}';
    }
}
