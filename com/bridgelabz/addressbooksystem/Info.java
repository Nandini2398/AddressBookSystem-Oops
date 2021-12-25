package com.bridgelabz.addressbooksystem;
import java.util.Scanner;

	public  class Info {
	    public void contactInfo() {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter details of person");
	        System.out.println("Add first name");
	        Person.firstName = sc.next();
	        System.out.println("Add last name");
	        Person.lastName= sc.next();
	        System.out.println("Add address");
	        Person.address = sc.next();
	        System.out.println("Add state");
	        Person.state= sc.next();
	        System.out.println("Add zip");
	        Person.zip = sc.nextInt();
	        System.out.println("Add phone number");
	        Person.phoneNumber = sc.nextLong();
	        System.out.println("Add email");
	        Person.email = sc.next();
	    }
}	
