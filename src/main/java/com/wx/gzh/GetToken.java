package com.wx.gzh;/**
 * Created by huayu on 2019/3/8.
 */

import com.wx.entity.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;

/**
 * @ClassName GetToken
 * @Description
 * @Author huayu
 * @Date 2019/3/8 16:24
 * @Version 1.0
 **/
@Controller
@RequestMapping("/token")
public class GetToken {

    @ResponseBody
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public Result getToken(){
        System.out.println("获取token");
        RestTemplate restTemplate = new RestTemplate();
        Result result = restTemplate.getForObject("https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=wxc0e061b944392bd3&secret=8626ceca947145bd478b9d1a76c7f175", Result.class);
        System.out.println(result);
        return result;
    }
}
