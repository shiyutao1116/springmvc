package com.yutao.shi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author shiyutao
 * @create 2021-11-23 22:59
 */
@Controller
public class Testconller {
    @RequestMapping("/testintercepto")
    public String test1() {
        return "success";
    }

    @RequestMapping("/testerror")
    public String test2() {
        System.out.println(10 / 0);

        return "success";

    }
}