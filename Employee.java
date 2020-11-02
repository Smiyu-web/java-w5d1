package ca.java.exercise;

import java.time.LocalDate;
import java.util.Objects;
import java.util.regex.Pattern;

public abstract class Employee {

	private String firstName;
	private String lastName;
	private String email;
	private LocalDate startDate;
	private String phoneNumber;
	
	public abstract double calculateIncome();
	
	
	public Employee(String firstName, String lastName, String email, LocalDate startDate, String phoneNumber) {
		super();
		setFirstName(firstName);
		setLastName(lastName);
		setEmail(email);
		setStartDate(startDate);
		setPhoneNumber(phoneNumber);
	}
	


	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		if (!firstName.isEmpty() || !firstName.equalsIgnoreCase(null)) {
			this.firstName = firstName;
		} else {
			this.firstName = "Unknown";
		}
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		if (!lastName.isEmpty() || !lastName.equalsIgnoreCase(null)) {
			this.lastName = lastName;
		} else {
			this.lastName = "Unknown";
		}
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		String pattern = "^([a-zA-Z0-9])+([a-zA-Z0-9\\._-])*@([a-zA-Z0-9_-])+([a-zA-Z0-9\\._-]+)+$";
	    Pattern p = Pattern.compile(pattern);
		if (!email.isEmpty() && !email.equalsIgnoreCase(null)) {
			
			if (p.matcher(email).find()) {
				this.email = email;
			} else {
				this.email = "Invalid email address";
			}
			
		} else {
			this.email = "Unknown";
		}
	}
	
	public LocalDate getStartDate() {
		return startDate;
	}
	
	public void setStartDate(LocalDate startDate) {
		if (Objects.nonNull(startDate)) {
			this.startDate = startDate;
		} else {
			this.startDate = LocalDate.now();
		}
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		String pattern = "^\\d{3}-\\d{3}-\\d{4}$";
		Pattern p = Pattern.compile(pattern);
		if (!phoneNumber.isEmpty() && !phoneNumber.equalsIgnoreCase(null)) {
			
			if (p.matcher(phoneNumber).find()) {
			this.phoneNumber = phoneNumber;
			} else {
			this.phoneNumber = "Invalid phone number";
			}
			
		} else {
			this.phoneNumber = "Unknown";
		}
	}
	
	public String toString() {
		return "Employee name : " + firstName + " " + lastName + "\n" +
	           "Email : " + email + "\n" +
			   "Phone Number : " + phoneNumber + "\n" +
	           "Start Date : " + startDate + "\n";
	}
	
}
