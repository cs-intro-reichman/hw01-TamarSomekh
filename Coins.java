/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
public class Coins {
	public static void main(String[] args) {
		
		//reciving information from user
		int amount;
		amount = Integer.parseInt(args[0]);
		
		//printing the represantation in coins
		System.out.println("Use " + (amount / 25) + " quarters and " + (amount % 25) + " cents");
	}
}