package logicaloperator;

import java.util.Scanner;

public class validator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Is input valid (true/false)");
		boolean valid = scan.nextBoolean();
		System.out.println("Does meet a certain condition(true/false):true");
		boolean condition = scan.nextBoolean();
		isValidinput(valid,condition);
		
		
		
	}
	
	public static  void isValidinput(boolean a ,boolean b) {
		if(a&&b) {
			System.out.println("input is valid");
		}
		else {
			System.out.println("input is invalid");
		}
	}

}
