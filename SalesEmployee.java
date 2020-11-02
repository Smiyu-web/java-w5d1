package ca.java.exercise;

import java.time.LocalDate;

public class SalesEmployee extends Employee{
	
	private double commitionRate;
	private double totalSales;
	
	public SalesEmployee(String firstName, String lastName, String email, LocalDate startDate, 
			String phoneNumber, double commitionRate, double totalSales) {
		super(firstName, lastName, email, startDate, phoneNumber);
		setCommitionRate(commitionRate);
		setTotalSales(totalSales);
	}
	
	public double getCommitionRate() {
		return commitionRate;
	}
	
	public void setCommitionRate(double commitionRate) {
		if (commitionRate > 0) {
			  this.commitionRate = commitionRate;
		} else {
			this.commitionRate = 0;
		}
	}
	
	public double getTotalSales() {
		return totalSales;
	}
	
	public void setTotalSales(double totalSales) {
		if (totalSales > 0) {
			  this.totalSales = totalSales;
		} else {
			this.totalSales = 0;
		}
	}
	
	@Override
	public double calculateIncome() {
		return totalSales * commitionRate / 100;
	}
	
	public String toString() {
		return super.toString() + 
			   "Commition Rate : " + commitionRate + "\n" +
	           "Total sales : " + totalSales + "\n" +
			   "Total Income : " + calculateIncome() + "\n";
	}
	
	
	

}
