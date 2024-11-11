package com.company.invoice.invoicedataservice.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class BillingHeader {

    @JsonProperty("caller_name")
    private String callerName;

    @JsonProperty("billing_id")
    private String billingId;

    @JsonProperty("point_of_sale_id")
    private long pointOfSaleId;

    @JsonProperty("be_gid")
    private String beGid;

    @JsonProperty("payment_information")
    private PaymentInformation paymentInformation;
}
