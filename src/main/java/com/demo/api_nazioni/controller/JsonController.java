package com.demo.api_nazioni.controller;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

@Controller
public class JsonController {
    @RequestMapping("/json")
    @ResponseBody
    public JSONObject json() throws IOException, ParseException {
        JSONParser parser = new JSONParser();
        Object obj = parser.parse(new FileReader("C:\\Users\\stefa\\Desktop\\Java\\API-nazioni\\API nazioni\\src\\main\\java\\com\\demo\\api_nazioni\\RestApi\\db.json"));
        JSONObject file = (JSONObject) obj;
        return file;
    }
}
