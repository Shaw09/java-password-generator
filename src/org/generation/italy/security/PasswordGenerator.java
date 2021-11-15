package org.generation.italy.security;

public class PasswordGenerator {

	public static void main(String[] args) {
		String firstname = "Pinco";
		String lastname = "Pallo";
		String prefcolor = "Magenta";
		int dateday = 12;
		int datemonth = 5;
		int dateyear = 1994;
		int dateborn = dateday + datemonth + dateyear;
		
		System.out.println("Pinco Pallo, nato il 12/05/1994, il cui colore preferito è il magenta");
		System.out.print(firstname + "-" + lastname + "-" + prefcolor + "-" + dateborn);		

	}

}
