/*
1. You are going to a shop to buy chocolates and cookies.
Each chocolate costs ₹15
Each cookie costs ₹10
You have ₹450 in total
If you decide to buy 10 chocolates and 5 cookies, write a Java program to calculate how much money will remain after your purchase.
package com.languagefundamentals;
*/

package com.languagefundamentals;

public class Pratice {

	public static void main(String[] args) {
		int totalMoney = 450;
        int chocolatePrice = 15;
        int cookiePrice = 10;

        int chocolates = 10;
        int cookies = 5;

        int chocolateCost = chocolates * chocolatePrice;
        int cookieCost = cookies * cookiePrice;

        int totalCost = chocolateCost + cookieCost;
        int remainingMoney = totalMoney - totalCost;

        System.out.println("Chocolate cost: ₹" + chocolateCost);
        System.out.println("Cookie cost: ₹" + cookieCost);
        System.out.println("Total purchase cost: ₹" + totalCost);
        System.out.println("Money remaining: ₹" + remainingMoney);
		
		

	}

}
