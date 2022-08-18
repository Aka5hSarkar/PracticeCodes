//input currency in rupees and output in USD.
package INRtoUSD;
import java.util.Scanner;
public class INRtoUSD {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the amount in rupee : ");
		float INR=sc.nextFloat();
		float USD=INR*0.013f;
		System.out.println("The amount in USD is : "+USD+ " USD");
		

	}

}
