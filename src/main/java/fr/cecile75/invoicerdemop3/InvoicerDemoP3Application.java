package fr.cecile75.invoicerdemop3;

import fr.cecile75.invoicerdemop3.controller.InvoiceController;
import fr.cecile75.invoicerdemop3.controller.InvoiceControllerGarage;

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
             InvoiceControllerGarage garageInvoice = new InvoiceControllerGarage();
             garageInvoice.createInvoice();
         } else if (choice == 2) {
             InvoiceController otherInvoice = new InvoiceController();
             otherInvoice.createInvoice();
         }
        else {
            System.out.println("Error !");
         }

    }

}
