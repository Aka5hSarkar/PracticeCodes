package swapmethod3;
import java.util.Scanner;

public class SwapMethod3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st number : ");
		float a=sc.nextFloat();
		System.out.println("Enter the 2nd number : ");
		float b=sc.nextFloat();
		System.out.println("before swapping the 1st number : "+a+" and the 2nd number : "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swapping the 1st number : "+a+" and the 2nd number : "+b);
		
	}

}
