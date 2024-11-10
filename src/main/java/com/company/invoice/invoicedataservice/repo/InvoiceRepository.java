package com.company.invoice.invoicedataservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.invoice.invoicedataservice.model.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
    // Custom queries can go here
}
