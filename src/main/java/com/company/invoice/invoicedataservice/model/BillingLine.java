package com.company.invoice.invoicedataservice.model;

import lombok.Data;
import java.util.List;

import jakarta.persistence.*;


@Data
@Entity
public class BillingLine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BillingLineInformation billing_line_information;
    private BookingInformation booking_information;
    private PriceInformation price_information;
    private TicketInformation ticket_information;
    private TravelerInformation traveler_information;
    private SupplierInformation supplier_information;
    private List<CustomDataField> custom_data_fields;

    @Data
    public static class BillingLineInformation {
        private String action_type;
        private double markup;
        private String product_type;
        private String line_type;
        private String merchant_model;
        private String resource_code;
        private String resource_for_vendor_calculation;
        private String payment_id;
    }

    @Data
    public static class BookingInformation {
        private String booker_id;
        private String supplier_confirmation_number;
        private String booking_date;
    }

    @Data
    public static class PriceInformation {
        private TotalPrice total_price;
        private BasePrice base_price;
        private List<TaxBreakdown> tax_breakdown;

        
    }

    @Data
    public static class TicketInformation {
        private String ticket_number;
        private String geography_type;
        private List<CarSegment> car_segments;
        private boolean is_intercompany_ticket;
        private String ticket_departure_date;

        @Data
        public static class CarSegment {
            private String confirmation_number;
            private String pickup_date;
            private String dropoff_date;
            private String supplier_code;
            private String currency_code;
        }
    }

    @Data
    public static class TravelerInformation {
        private String traveler_id;
        private String traveler_name_alias;
        private List<String> traveler_emails;
    }

    @Data
    public static class SupplierInformation {
        private String supplier_code;
        private String supplier_name;
    }


}
