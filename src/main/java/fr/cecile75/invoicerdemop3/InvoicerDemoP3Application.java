package fr.cecile75.invoicerdemop3;

import fr.cecile75.invoicerdemop3.controller.InvoiceController;
import fr.cecile75.invoicerdemop3.controller.InvoiceControllerGarage;

import fr.cecile75.invoicerdemop3.repository.InvoiceRepository;
import fr.cecile75.invoicerdemop3.repository.InvoiceRepositoryGarage;
import fr.cecile75.invoicerdemop3.service.InvoiceService;
import fr.cecile75.invoicerdemop3.service.InvoiceServiceGarage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

public class InvoicerDemoP3Application {

    public static void main(String[] args) {

        //SpringApplication.run(InvoicerDemoP3Application.class, arg);
        System.out.println("Choose 1 if you are Garage, 2 for other");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

         if (choice == 1) {
             InvoiceController invoiceController = new InvoiceController();
             InvoiceService invoiceService = new InvoiceService();
             invoiceController.setInvoiceService(invoiceService);
             InvoiceRepository invoiceRepository = new InvoiceRepository();
             invoiceService.setInvoiceRepository(invoiceRepository);
             invoiceController.createInvoice();
         } else if (choice == 2) {
             // System.out.println("je suis dans 2");
             InvoiceControllerGarage invoiceController = new InvoiceControllerGarage();
             InvoiceServiceGarage invoiceService = new InvoiceServiceGarage();
             invoiceController.setInvoiceService(invoiceService);

             InvoiceRepositoryGarage invoiceRepository = new InvoiceRepositoryGarage();
             invoiceService.setInvoiceRepository(invoiceRepository);
             invoiceController.createInvoice();
         }
        else {
            System.out.println("Error !");
         }

    }

}
