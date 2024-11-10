package com.company.invoice.invoicedataservice.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.company.invoice.invoicedataservice.model.Invoice;

@Service
public interface InvoiceService {


    public Long saveInvoice(Invoice invoice) ;

	public Optional<Invoice> findById(Long id); 
}
