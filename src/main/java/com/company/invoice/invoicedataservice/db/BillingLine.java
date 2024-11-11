package com.company.invoice.invoicedataservice.db;


import lombok.Data;
import jakarta.persistence.*;
import java.util.List;

@Data
@Entity
public class BillingLine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "billing_request_dto_id")
    private Invoice billingRequestDTO;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "billing_line_information_id")
    private BillingLineInformation billingLineInformation;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "booking_information_id")
    private BookingInformation bookingInformation;

    @OneToMany(mappedBy = "billingLine", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CustomDataField> customDataFields;
}
