package com.yutao.shi;

        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author shiyutao
 * @create 2021-11-18 19:59
 */
@Controller
public class HelloController {
@RequestMapping("/")
        public String index(){
        return "index";

}

}
