package USDtoINR;
import java.util.Scanner;

public class USDtoINR {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the amount in USD : ");
		float USD=sc.nextFloat();
		float INR= USD*79.75f;
		System.out.println("the amount in indian rupee is : "+INR+" rupees");
	}

}
