package fr.cecile75.invoicerdemop3.controller;

import fr.cecile75.invoicerdemop3.entity.Invoice;
import fr.cecile75.invoicerdemop3.service.InvoiceServiceInterface;

import java.util.Scanner;

public class InvoiceControllerGarage implements InvoiceControllerInterface {
    private InvoiceServiceInterface invoiceService;


    public void createInvoice() {
        String customer = "Tesla";
        Invoice invoice = new Invoice();
        invoice.setCustomerName(customer);
    }

        public InvoiceServiceInterface getInvoiceService() {
            return invoiceService;
        }

        public void setInvoiceService(InvoiceServiceInterface invoiceService) {
            this.invoiceService = invoiceService;
        }
}
