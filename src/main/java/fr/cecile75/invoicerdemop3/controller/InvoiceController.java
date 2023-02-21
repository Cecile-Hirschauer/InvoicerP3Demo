package fr.cecile75.invoicerdemop3.controller;

import fr.cecile75.invoicerdemop3.entity.Invoice;
import fr.cecile75.invoicerdemop3.service.InvoiceServiceInterface;

import java.util.Scanner;

public class InvoiceController implements InvoiceControllerInterface {
    private InvoiceServiceInterface invoiceService;


    public InvoiceServiceInterface getInvoiceService() {
        return invoiceService;
    }

    public void setInvoiceService(InvoiceServiceInterface invoiceService) {
        this.invoiceService = invoiceService;
    }

    public void createInvoice() {
        System.out.println("Customer name");
        Scanner sc = new Scanner(System.in);
        String customerName = sc.nextLine();
        Invoice invoice = new Invoice();
        invoice.setCustomerName(customerName);
        invoiceService.createInvoice(invoice);
    }
}
