package com.idealo.entity;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Source {

    private String id;
    private int searchId;
    private String type;
    private Integer shopId;
    private Integer hotelId;
    private String partnerHotelId;
    private Date created;
    private Date arrival;
    private Date departure;
    private Integer numberOfPersons;
    private Integer numberOfNights;
    private List<Item> items;
    private UnitPrice totalGross;
    private UnitPrice totalNet;
    private CurrencyCode currencyCode;
    private List<Policy> policies;
    private Boolean directlyBookable;
    private String deepLink;
    private List<String> notes;

}
