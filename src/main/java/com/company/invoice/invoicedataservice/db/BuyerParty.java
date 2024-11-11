package com.company.invoice.invoicedataservice.db;


import lombok.Data;
import jakarta.persistence.*;

@Data
@Entity
public class BuyerParty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "client_identifier")
    private String clientIdentifier;

    @Column(name = "client_identifier_gdd")
    private String clientIdentifierGdd;

    @Column(name = "client_invoicing_type")
    private String clientInvoicingType;
}
