package com.company.invoice.invoicedataservice.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class SupplierParty {

    @JsonProperty("travel_office_name")
    private String travelOfficeName;
}
