package com.company.invoice.invoicedataservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
	
@Service	
public class InvoiceDeliveryServiceImpl implements InvoiceDeliveryService{

	    @Autowired
	    private RestTemplate restTemplate;

	    public String sendRequestToDelivery() {
	        String url = "http://localhost:8081/status";  // The URL of Service2

	        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);

	        if (response.getStatusCode() == HttpStatus.OK) {
	            return "Success: " + response.getBody();  // Success message from Service2
	        } else if (response.getStatusCode() == HttpStatus.BAD_REQUEST) {
	            return "Bad Request: " + response.getBody();  // Invalid request details
	        } else if (response.getStatusCode() == HttpStatus.NOT_FOUND) {
	            return "Resource Not Found: " + response.getBody();  // Resource not found
	        } else if (response.getStatusCode() == HttpStatus.INTERNAL_SERVER_ERROR) {
	            return "Error: " + response.getBody();  // Server-side error details
	        } else {
	            return "Unexpected Response: " + response.getBody();
	        }
	    }
}