package fr.cecile75.invoicerdemop3.controller;

import fr.cecile75.invoicerdemop3.entity.Invoice;
import fr.cecile75.invoicerdemop3.service.InvoiceServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;


public class InvoiceControllerWeb implements InvoiceControllerInterface {
    @Autowired

    private InvoiceServiceInterface invoiceService;
    private String customerName;


    public InvoiceServiceInterface getInvoiceService() {
        return invoiceService;
    }

    public void setInvoiceService(InvoiceServiceInterface invoiceService) {
        this.invoiceService = invoiceService;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public void createInvoice() {
        String customerName = "Tesla";
        Invoice invoice = new Invoice();
        // System.out.println("je suis dans controller garage");

        invoice.setCustomerName(customerName);
        invoiceService.createInvoice(invoice);
    }
}
