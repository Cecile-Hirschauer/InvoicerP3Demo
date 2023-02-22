package fr.cecile75.invoicerdemop3.service;

import fr.cecile75.invoicerdemop3.entity.Invoice;
import fr.cecile75.invoicerdemop3.repository.InvoiceRepositoryInterface;

public interface InvoiceServiceInterface {
    void createInvoice(Invoice invoice);

    void setInvoiceRepository(InvoiceRepositoryInterface invoiceRepository);
}
