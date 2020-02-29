package com.idealo.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Policy {

    private String name;
    private String displayName;
    private String text;
    private Boolean refundable;
    private Date refundableUntil;
    private Boolean required;

}
