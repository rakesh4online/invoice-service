package com.company.invoice.invoicedataservice.db;


import lombok.Data;
import jakarta.persistence.*;

@Data
@Entity
public class SupplierParty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "travel_office_name")
    private String travelOfficeName;
}
