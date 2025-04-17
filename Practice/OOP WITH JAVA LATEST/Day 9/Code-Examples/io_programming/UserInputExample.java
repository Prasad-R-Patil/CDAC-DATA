package io_programming;

import java.util.Scanner;

public class UserInputExample {

	public static void main(String[] args) {
		// Program to accept name, age and weight of a person and display the same
		try(Scanner scr = new Scanner(System.in)){
			System.out.println("Enter your name: ");
			String name = scr.nextLine();
			System.out.println("Enter age: ");
			int age = scr.nextInt();
			System.out.println("Enter weight: ");
			float weight = scr.nextFloat();
			
			System.out.println("Here are your details: ");
			System.out.println(name + ", " + age + ", " + weight);
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}
