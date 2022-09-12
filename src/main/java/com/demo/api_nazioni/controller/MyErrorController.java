package com.demo.api_nazioni.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MyErrorController implements ErrorController {
    private static final String PATH = "/error";
    @RequestMapping(value = PATH)
    public String init() {
        return "error";
    }
}
