package com.demo.api_nazioni.controller.api;

import com.demo.api_nazioni.Nazione.Nazione;
import com.demo.api_nazioni.service.ServiceData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {
    @Autowired
    @Qualifier("mainData")
    private ServiceData service;

    public DataController() {
    }

    @RequestMapping("/dati")
    public  Iterable<Nazione> getAll() {
        return service.getAll();
    }
}
