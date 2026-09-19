import java.util.Scanner;
public class Temperature {
	
	public static void main (String[] args) {
		 Scanner in = new Scanner(System.in);
		 System.out.print("Enter a temperature in Celsius: ");
		 double celsius = in.nextDouble();
		 double fahrenheit = (celsius*(9.0/5.0) + 32.0);
			System.out.printf("%.1f", celsius);
			System.out.print(" C = ");
			System.out.printf("%.1f", fahrenheit);
			System.out.println(" F ");
		//hi! this also works in replacement of lines 9-12: System.out.printf("%.1f C = %.1f F%n", celsius, fahrenheit);
		
	}
}
