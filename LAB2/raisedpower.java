package LAB2;

import java.util.Scanner;

public class raisedpower {

	public static double power(double x, int n) {
	    if (n == 0)
	        return 1;
	    if (n == 1)
	        return x;
	    else
	        return x * (power(x, n-1));

	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the value for x : ");
		double x = in.nextDouble();
		System.out.print("Enter the value for n :  ");
		int n = in.nextInt();
		System.out.print("the value of "+x+" raised to the power of "+n+" is "+power(x,n));
	}
	
	

}
