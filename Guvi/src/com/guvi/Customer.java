package com.guvi;

/*1. Customer Class:
    - The Customer class encapsulates customer details including customer ID, name, and units consumed.
    - It includes getter and setter methods for each field.
    - The calculateBill method calculates the bill based on the units consumed and a given rate per unit.
*/

public class Customer {

	private int CustomerId;
	private String Name;
	private double unitsConsumed;
	
	public Customer(int CustomerId,String Name,Double unitsConsumed)
	{
		this.CustomerId=CustomerId;
		this.Name=Name;
		this.unitsConsumed=unitsConsumed;
	}
	
	public Customer(int customerId2, String name2, int i) {
		// TODO Auto-generated constructor stub
	}

	public int getCustomerId() {
		return CustomerId;
	}
	
	public void setCustomerId(int CustomerId) {
		this.CustomerId=CustomerId;
	}
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getUnitsConsumed() {
		return unitsConsumed;
	}

	public void setUnitsConsumed(double unitsConsumed) {
		this.unitsConsumed = unitsConsumed;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public double calculateBill(double ratePerUnit) {
		return unitsConsumed * ratePerUnit;
	}

}
