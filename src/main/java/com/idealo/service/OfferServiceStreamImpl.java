package com.idealo.service;

import com.idealo.entity.Offer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

@Service
@Qualifier("streamService")
public class OfferServiceStreamImpl implements OfferService {

    private ReadJsonFileOffer readJsonFileOffer;

    @Autowired
    public OfferServiceStreamImpl(ReadJsonFileOffer readJsonFileOffer) {
        this.readJsonFileOffer = readJsonFileOffer;
    }

    @Override
    public Offer getCheapestOffer() {
        return readJsonFileOffer.getAllOffers().stream()
                .min(Comparator.comparing(offer -> offer.getSource().getTotalNet().getOrigin())).get();
    }

    @Override
    public Offer getCheapestOffer(String notCurrency) {
        return readJsonFileOffer.getAllOffers().stream()
                .filter(offer -> !offer.getSource().getCurrencyCode().getOrigin().equals(notCurrency))
                .min(Comparator.comparing(offer -> offer.getSource().getTotalNet().getOrigin()))
                .orElseThrow(() -> new RuntimeException("data not found exception"));
    }
}
