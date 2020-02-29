package com.idealo.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Offer {

    @JsonProperty("_index")
    private String index;

    @JsonProperty("_type")
    private String type;

    @JsonProperty("_id")
    private String id;

    @JsonProperty("_score")
    private Integer score;

    @JsonProperty("_source")
    private Source source;

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("the cheapest offer is offer with ");
        stringBuffer.append("id=");
        stringBuffer.append(this.getId());
        stringBuffer.append(" and totalNet=");
        stringBuffer.append(this.getSource().getTotalNet().getOrigin());
        return stringBuffer.toString();
    }

    @Override
    public boolean equals(Object offer) {
        return this.id.equals(((Offer) offer).getId());
    }
}
