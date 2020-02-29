package com.idealo.service;

import com.idealo.entity.Offer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Qualifier("manualService")
public class OfferServiceManualImpl implements OfferService {

    private ReadJsonFileOffer readJsonFileOffer;

    @Autowired
    public OfferServiceManualImpl(ReadJsonFileOffer readJsonFileOffer) {
        this.readJsonFileOffer = readJsonFileOffer;
    }

    @Override
    public Offer getCheapestOffer() {
        return getCheapestOffer(null);
    }

    @Override
    public Offer getCheapestOffer(String notCurrency) {
        List<Offer> offers = readJsonFileOffer.getAllOffers();
        Double minValue = Double.MAX_VALUE;
        Offer cheapestOffer = null;
        for (Offer offer : offers) {
            if (!offer.getSource().getCurrencyCode().getOrigin().equals(notCurrency) && offer.getSource().getTotalNet().getOrigin() < minValue) {
                minValue = offer.getSource().getTotalNet().getOrigin();
                cheapestOffer = offer;
            }
        }
        return Optional.of(cheapestOffer).orElseThrow(() -> new RuntimeException("data not found exception"));
    }
}
