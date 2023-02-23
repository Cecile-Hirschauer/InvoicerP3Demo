package fr.cecile75.invoicerdemop3.repository.database;

import fr.cecile75.invoicerdemop3.entity.Invoice;
import fr.cecile75.invoicerdemop3.repository.InvoiceRepositoryInterface;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class InvoiceRepositoryDatabase implements InvoiceRepositoryInterface {
    private static List invoices = new ArrayList<>();

    public void create(Invoice invoice) {
        invoices.add(invoice);
        // System.out.println("je suis dans repository garage");

        System.out.println(invoice.getInvoiceNumber() + " - " + invoice.getCustomerName());
    }
}
