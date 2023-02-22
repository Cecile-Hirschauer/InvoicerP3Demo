package fr.cecile75.invoicerdemop3.controller;

import fr.cecile75.invoicerdemop3.entity.Invoice;
import fr.cecile75.invoicerdemop3.service.InvoiceServiceInterface;

public class InvoiceControllerScanner implements InvoiceControllerInterface {
    InvoiceServiceInterface invoiceService;

    public InvoiceServiceInterface getInvoiceService() {
        return invoiceService;
    }

    @Override
    public void setInvoiceService(InvoiceServiceInterface invoiceService) {
        this.invoiceService = invoiceService;
    }

    @Override
    public void createInvoice() {
        String customerName = "Shop1";
        Invoice invoice = new Invoice();
        invoice.setCustomerName(customerName);
        System.out.println("With Scanner");
        invoiceService.createInvoice(invoice);

    }
}
