package com.idealo.service;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.idealo.entity.Offer;
import com.idealo.entity.Root;
import org.springframework.stereotype.Component;

import java.io.File;
import java.util.List;

@Component
public class ReadJsonFileOffer {

    public List<Offer> getAllOffers() {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            Root root = objectMapper.readValue(new File(getClass().getClassLoader().getResource("offers.json").getFile()), Root.class);
            return root.getOffers();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}