package com.laibao.jspinspring5.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author laibao wang
 * @date 2018-02-08
 * @version 1.0
 */
@Controller
@RequestMapping("/index")
public class IndexController {

    @GetMapping("/helloWorld")
    public String indexPage() {
        return "index";
    }
}
