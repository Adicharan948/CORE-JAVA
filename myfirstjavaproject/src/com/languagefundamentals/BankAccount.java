//Java:
//1) Create a Java class BankAccount with a static variable balance initialized to 1000, 
//create deposit(int amount) and withdraw(int amount) methods to update the balance, and in the main() method perform a deposit of 500, a withdrawal of 300, and print the final balance.


package com.languagefundamentals;

public class BankAccount {
	
	int bal=1000;
	
	
	void deposit(int amount) {
		bal=bal+amount;
		
	}
	
	void withdraw(int amount) {
		
		bal=bal-amount;
		
	}

	public static void main(String[] args) {
		
		BankAccount b=new BankAccount();
		
		 System.out.println(b.bal);
		 b.deposit(500);
		 b.withdraw(300);
		 
		 System.out.println(b.bal);
		 
	}

}
