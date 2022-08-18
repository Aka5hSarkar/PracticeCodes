//Take name as input and print a greeting message for that particular name.
package Welcome;
import java.util.Scanner;
public class Welcome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name : ");
		String name=sc.nextLine();
		System.out.println("Welcome "+name);
	}

}
