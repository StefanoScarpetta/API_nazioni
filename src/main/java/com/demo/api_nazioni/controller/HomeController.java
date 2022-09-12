package com.demo.api_nazioni.controller;

import com.demo.api_nazioni.Nazione.Nazione;
import com.demo.api_nazioni.service.ServiceData;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.util.List;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String init(Model model) {
        return "index";
    }
    @RequestMapping("/filtra/form")
    public String form() {
        return "form";
    }
}
