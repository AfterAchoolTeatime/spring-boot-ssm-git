package com.zhuzl.springbootssmgit;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("helloWorld")
    public String testspringboot(){
        return "HelloWorld234";
    }
}
