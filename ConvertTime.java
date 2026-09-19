import java.util.Scanner;
public class ConvertTime {
	
	public static void main (String[] args) {
		 final double SECONDS_PER_MINUTE = 60;
		 final double MINUTES_PER_HOUR = 60;
		 final double SECONDS_PER_HOUR = 3600;
		 Scanner in = new Scanner(System.in);
		 System.out.print("Enter an amount of seconds: ");
		 double seconds = in.nextDouble();
		 int hours = (int)(seconds / SECONDS_PER_HOUR);
		 int minutes = (int)((seconds % SECONDS_PER_HOUR) / SECONDS_PER_MINUTE);
		 int second = (int)(seconds % SECONDS_PER_MINUTE);
		 System.out.print(hours + " hours " + minutes + " minutes " + second + " seconds");

		
	}
}
