/*
 * Adds two given integers and prints the result in a fancy way.
 */
public class AddTwo {
	public static void main(String[] args) {
		
		//recieving two numbers from the user
		int a , b;
		a = Integer.parseInt(args[0]);
		b = Integer.parseInt(args[1]);
		
		//printing the sum of the numbers in a fancy way
		System.out.println( a + " + " + b + " = " + (a + b));
	}
}
