package com.company.invoice.invoicedataservice.service;

import org.springframework.stereotype.Service;

@Service
public interface InvoiceDeliveryService {
	String sendRequestToDelivery();
}
