package com.yutao.shi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author shiyutao
 * @create 2021-11-23 20:11
 */
@Controller
public class Filecontroller {
    @RequestMapping("/up")
    public String up(MultipartFile photo){
   // photo.transferTo();
return "success";


    }
}
