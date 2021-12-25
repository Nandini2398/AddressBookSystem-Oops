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
		}
}