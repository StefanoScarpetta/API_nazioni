package com.demo.api_nazioni.service;

import com.demo.api_nazioni.Classi.GeneralInformation;
import com.demo.api_nazioni.Convertitore.Reader;
import com.demo.api_nazioni.Nazione.Nazione;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service("mainData")
public class ServiceData implements IService {
    private List<Nazione> list;

    public ServiceData() throws IOException, ParseException {
        Reader reader = new Reader("C://Users//stefa//Desktop//Java//API-nazioni//API nazioni//src//main//java//com//demo//api_nazioni//Risorse//Scaricato.json");
        JSONObject js = reader.getJsonObject();
        GeneralInformation generalInformation = new GeneralInformation(js);
        list = new ArrayList<Nazione>();
        for(int i=0; i<generalInformation.getDimension().getItems().get(1).getCategory().getLista().size(); i++) {
            int b= (int) (((long) generalInformation.getDimension().getItems().get(1).getCategory().getLista().get(i).getIndex())*36);
            list.add(new Nazione(
                    generalInformation.getDimension().getItems().get(1).getCategory().getLista().get(i).getIndex(),
                    generalInformation.getDimension().getItems().get(1).getCategory().getLista().get(i).getLabel(),
                    generalInformation.getDimension().getItems().get(1).getCategory().getLista().get(i).getKey(),
                    generalInformation.getValue().get(String.valueOf(b)),
                    generalInformation.getValue().get(String.valueOf(b+1)),
                    generalInformation.getValue().get(String.valueOf(b+2)),
                    generalInformation.getValue().get(String.valueOf(b+3)),
                    generalInformation.getValue().get(String.valueOf(b+4)),
                    generalInformation.getValue().get(String.valueOf(b+5)),
                    generalInformation.getValue().get(String.valueOf(b+6)),
                    generalInformation.getValue().get(String.valueOf(b+7)),
                    generalInformation.getValue().get(String.valueOf(b+8)),
                    generalInformation.getValue().get(String.valueOf(b+9)),
                    generalInformation.getValue().get(String.valueOf(b+10)),
                    generalInformation.getValue().get(String.valueOf(b+11)),
                    generalInformation.getValue().get(String.valueOf(b+12)),
                    generalInformation.getValue().get(String.valueOf(b+13)),
                    generalInformation.getValue().get(String.valueOf(b+14)),
                    generalInformation.getValue().get(String.valueOf(b+15)),
                    generalInformation.getValue().get(String.valueOf(b+16)),
                    generalInformation.getValue().get(String.valueOf(b+17))
            ));
        }
    }

    @Override
    public Iterable<Nazione> getAll() {
        return list;
    }
}
