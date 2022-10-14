package LAB2;
import java.util.Scanner;
public class digitsum {
	
	public static int sum(int num) {
		if (num == 0) {
			return 0;
		}
		
		return (num % 10 + sum(num / 10));
	
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = in.nextInt();
		System.out.println("The sum of the digits is : "+ sum(num));
	}

}
