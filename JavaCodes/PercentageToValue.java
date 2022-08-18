package PercentageToValue;
import java.util.Scanner;//importing the scanner class

public class PercentageToValue {

	public static void main(String[] args) { //creating main method
		Scanner sc=new Scanner(System.in); //creating new object of scanner class and storing it in sc variable
		System.out.println("Enter Your percentage : ");
		float a=sc.nextFloat();//taking input about the percentage user got and assigning it into a
		System.out.println("Enter Total value : ");
		float b=sc.nextFloat();//taking input about total value and assigning it into b 
		
		float c=(a/100)*b;//logic
		System.out.println("You got "+c+" marks");//printing the number that user got 

	}

}
