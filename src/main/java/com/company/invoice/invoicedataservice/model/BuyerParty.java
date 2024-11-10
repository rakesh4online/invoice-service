package com.company.invoice.invoicedataservice.model;

import lombok.Data;

import jakarta.persistence.*;

@Data
@Entity
public class BuyerParty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private BuyerAddress buyer_address;
    private String client_identifier;
    private String client_identifier_gdd;
    private String client_invoicing_type;


}

