package com.company.invoice.invoicedataservice.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import java.util.List;

@Data
public class BillingLine {

    @JsonProperty("billing_line_information")
    private BillingLineInformation billingLineInformation;

    @JsonProperty("booking_information")
    private BookingInformation bookingInformation;

    @JsonProperty("custom_data_fields")
    private List<CustomDataField> customDataFields;
}
