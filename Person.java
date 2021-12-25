package com.bridgelabz.addressbooksystem;

public class Person {

		static contact [] personDetails = new contact[10];
		public static void main(String args[]) {
			contact person1 = new contact("Nandini","Prudhvi","Raj","AP",24,1416,"prudhviraj@gmail.com");
			contact person2 = new contact("Bablu","Hemanth","SaiDurga","AP",23,1614,"bablu@gmail.com");
			contact person3 = new contact("vamsi","Krishna","Nagar","AP",47,7620,"vamsi@outlook.com");
		    personDetails[0]=person1;
		    personDetails[1]=person2;
		    personDetails[2]=person3;
		    System.out.println("Created contact list is");
		    for(int i = 0; i < 3;i++) {
			   System.out.println(personDetails[i]);
		    }
		    operations();
		}
		public static void operations() {
			int j = 0;
		    System.out.println("Enter your choice");
		    System.out.println("1)Add contact");
		    int choice = sc.nextInt();
		    switch(choice) {
		    	case 1:
		    			System.out.println("Enter details of person");
			    		System.out.println("Add first name");
			    		firstName = sc.next();
			    		System.out.println("Add last name");
			    		lastName= sc.next();
			    		System.out.println("Add address");
			    		address = sc.next();
			    		System.out.println("Add state");
			    		state= sc.next();
			    		System.out.println("Add zip");
			    		zip = sc.nextInt();
			    		System.out.println("Add phone number");
			    		phoneNumber = sc.nextLong();
			    		System.out.println("Add email");
			    		email = sc.next();
			    		Contact person4 = new Contact(firstName,lastName,address,state,zip,phoneNumber,email);
			    		personDetails[3]=person4;
			    		j++;
				 for(int i = 0; i < 3 + j;i++) {
					   System.out.println(personDetails[i]);
				 }
			}
		}
		public static void contactInfo() {
			System.out.println("Enter details of person");
			System.out.println("Add first name");
			firstName = sc.next();
			System.out.println("Add last name");
			lastName= sc.next();
			System.out.println("Add address");
			address = sc.next();
			System.out.println("Add state");
			state= sc.next();
			System.out.println("Add zip");
			zip = sc.nextInt();
			System.out.println("Add phone number");
			phoneNumber = sc.nextLong();
			System.out.println("Add email");
			email = sc.next();
		}
	}
}