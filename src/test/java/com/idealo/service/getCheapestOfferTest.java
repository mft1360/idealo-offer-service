package com.idealo.service;

import com.idealo.Application;
import com.idealo.entity.Offer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.assertTrue;

@SpringBootTest(classes = Application.class)
@RunWith(SpringRunner.class)
public class getCheapestOfferTest {

    @Autowired
    @Qualifier("streamService")
    private OfferService offerService;

    @Autowired
    @Qualifier("manualService")
    private OfferService offerService1;

    @Test
    public void test_GetCheapestOfferByStream_ShouldBeOK() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss.SSS");
        Date start = new Date();
        System.out.println("Start the process at " + sdf.format(start));
        Offer offer = offerService.getCheapestOffer();
        Date end = new Date();
        System.out.println("End the process at " + sdf.format(end));
        System.out.println("Difference " + (end.getTime() - start.getTime()));
        System.out.println(offer);
        assertTrue(offer.getSource().getTotalNet().getOrigin() == 69.0);
    }

    @Test(expected = RuntimeException.class)
    public void test_GetCheapestOfferByStreamNotCurrencyInput_ShouldBeException() {
        Offer offer = offerService.getCheapestOffer("EUR");
        System.out.println(offer);
        assertTrue(offer.getSource().getTotalNet().getOrigin() == 69.0);
    }

    @Test
    public void test_GetCheapestOfferByManual_ShouldBeOK() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss.SSS");
        Date start = new Date();
        System.out.println("Start the process at " + sdf.format(start));
        Offer offer = offerService1.getCheapestOffer();
        Date end = new Date();
        System.out.println("End the process at " + sdf.format(end));
        System.out.println("Difference " + (end.getTime() - start.getTime()));
        System.out.println(offer);
        assertTrue(offer.getSource().getTotalNet().getOrigin() == 69.0);
    }


    @Test(expected = RuntimeException.class)
    public void test_GetCheapestOfferByManualNotCurrencyInput_ShouldBeException() {
        Offer offer = offerService1.getCheapestOffer("EUR");
        System.out.println(offer);
        assertTrue(offer.getSource().getTotalNet().getOrigin() == 69.0);
    }
}
