package LAB2;

import java.util.Scanner;

public class factoriall {
	
	public static long factorial (int num) {
		
			if (num>=1) {
				return num*factorial(num-1);
			}
			else {
				return 1;
				
			}
		
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = in.nextInt();
		System.out.println("The factorial of the number"+num+" is : "+factorial(num));
	}

}
