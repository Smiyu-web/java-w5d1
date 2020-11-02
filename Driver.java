package ca.java.exercise;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
	
	public static Scanner input = new Scanner(System.in);
	
	public static void printHourlyEmployee(ArrayList<HourlyEmployee> hourly) {
		System.out.println("Hourly employee's lists : ");
		for (HourlyEmployee h : hourly) {
			System.out.println(h.toString());	
		}
	}
	
	public static void printSalesEmployees(ArrayList<SalesEmployee> sales) {
		System.out.println("Sales Employee's lists : ");
		for (SalesEmployee s : sales) {
			System.out.println(s.toString());	
		}
	}
	
	public static String findEmployee(ArrayList<Employee> employees) {
		System.out.print("Enter employee's last name : ");
		String enteredName = input.next();
		
		if (!enteredName.isEmpty() && !enteredName.equalsIgnoreCase(null)) {
			for (Employee e : employees) {
				if (e.getLastName().equalsIgnoreCase(enteredName)) {
					return e.toString();
				} 
			}
		} 
		
		return "Couldn't find the employee";	
	}

	public static void main(String[] args) {
		ArrayList<HourlyEmployee> hourlyEmployees = new ArrayList<HourlyEmployee>();
		HourlyEmployee h1 = new HourlyEmployee("Sarah", "Apple", "sarahgmail.com", LocalDate.of(2019, 2, 3), "604-111-4567", 13.25, 34);
		HourlyEmployee h2 = new HourlyEmployee("Dan", "Orange", "dan@gmail.com", LocalDate.of(2011, 10, 23), "604-222-4567", 15.50, 37);
		
		hourlyEmployees.add(h1);
		hourlyEmployees.add(h2);
		
		printHourlyEmployee(hourlyEmployees);
		
		ArrayList<SalesEmployee> salesEmployees = new ArrayList<SalesEmployee>();
		SalesEmployee s1 = new SalesEmployee("Jenny", "Smith", "jenny@telus.net", LocalDate.of(2012, 7, 1), "77-444-4567", 20, 525.0);
		SalesEmployee s2 = new SalesEmployee("Davie", "Scott", "Davie@telus.net", LocalDate.of(2013, 6, 11), "778-555-4567", 13, 890.0);
		
		salesEmployees.add(s1);
		salesEmployees.add(s2);
		
		printSalesEmployees(salesEmployees);
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(h1);
		employees.add(h2);
		employees.add(s1);
		employees.add(s2);

		System.out.println(findEmployee(employees));
		
	}

}
