import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class GuessMyNumber {
	
	public static void main (String[] args) {
		Random random = new Random();
		int number = random.nextInt(100) + 1;
		Scanner in = new Scanner(System.in);
		System.out.println("I'm thinking of a number between 1 and 100");
		System.out.println("(including both). Can you guess what it is?");
		int guess = in.nextInt();
		int value = Math.abs(number - guess);
		System.out.println("Your guess is: " + guess);
		System.out.println("The number I was thinking of is:" + number);
		System.out.println("You were off by: " + value);
		
	}
}
