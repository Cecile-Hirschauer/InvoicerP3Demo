package fr.cecile75.invoicerdemop3.controller;

import fr.cecile75.invoicerdemop3.entity.Invoice;
import fr.cecile75.invoicerdemop3.service.InvoiceServiceInterface;


public class InvoiceControllerGarage implements InvoiceControllerInterface {
    private InvoiceServiceInterface invoiceService;


    public InvoiceServiceInterface getInvoiceService() {
        return invoiceService;
    }

    public void setInvoiceService(InvoiceServiceInterface invoiceService) {
        this.invoiceService = invoiceService;
    }

    public void createInvoice() {
        String customerName = "Tesla";
        Invoice invoice = new Invoice();
        // System.out.println("je suis dans controller garage");

        invoice.setCustomerName(customerName);
        invoiceService.createInvoice(invoice);
    }
}
