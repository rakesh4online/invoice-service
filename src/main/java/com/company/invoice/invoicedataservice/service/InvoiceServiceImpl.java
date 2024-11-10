package com.company.invoice.invoicedataservice.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.invoice.invoicedataservice.model.Invoice;
import com.company.invoice.invoicedataservice.repo.InvoiceRepository;

@Service
public class InvoiceServiceImpl implements InvoiceService {

    @Autowired
    private InvoiceRepository invoiceRepository;

    @Override
    public Long saveInvoice(Invoice invoice) {
        Invoice savedInvoice = invoiceRepository.save(invoice); // Save the invoice and get the saved entity
        return savedInvoice.getId(); // Return the generated ID of the saved invoice
    }
    
    public Optional<Invoice> findById(Long id) {
        return invoiceRepository.findById(id); // Returns Optional<Invoice>
    }

}
