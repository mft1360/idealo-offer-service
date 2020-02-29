package com.idealo.entity;

import lombok.Data;

@Data
public class Tax {

    private String name;
    private Integer rate;
    private UnitPrice amount;

}
