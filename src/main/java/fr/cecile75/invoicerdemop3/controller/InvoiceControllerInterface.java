package fr.cecile75.invoicerdemop3.controller;

import fr.cecile75.invoicerdemop3.service.InvoiceServiceInterface;

public interface InvoiceControllerInterface {

    void createInvoice();

    void setInvoiceService(InvoiceServiceInterface invoiceService);

}
