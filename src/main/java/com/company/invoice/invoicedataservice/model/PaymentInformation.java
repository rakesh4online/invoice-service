package com.company.invoice.invoicedataservice.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class PaymentInformation {

    @JsonProperty("payment_method")
    private String paymentMethod;

    @JsonProperty("card_type")
    private String cardType;

    @JsonProperty("payment_instrument_id")
    private String paymentInstrumentId;

    @JsonProperty("form_of_payment_id")
    private String formOfPaymentId;

    @JsonProperty("card_number_type")
    private String cardNumberType;

    @JsonProperty("short_card_num")
    private String shortCardNum;
}
