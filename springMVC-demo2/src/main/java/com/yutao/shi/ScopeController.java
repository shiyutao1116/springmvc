package com.yutao.shi;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @author shiyutao
 * @create 2021-11-20 23:41
 */
@Controller
public class ScopeController {
    @RequestMapping("/api")
    public String api(HttpServletRequest request){
        request.setAttribute("key","hello ,api");
        return "success";
    }
    @RequestMapping("/mav")
    public ModelAndView modelAndView(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("key","model and view");
        modelAndView.setViewName("success");
        return modelAndView;

    }
    @RequestMapping("/test")
    public String test1(){

        return"forwrad:/";

}}
