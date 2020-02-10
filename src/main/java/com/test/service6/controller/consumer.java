package com.test.service6.controller;

import com.test.service6.utils.MSendRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Lei
 * @Date 2020/2/9 19:49
 * @Version 1.0
 */

@RestController
@RequestMapping("/consumer")
public class consumer {

    @Autowired
    private MSendRequest mSendRequest;
    @GetMapping("/get")
    public String getVersion(){
        return mSendRequest.sendRequest("http://gateway/service5/provider/getServiceInfo","1.0.0", String.class, RequestMethod.GET);
    }
}
