package taxCalcultor;

import java.util.Scanner;

public class taxcalcultor {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a purchase amount");
		double purchaseAmount = scan.nextDouble();
		System.out.println("Enter the tax rate(in decimal form)");
		double taxrate = scan.nextDouble();
		System.out.println("Total cost including tax"+calculateTotalWithTax(purchaseAmount,taxrate));
		
		
				
	}
	
	public static double calculateTotalWithTax(double purchaseAmount ,double taxrate ) {
		return purchaseAmount +(purchaseAmount*taxrate);
	}
	


}
