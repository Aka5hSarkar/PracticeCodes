package SwapMethod2;
import java.util.Scanner;
public class swap_method2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number : ");
		int a=sc.nextInt();
		System.out.println("Enter second number : ");
		int b=sc.nextInt();
		System.out.println("Before swapping the first number is : "+a+" and the second number is : "+b);
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping the first number is : "+a+" and second number is : "+b);
	}

}
