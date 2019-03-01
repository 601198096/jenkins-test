package com.example.demo.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @version 1.0
 * @Author: wanhao
 * @Description
 * @Date: Created in 15:50 2019/2/28
 */
@Controller
@RequestMapping
public class PingControl {

    @RequestMapping("/ping")
    @ResponseBody
    public String ping() {
         return  "ping";
    }
}
