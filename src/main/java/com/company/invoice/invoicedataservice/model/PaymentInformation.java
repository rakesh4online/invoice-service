package com.company.invoice.invoicedataservice.model;

import lombok.Data;


    @Data
    public  class PaymentInformation {
        private String payment_method;
        private String card_type;
        private String payment_instrument_id;
        private String form_of_payment_id;
        private String card_number_type;
        private String short_card_num;
    }

