package  PercentageCalculator;

import java.util.Scanner;//importing the scanner class

public class PercentageCalculator {

	public static void main(String[] args) {  //declaring main method
		System.out.println("Percentile calculator");
		Scanner sc=new Scanner(System.in);//creating new scanner object and storing it in sc variable
		System.out.println("enter the number you get : ");
		float a=sc.nextFloat();//taking input from user and assigning it to a 
		System.out.println("Enter total number :");
		float b=sc.nextFloat();//taking input from user and assigning it to b
		
		float c=(a/b)*100;//logic
		System.out.println("your percentage is : "+c);//printing the percentage
		
	}

}
