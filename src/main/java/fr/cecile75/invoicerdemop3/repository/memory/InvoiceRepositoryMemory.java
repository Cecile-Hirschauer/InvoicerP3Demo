package fr.cecile75.invoicerdemop3.repository.memory;

import fr.cecile75.invoicerdemop3.entity.Invoice;
import fr.cecile75.invoicerdemop3.repository.InvoiceRepositoryInterface;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class InvoiceRepositoryMemory implements InvoiceRepositoryInterface {
    private static List invoices = new ArrayList<>();

    public void create(Invoice invoice) {
        invoices.add(invoice);
        System.out.println("Invoice No: " + invoice.getInvoiceNumber() + " for: " + invoice.getCustomerName());
    }
}
