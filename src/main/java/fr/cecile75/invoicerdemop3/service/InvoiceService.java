package fr.cecile75.invoicerdemop3.service;

import fr.cecile75.invoicerdemop3.entity.Invoice;
import fr.cecile75.invoicerdemop3.repository.InvoiceRepositoryInterface;

public class InvoiceService implements InvoiceServiceInterface{
    private static long lastNumber = 0L;
    private InvoiceRepositoryInterface invoiceRepository;

    public InvoiceRepositoryInterface getInvoiceRepository() {
        return invoiceRepository;
    }

    public void setInvoiceRepository(InvoiceRepositoryInterface invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    public void createInvoice(Invoice invoice) {
        invoice.setInvoiceNumber(String.valueOf(++lastNumber));
        invoiceRepository.create(invoice);
    }
}
