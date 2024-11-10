package com.company.invoice.invoicedataservice.model;

import lombok.Data;

@Data
public class BasePrice {
    private String amount;
    private String currency_code;
}