import java.util.Scanner;
/*
 * Class to get user input and setup cost values
 */
public class Costs {
	//setup input
	Scanner kbd = new Scanner(System.in);
	
	//Travel Costs
	public double gettravelCosts() {
		double travel = 0;
		int err = 1;
		
		while (err ==1) {
			try {
				System.out.print("Enter Travel Costs: $");
				travel = kbd.nextDouble();
				err = 0;
			} catch (Exception e) {
				System.out.println("Not a vaild entry, please only enter positive numbers. No symbols other than the decimal place.");
				kbd.nextLine();
			}
		}
		
		return travel;
	}
	
	//Hotel Costs
	public double gethotelCosts() {
		double hotel = 0;
		int err = 1;

		while (err ==1) {
			try {
				System.out.print("Enter Hotel Costs: $");
				hotel = kbd.nextDouble();
				err = 0;
			} catch (Exception e) {
				System.out.println("Not a vaild entry, please only enter positive numbers. No symbols other than the decimal place.");
				kbd.nextLine();
			}
		}
		
		return hotel;
	}
	
	//Rental Costs
	public double getrentalCosts() {
		double rental = 0;
		int err = 1;
		
		while (err ==1) {
			try {
				System.out.print("Enter Rental Costs: $");
				rental = kbd.nextDouble();
				err = 0;
			} catch (Exception e) {
				System.out.println("Not a vaild entry, please only enter positive numbers. No symbols other than the decimal place.");
				kbd.nextLine();
			}
		}
		return rental;
	}
	
	//Labor Costs
	public double getlaborCosts() {
		double labor = 0;
		int err = 1;
		
		while (err ==1) {
			try {
				System.out.print("Enter Labor Costs: $");
				labor = kbd.nextDouble();
				err = 0;
			} catch (Exception e) {
				System.out.println("Not a vaild entry, please only enter positive numbers. No symbols other than the decimal place.");
				kbd.nextLine();
			}
		}
		
		return labor;
	}

}
