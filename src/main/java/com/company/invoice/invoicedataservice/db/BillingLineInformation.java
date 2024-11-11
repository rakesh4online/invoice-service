package com.company.invoice.invoicedataservice.db;


import lombok.Data;
import jakarta.persistence.*;

@Data
@Entity
public class BillingLineInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "action_type")
    private String actionType;

    private double markup;

    @Column(name = "product_type")
    private String productType;

    @Column(name = "line_type")
    private String lineType;

    @Column(name = "merchant_model")
    private String merchantModel;

    @Column(name = "resource_code")
    private String resourceCode;

    @Column(name = "resource_for_vendor_calculation")
    private String resourceForVendorCalculation;

    @Column(name = "payment_id")
    private String paymentId;
}
