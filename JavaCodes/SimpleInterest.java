//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
package SimpleInterest;

import java.util.Scanner;
 
public class SimpleInterest {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter principl : ");
		float P=sc.nextFloat();
		System.out.print("Enter time : ");
		float T=sc.nextFloat();
		System.out.print("Enter rate of interest : ");
		float R=sc.nextFloat();
		float I=P*T*R/100;
		System.out.println("The simple interst is : "+I);
 
	}

}
