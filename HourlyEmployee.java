package ca.java.exercise;

import java.time.LocalDate;

public class HourlyEmployee extends Employee{

	private double payRate;
	private double hoursWorking;
	
	public HourlyEmployee(String firstName, String lastName, String email, LocalDate startDate, 
			String phoneNumber, double payRate, double hoursWorking) {
		super(firstName, lastName, email, startDate, phoneNumber);
		setPayRate(payRate);
		setHoursWorking(hoursWorking);
	}

	public double getPayRate() {
		return payRate;
	}
	
	public void setPayRate(double payRate) {
		if (payRate > 0) {
		  this.payRate = payRate;
		} else {
			this.payRate = 0;
		}
	}
	
	public double getHoursWorking() {
		return hoursWorking;
	}
	
	public void setHoursWorking(double hoursWorking) {
		if (hoursWorking > 0 && hoursWorking <= 40) {
			  this.hoursWorking = hoursWorking;
		} else {
			this.hoursWorking = 0;
		}
	}
	
	@Override
	public double calculateIncome() {
		return hoursWorking * payRate;
	}
	
	public String toString() {
		return super.toString() +
			   "Pay Rate : " + payRate + "\n" +
	           "Working Hours : " + hoursWorking + "\n" +
			   "Total Income : " + calculateIncome() + "\n";
	}
	
	
	

}
