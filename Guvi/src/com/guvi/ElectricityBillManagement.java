package com.guvi;

import java.util.ArrayList;
import java.util.List;
/*
 * ElectricityBillManagement Class:
    - The ElectricityBillManagement class maintains a list of customers and a rate per unit of electricity.
 * - Methods include addCustomer to add a customer, removeCustomer to remove a customer,
 *  displayCustomerBill to display a single customer's bill, and
 *  displayAllBills to display all customers' bills.*/
public class ElectricityBillManagement {
private List<Customer> customers;
private double ratePerUnit;

public ElectricityBillManagement(double ratePerUnit) {
	this.customers=new ArrayList<Customer>();
	this.ratePerUnit =ratePerUnit;
}

public void addCustomer(Customer customer) {
    customers.add(customer);
}

public void removeCustomer(int customerId) {
    customers.removeIf(customer -> customer.getCustomerId() == customerId);
}

public void displayCustomerBill(int customerId) {
    for (Customer customer : customers) {
        if (customer.getCustomerId() == customerId) {
            System.out.println("Customer ID: " + customer.getCustomerId());
            System.out.println("Customer Name: " + customer.getName());
            System.out.println("Units Consumed: " + customer.getUnitsConsumed());
            System.out.println("Total Bill: $" + customer.calculateBill(ratePerUnit));
            return;
        }
    }
    System.out.println("Customer ID " + customerId + " not found.");
}

public void displayAllBills() {
    for (Customer customer : customers) {
        displayCustomerBill(customer.getCustomerId());
        System.out.println();
    }
}


}
