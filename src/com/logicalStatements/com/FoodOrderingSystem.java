//Create a Java program for a Food Ordering System using switch-case.
//Requirements:
//Display the following menu:
//1 → Pizza – ₹200
//2 → Burger – ₹120
//3 → Biryani – ₹180
//4 → Noodles – ₹100
//Ask the user to select an item and enter the quantity.
//Calculate the total bill = item price × quantity.
//Output:
//Display the selected item, price, quantity, and total bill.

package com.logicalStatements.com;

import java.util.Scanner;

public class FoodOrderingSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("---- Food Menu ----");
		System.out.println("1 -> Pizza - Rs.200");
		System.out.println("2 -> Burger - Rs.120");
		System.out.println("3 -> Biryani - Rs.180");
		System.out.println("4 -> Noodles - Rs.100");
		System.out.println("-------------------");

		System.out.print("Enter your choice (1-4): ");
		int choice = sc.nextInt();

		System.out.print("Enter quantity: ");
		int qty = sc.nextInt();

		String itemName = "";
		int price = 0;

		switch (choice) {
		case 1:
			itemName = "Pizza";
			price = 200;
			break;
		case 2:
			itemName = "Burger";
			price = 120;
			break;
		case 3:
			itemName = "Biryani";
			price = 180;
			break;
		case 4:
			itemName = "Noodles";
			price = 100;
			break;
		default:
			System.out.println("Invalid choice! Please select 1 to 4.");
			sc.close();
			return; // exit program
		}

		int totalBill = price * qty;

		System.out.println("\n----- BILL -----");
		System.out.println("Selected Item : " + itemName);
		System.out.println("Price per Item: Rs." + price);
		System.out.println("Quantity      : " + qty);
		System.out.println("Total Bill    : Rs." + totalBill);
		System.out.println("----------------");
		
		sc.close();

	}

}
