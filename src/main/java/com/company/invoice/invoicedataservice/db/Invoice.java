package com.company.invoice.invoicedataservice.db;


import lombok.Data;
import java.util.List;


import jakarta.persistence.*;

@Data
@Entity
public class Invoice {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "billing_header_id")
    private BillingHeader billingHeader;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "buyer_party_id")
    private BuyerParty buyerParty;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "supplier_party_id")
    private SupplierParty supplierParty;

    @OneToMany(mappedBy = "billingRequestDTO", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<BillingLine> billingLines;
}
