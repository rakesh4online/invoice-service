package com.company.invoice.invoicedataservice.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.company.invoice.invoicedataservice.db.Invoice;
import com.company.invoice.invoicedataservice.model.InvoiceDTO;

@Service
public interface InvoiceService {


    public String saveInvoice(InvoiceDTO invoiceDTO) ;

	public Optional<Invoice> findById(Long id); 
}
