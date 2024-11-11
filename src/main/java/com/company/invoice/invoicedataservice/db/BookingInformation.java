package com.company.invoice.invoicedataservice.db;


import lombok.Data;
import jakarta.persistence.*;

@Data
@Entity
public class BookingInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "booker_id")
    private String bookerId;

    @Column(name = "supplier_confirmation_number")
    private String supplierConfirmationNumber;

    @Column(name = "booking_date")
    private String bookingDate;
}
