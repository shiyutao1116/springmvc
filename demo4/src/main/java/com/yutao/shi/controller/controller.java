package com.yutao.shi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author shiyutao
 * @create 2021-11-23 15:31
 */
@Controller
public class controller {
    @RequestMapping(value = "/testRequestBody", method = RequestMethod.POST)
    public String test1(@RequestBody String requestbody) {
        System.out.println(requestbody);
        return "success";

    }

    @RequestMapping(value = "/testresponse")
    public void test2(HttpServletResponse response) throws IOException {

        response.getWriter().print("helloresponse");

    }

    @RequestMapping("/testresponsebody")
    @ResponseBody
    public String test3() {
        return "success";
    }
    @RequestMapping("/testaxios")
    @ResponseBody
    public String test4(String username ,String password) {
        System.out.println(username+password);
        return "helloaxios";
    }
}