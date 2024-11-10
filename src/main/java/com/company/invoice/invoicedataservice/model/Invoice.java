package com.company.invoice.invoicedataservice.model;


import lombok.Data;
import jakarta.persistence.*;
import java.util.List;

@Data
@Entity
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    private BillingHeader billingHeader;

    @OneToOne(cascade = CascadeType.ALL)
    private BuyerParty buyerParty;

    @OneToOne(cascade = CascadeType.ALL)
    private SupplierParty supplierParty;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "invoice_id")  // Foreign key column
    private List<BillingLine> billingLines;

	public Long getId() {
		return id;
	}

}
