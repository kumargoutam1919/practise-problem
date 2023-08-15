package bitwiseSwiper;
import java.util.Scanner;

public class swipper {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a first Integer");
		int a = scan.nextInt();
		System.out.println("Enter a second Integer");
		int b = scan.nextInt();
		swapUsingBitwise(a,b);
		
		
	}
	
	public static void swapUsingBitwise(int x ,int y) {
		x =x^y;
		y =x^y;
		x =x^y;
		System.out.println("Afterswapping : first = "+x+",second ="+y+"");
	}

}
