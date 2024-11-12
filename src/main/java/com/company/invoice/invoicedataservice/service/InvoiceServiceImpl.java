package com.company.invoice.invoicedataservice.service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.invoice.invoicedataservice.db.BillingHeader;
import com.company.invoice.invoicedataservice.db.BillingLine;
import com.company.invoice.invoicedataservice.db.BillingLineInformation;
import com.company.invoice.invoicedataservice.db.BookingInformation;
import com.company.invoice.invoicedataservice.db.BuyerParty;
import com.company.invoice.invoicedataservice.db.CustomDataField;
import com.company.invoice.invoicedataservice.db.Invoice;
import com.company.invoice.invoicedataservice.db.PaymentInformation;
import com.company.invoice.invoicedataservice.db.SupplierParty;
import com.company.invoice.invoicedataservice.model.InvoiceDTO;
import com.company.invoice.invoicedataservice.repo.InvoiceRepository;

@Service
public class InvoiceServiceImpl implements InvoiceService {

    @Autowired
    private InvoiceRepository invoiceRepository;
    
    private final InvoiceDeliveryService invoiceDeliveryService;
    
    @Autowired
    public InvoiceServiceImpl(InvoiceDeliveryService invoiceDeliveryService) {
        this.invoiceDeliveryService = invoiceDeliveryService;
    }

    @Override
    public String saveInvoice(InvoiceDTO invoiceDTO) {
    	
    	Invoice receivedInvoice = new Invoice();
        BillingHeader billingHeader = new BillingHeader(); 
        BuyerParty buyerParty = new BuyerParty();
        SupplierParty supplierParty = new SupplierParty(); 
        List<BillingLine> billingLines = new ArrayList<BillingLine>(); 

        BillingLine billingLine1 = null;
        BillingLine billingLine2 = null;
        
        String callerName = invoiceDTO.getBillingHeader().getCallerName();
        billingHeader.setCallerName(callerName);
        String billingId = "ABCD";
        int pointOfSaleId = 12452;
        String beGid = "12456456584";
        PaymentInformation paymentInformation = new PaymentInformation();

        String paymentMethod = "CREDIT CARD";
        String cardType = "";
        String paymentInstrumentId = "";
        String formOfPaymentId = "dsfsdfsdfsdffdsfgs21516356";
        String cardNumberType = "4111XXXXXXXX1234";
        String shortCardNum = "1234";

        String clientIdentifier = invoiceDTO.getBuyerParty().getClientIdentifier();
        buyerParty.setClientIdentifier(clientIdentifier);
        String clientIdentifierGdd = "1454154";
        String clientInvoicingType = "E";

        String travelOfficeName = invoiceDTO.getSupplierParty().getTravelOfficeName();
        supplierParty.setTravelOfficeName(travelOfficeName);

        BillingLineInformation billingLineInformation = new BillingLineInformation();
        BookingInformation bookingInformation = new BookingInformation();
        List<CustomDataField> customDataFields;

        String actionType = "ISSUED";
        double markup = 0.0;
        String productType = "CAR";
        String lineType = "PRODUCT";
        String merchantModel = "MODEL";
        String resourceCode = "LOC";
        String resourceForVendorCalculation = "LOC";
        String paymentId = "";

        String bookerId = "124569";
        String supplierConfirmationNumber = "DSDEFD";
        String bookingDate = "20240628";

        String code = "";
        String name = "";
        String value = "";
        
        
        billingLines.add(billingLine1);
        billingLines.add(billingLine2);
        
        receivedInvoice.setBillingHeader(billingHeader);
        receivedInvoice.setBillingLines(billingLines);
        receivedInvoice.setBuyerParty(buyerParty);
        receivedInvoice.setSupplierParty(supplierParty);
        
        Invoice savedInvoice = invoiceRepository.save(receivedInvoice); // Save the invoice and get the saved entity
        //return savedInvoice.getId(); // Return the generated ID of the saved invoice
        
        String responseMessage = invoiceDeliveryService.sendRequestToDelivery();
        return responseMessage;
        
    }
    
    public Optional<Invoice> findById(Long id) {
        return invoiceRepository.findById(id); // Returns Optional<Invoice>
    }

}
