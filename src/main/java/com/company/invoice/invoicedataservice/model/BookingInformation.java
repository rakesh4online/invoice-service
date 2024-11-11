package com.company.invoice.invoicedataservice.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class BookingInformation {

    @JsonProperty("booker_id")
    private String bookerId;

    @JsonProperty("supplier_confirmation_number")
    private String supplierConfirmationNumber;

    @JsonProperty("booking_date")
    private String bookingDate;
}
