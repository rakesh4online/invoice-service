package com.company.invoice.invoicedataservice.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import java.util.List;

@Data
public class InvoiceDTO {

    @JsonProperty("billing_header")
    private BillingHeader billingHeader;

    @JsonProperty("buyer_party")
    private BuyerParty buyerParty;

    @JsonProperty("supplier_party")
    private SupplierParty supplierParty;

    @JsonProperty("billing_lines")
    private List<BillingLine> billingLines;
}
