package com.company.invoice.invoicedataservice.db;


import lombok.Data;
import jakarta.persistence.*;

@Data
@Entity
public class BillingHeader {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "caller_name")
    private String callerName;

    @Column(name = "billing_id")
    private String billingId;

    @Column(name = "point_of_sale_id")
    private Long pointOfSaleId;

    @Column(name = "be_gid")
    private String beGid;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "payment_information_id")
    private PaymentInformation paymentInformation;
}
