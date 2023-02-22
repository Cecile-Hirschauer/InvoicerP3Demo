package fr.cecile75.invoicerdemop3;

import fr.cecile75.invoicerdemop3.controller.InvoiceControllerInterface;

import fr.cecile75.invoicerdemop3.repository.InvoiceRepositoryInterface;
import fr.cecile75.invoicerdemop3.service.InvoiceServiceInterface;

import java.util.Scanner;

public class InvoicerDemoP3Application {

    public static void main(String[] args) {

        //SpringApplication.run(InvoicerDemoP3Application.class, arg);
        System.out.println("Choose 1 or 2 or 3 or 4");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quelle est la classe de mon controller");
        String controllerClass = scanner.next();
        System.out.println("Quelle est la classe de mon service");
        String serviceClass = scanner.next();
        System.out.println("Quelle est la classe de mon repository");
        String repositoryClass = scanner.next();


        InvoiceControllerInterface invoiceController = null;
        InvoiceServiceInterface invoiceService = null;
        InvoiceRepositoryInterface invoiceRepository = null;

        try {
            invoiceController = (InvoiceControllerInterface) Class.forName(controllerClass).getDeclaredConstructor().newInstance();
            invoiceService = (InvoiceServiceInterface) Class.forName(serviceClass).getDeclaredConstructor().newInstance();
            invoiceRepository = (InvoiceRepositoryInterface) Class.forName(repositoryClass).getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        invoiceController.setInvoiceService(invoiceService);
        invoiceService.setInvoiceRepository(invoiceRepository);
        invoiceController.createInvoice();

    }
}
