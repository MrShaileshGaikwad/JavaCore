package com.guvi;

/*Main Class:
    - Demonstrates adding customers, displaying all bills, displaying an individual customer's bill, 
    removing a customer, and displaying all bills after removal.

This system is simple but demonstrates the core functionality of an electricity bill management 
system with encapsulation and getter/setter methods in Java.*/

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Assuming the rate per unit is $0.12
        ElectricityBillManagement billManagement = new ElectricityBillManagement(0.12);

        // Adding customers
        billManagement.addCustomer(new Customer(1, "Alice", 150));
        billManagement.addCustomer(new Customer(2, "Bob", 250));
        billManagement.addCustomer(new Customer(3, "Charlie", 350));

        // Display all bills
        billManagement.displayAllBills();

        // Display individual customer bill
        billManagement.displayCustomerBill(2);

        // Remove a customer
        billManagement.removeCustomer(3);

        // Display all bills after removal
        billManagement.displayAllBills();
	}

}
