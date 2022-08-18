package TotalValue;
import java.util.Scanner;

public class TotalValue {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Percntage is : ");
		float a=sc.nextFloat();
		System.out.println("you got : ");
		float b=sc.nextFloat();
		float c=(100/a)*b;
		System.out.println("Total number is : "+c);
	}

}
