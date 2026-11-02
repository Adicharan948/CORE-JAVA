
package com.logicalStatements.com;

import java.util.Scanner;

public class POCSWITCHCASE {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Our Restaurant!!");

        int total_price = 0;
        String choice;

        do {

            System.out.println("\nEnter Veg Item:");
            String veg_items = sc.next();

            switch (veg_items) {

                case "Gobi":
                    total_price += 120;
                    System.out.println("Gobi is 120 Rs");
                    break;

                case "Paneer":
                    total_price += 180;
                    System.out.println("Paneer is 180 Rs");
                    break;

                case "VegBiryani":
                    total_price += 150;
                    System.out.println("Veg Biryani is 150 Rs");
                    break;

                case "Mushroom":
                    total_price += 160;
                    System.out.println("Mushroom is 160 Rs");
                    break;

                case "VegManchurian":
                    total_price += 140;
                    System.out.println("Veg Manchurian is 140 Rs");
                    break;

                case "AlooGobi":
                    total_price += 100;
                    System.out.println("Aloo Gobi is 100 Rs");
                    break;

                case "MasalaDosa":
                    total_price += 80;
                    System.out.println("Masala Dosa is 80 Rs");
                    break;

                default:
                    System.out.println("Invalid Veg Item!");
            }

            System.out.println("\nDo you want to order another item? (y/n)");
            choice = sc.next();

        } while (choice.equalsIgnoreCase("y"));

        System.out.println("\n------ BILL ------");
        System.out.println("Total Price: " + total_price + " Rs");
        System.out.println("Thank You! Visit Again.");
        
        do {

            System.out.println("\nEnter Non Veg Item:");
            String Nonveg_items = sc.next();

            switch (Nonveg_items) {

                case "CB":
                    total_price += 120;
                    System.out.println("Chicken Biryani is 120 Rs");
                    break;

                case "MB":
                    total_price += 180;
                    System.out.println("Mutton Biryani is 180 Rs");
                    break;

                case "SB":
                    total_price += 150;
                    System.out.println("Special Biryani is 150 Rs");
                    break;

                case "FB":
                    total_price += 160;
                    System.out.println("Fish Biryani is 160 Rs");
                    break;

                case "KB":
                    total_price += 140;
                    System.out.println("Kochi Biryani is 140 Rs");
                    break;

                default:
                    System.out.println("Invalid NonVeg Item!");
            }

            System.out.println("\nDo you want to order another item? (y/n)");
            choice = sc.next();

        } while (choice.equalsIgnoreCase("y"));

        System.out.println("\n------ BILL ------");
        System.out.println("Total Price: " + total_price + " Rs");
        System.out.println("Thank You! Visit Again.");

        sc.close();
    }
}
