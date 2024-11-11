package com.company.invoice.invoicedataservice.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class BillingLineInformation {

    @JsonProperty("action_type")
    private String actionType;

    private double markup;

    @JsonProperty("product_type")
    private String productType;

    @JsonProperty("line_type")
    private String lineType;

    @JsonProperty("merchant_model")
    private String merchantModel;

    @JsonProperty("resource_code")
    private String resourceCode;

    @JsonProperty("resource_for_vendor_calculation")
    private String resourceForVendorCalculation;

    @JsonProperty("payment_id")
    private String paymentId;
}
