package com.idealo.entity;

import lombok.Data;

import java.util.List;

@Data
public class Item {

    private String type;
    private String name;
    private String description;
    private Integer quantity;
    private UnitPrice unitPrice;
    private String unit;
    private List<Tax> taxes;
    private UnitPrice totalNet;
    private UnitPrice totalGross;
    private List<Policy> policies;
    private Boolean optional;
    private Integer hotelRoomId;
    private String partnerRoomKey;
    private String partnerRoomBookingId;
    private List<String> hotelRoomProperties;
    private String feeType;
    private String boardType;

}
