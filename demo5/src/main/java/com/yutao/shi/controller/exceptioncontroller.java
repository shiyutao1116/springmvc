package com.yutao.shi.controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author shiyutao
 * @create 2021-11-24 16:44
 */
@ControllerAdvice
public class exceptioncontroller {
    @ExceptionHandler(value = {ArithmeticException.class,NullPointerException.class})
    public String exception(Exception ex, Model model){
        model.addAttribute("ex",ex);

        return "error";
    }
}
