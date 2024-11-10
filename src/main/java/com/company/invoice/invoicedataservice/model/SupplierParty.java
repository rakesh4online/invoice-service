package com.company.invoice.invoicedataservice.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class SupplierParty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String travel_office_name;
    private TravelOfficeAddress travel_office_address;


}
