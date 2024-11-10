package com.company.invoice.invoicedataservice.model;

import lombok.Data;



@Data
public class TaxBreakdown {
    private String amount;
    private String currency_code;
    private String rate;
    private String business_posting_group;
    private String prod_posting_group;
}