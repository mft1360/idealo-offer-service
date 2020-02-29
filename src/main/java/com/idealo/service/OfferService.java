package com.idealo.service;

import com.idealo.entity.Offer;

public interface OfferService {

    Offer getCheapestOffer();

    Offer getCheapestOffer(String notCurrency);

}
