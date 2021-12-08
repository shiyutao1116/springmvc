package com.yutao.shi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author shiyutao
 * @create 2021-11-21 15:34
 */
@Controller
public class viewcontroller {
    @RequestMapping("/view")
    public String view(){

        return "success";
    }
    @RequestMapping("/forward")
    public String view1(){

        return "forward:/view";
    }
}
