package com.demo.api_nazioni.controller.api;

import com.demo.api_nazioni.Nazione.Nazione;
import com.demo.api_nazioni.service.ServiceData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DataRestController {
    @Autowired
    @Qualifier("mainData")
    private ServiceData service;
    private List<Nazione> provvisoria;
    @Autowired
    private DataController provv;

    public DataRestController() {
    }

    @RequestMapping("/dati")
    @ResponseBody
    public Iterable<Nazione> getAll() {
        return service.getAll();
    }

    @RequestMapping("/filtrato")
    @ResponseBody
    public Iterable<Nazione> getProvv() {
        return provv.getProvvisoria();
    }

    @RequestMapping("/dati/filtra")
    @ResponseBody
    public List<Nazione> getGTLT(@RequestParam String dato, @RequestParam String condizione, @RequestParam Double valore, @RequestParam Double valore2) {
        provvisoria = new ArrayList<Nazione>();
        provvisoria.addAll((List<Nazione>) service.getAll());
        for(int y=0; y<5; y++) {
            if(condizione.equals("gt")) {
                for(int i=0; i<provvisoria.size(); i++) {
                    if((provvisoria.get(i).getDato(dato)) <= valore) {
                        provvisoria.remove(i);
                    }
                }
            }
            else if(condizione.equals("gte")) {
                for(int i=0; i<provvisoria.size(); i++) {
                    if((provvisoria.get(i).getDato(dato)) < valore) {
                        provvisoria.remove(i);
                    }
                }
            }
            else if(condizione.equals("lt")) {
                for(int i=0; i<provvisoria.size(); i++) {
                    if((provvisoria.get(i).getDato(dato)) >= valore) {
                        provvisoria.remove(i);
                    }
                }
            }
            else if(condizione.equals("lte")) {
                for(int i=0; i<provvisoria.size(); i++) {
                    if((provvisoria.get(i).getDato(dato)) > valore) {
                        provvisoria.remove(i);
                    }
                }
            }
            else if(condizione.equals("bt")) {
                for (int i = 0; i < provvisoria.size(); i++) {
                    if ((provvisoria.get(i).getDato(dato)) < valore || (provvisoria.get(i).getDato(dato)) > valore2) {
                        provvisoria.remove(i);
                    }
                }
            }
            else {
                provvisoria.clear();
            }
        }
        if(!(dato.equals("2000")||dato.equals("2001")||dato.equals("2002")||dato.equals("2003")||dato.equals("2004")||dato.equals("2005")||dato.equals("2006")||
                dato.equals("2007")||dato.equals("2008")||dato.equals("2009")||dato.equals("2010")||dato.equals("2011")||dato.equals("2012")||dato.equals("2013")||
                dato.equals("2014")||dato.equals("2015")||dato.equals("2016")||dato.equals("2017"))) {
            provvisoria.clear();
        }
        return provvisoria;
    }
}
