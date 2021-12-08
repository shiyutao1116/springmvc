package com.yutao.shi;
import com.yutao.shi.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author shiyutao
 * @create 2021-11-18 19:59
 */
@Controller
public class HelloController {
   @RequestMapping(value = "/")
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/target")
    public String target(){
        return "target";
    }
   @RequestMapping(value = "/target/{password}/{name}")
    public String name(@PathVariable Integer password,@PathVariable String name){
        System.out.println(password+name);
        return "target";
   }
   @RequestMapping(value = "/target1")
    public String name1(String username,String password){
        System.out.println(username+password);
        return "target";
    }
    @RequestMapping(value = "/target2")
    public String name2(
            String username,
            @RequestParam("pass") String passname,
            String hobby,
            @RequestHeader("Host") String host,
            @CookieValue(value = "JSESSIONIS",defaultValue = "haha") String j){
       System.out.println(username+passname+hobby+host+j);
        return "target";
    }
    @RequestMapping(value = "/testpojo")
    public String name3(User user){

       return "target";
    }
}
