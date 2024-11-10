package com.company.invoice.invoicedataservice.model;

import lombok.Data;

@Data
public class TravelOfficeAddress {
    private String address1;
    private String postal_code;
    private String postal_district;
    private String country_code;
}