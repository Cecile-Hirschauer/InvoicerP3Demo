package fr.cecile75.invoicerdemop3.service;

import fr.cecile75.invoicerdemop3.entity.Invoice;
import fr.cecile75.invoicerdemop3.repository.InvoiceRepository;

public class InvoiceService {
    private static long lastNumber = 0L;
    private InvoiceRepository invoiceRepository = new InvoiceRepository();

    public void createInvoice(Invoice invoice) {
        invoice.setInvoiceNumber(String.valueOf(++lastNumber));
        invoiceRepository.create(invoice);
    }
}
