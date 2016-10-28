package ca.mcgill.ecse321.loyaltypoints;

import java.util.Date;
import java.util.Scanner;

public class Purchase {
	
	public static String Name() {
		String name;
		
		try(Scanner input = new Scanner(System.in)) {
			System.out.print("Enter the shoppers name: ");
			name = input.next();
		}
		return name;
	}
	
	public static double Price() {		
		double price;
		
		try(Scanner input2 = new Scanner(System.in)) {
			System.out.println("Enter the total price of the groceries: ");
			price = input2.nextDouble(); 
			
			while (price <= 0) {
				System.out.println("Please enter a price value greater than 0! ");
				System.out.println("Enter the total price of the groceries: ");
				price = input2.nextDouble();
			}
		}
		return price;
	}
	
	public static Date Date() {
		Date date = new Date();
		return date;
	}
	
	private PointsStrategy strategy;
	
	public Purchase(PointsStrategy strategy) {
		this.strategy = strategy;
	}
	
	public int executeStrategy(double price) {
		return (int) strategy.getPoints(price);
	}
}