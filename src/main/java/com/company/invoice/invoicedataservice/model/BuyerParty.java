package com.company.invoice.invoicedataservice.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class BuyerParty {

    @JsonProperty("client_identifier")
    private String clientIdentifier;

    @JsonProperty("client_identifier_gdd")
    private String clientIdentifierGdd;

    @JsonProperty("client_invoicing_type")
    private String clientInvoicingType;
}
