package com.company.invoice.invoicedataservice.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class BillingHeader {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String billing_id;
    
    private String caller_name;
    
    private String parent_billing_id;
    private int point_of_sale_id;
    private String be_gid;
    private String kid;
    private int company_id;
    private String document_type;
    private String payment_due_date;
    private String currency_code;
    private String invoice_date;
    private String invoicing_type;
    private int total_invoice_lines;
    private double total_invoice_amount;
    private double total_invoice_amount_due;
    private PaymentInformation payment_information;
    private String invoice_language_code;
    private String departure_date;


}
