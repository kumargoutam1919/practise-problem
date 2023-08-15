package calculatordilemna;
import java.util.Scanner;

public class demo {
	
	public static void main(String[] args) {
		int a;
		int b;
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		System.out.println("Enter a value of "+a);
		int b = scan.nextInt();
		System.out.println("Enter a value of "+b);
		
		while(true) {
			 System.out.println("Select an Option...");
	          System.out.println("1. Add");
	          System.out.println("2. Subtract");
	          System.out.println("3. Multiply");
	          System.out.println("Exit");
	          
	          String choice =scan.next();
	          
	          switch(choice){
              case "1":
                  System.out.println("Sum = "+(a+b));
                  break;
              case "2":
                  System.out.println("Subtract = "+(a-b));
                  break;
              case "3":
                  System.out.println("Multiply = "+(a*b));
                  break;
              case "4":
                  System.exit(0);
              default:
                  System.out.println("Wrong Choice!!");
                  break;
		}
		
		
		
	}
	

}
}
