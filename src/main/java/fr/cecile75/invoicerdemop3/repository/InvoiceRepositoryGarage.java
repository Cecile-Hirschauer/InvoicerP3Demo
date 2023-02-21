package fr.cecile75.invoicerdemop3.repository;

import fr.cecile75.invoicerdemop3.entity.Invoice;

import java.util.ArrayList;
import java.util.List;

public class InvoiceRepositoryGarage implements InvoiceRepositoryInterface{
    private static List invoices = new ArrayList<>();

    public void create(Invoice invoice) {
        invoices.add(invoice);
        System.out.println(invoice.getInvoiceNumber() + " - " + invoice.getCustomerName());
    }
}
