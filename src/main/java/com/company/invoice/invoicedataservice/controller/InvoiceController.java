package com.company.invoice.invoicedataservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.company.invoice.invoicedataservice.db.Invoice;
import com.company.invoice.invoicedataservice.model.InvoiceDTO;
import com.company.invoice.invoicedataservice.service.InvoiceService;

import java.util.List;
import java.util.Optional;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/invoices")
public class InvoiceController {

    @Autowired
    private InvoiceService invoiceService;


    // Endpoint to create an invoice
    @PostMapping("/save")
    public ResponseEntity<Long> createInvoice(@RequestBody InvoiceDTO invoiceDTO) {
        Long invoiceId = invoiceService.saveInvoice(invoiceDTO);
        return ResponseEntity.status(201).body(invoiceId); // Return HTTP 201 (Created) and the invoice ID
    }

    // Endpoint to get an invoice by ID
    @GetMapping("/{id}")
    public Optional<Invoice> getInvoice(@PathVariable Long id) {
        return invoiceService.findById(id); // Implement findById in the service
    }
}
