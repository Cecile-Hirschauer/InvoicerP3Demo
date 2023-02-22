package fr.cecile75.invoicerdemop3.repository;

import fr.cecile75.invoicerdemop3.entity.Invoice;

import java.util.ArrayList;
import java.util.List;

public class InvoiceRepositoryMemory implements  InvoiceRepositoryInterface {
    private static List invoices = new ArrayList<>();

    public void create(Invoice invoice) {
        invoices.add(invoice);
        System.out.println("Invoice No: " + invoice.getInvoiceNumber() + " for: " + invoice.getCustomerName());
    }
}
