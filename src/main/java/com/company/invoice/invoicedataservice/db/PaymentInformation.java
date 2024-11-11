package com.company.invoice.invoicedataservice.db;


import lombok.Data;
import jakarta.persistence.*;

@Data
@Entity
public class PaymentInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "payment_method")
    private String paymentMethod;

    @Column(name = "card_type")
    private String cardType;

    @Column(name = "payment_instrument_id")
    private String paymentInstrumentId;

    @Column(name = "form_of_payment_id")
    private String formOfPaymentId;

    @Column(name = "card_number_type")
    private String cardNumberType;

    @Column(name = "short_card_num")
    private String shortCardNum;
}
