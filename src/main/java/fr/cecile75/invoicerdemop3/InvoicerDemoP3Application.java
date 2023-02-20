package fr.cecile75.invoicerdemop3;

import fr.cecile75.invoicerdemop3.entity.Invoice;
import fr.cecile75.invoicerdemop3.service.InvoiceService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

public class InvoicerDemoP3Application {

    public static void main(String[] args) {

        //SpringApplication.run(InvoicerDemoP3Application.class, arg);

        System.out.println("Customer name");
        Scanner sc = new Scanner(System.in);
        String customerName = sc.nextLine();
        Invoice invoice = new Invoice();
        invoice.setCustomerName(customerName);
        InvoiceService invoiceService = new InvoiceService();
        invoiceService.createInvoice(invoice);
    }

}
