/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		
		//reciving information from user
		int a , b;
		a = Integer.parseInt(args[0]);
		b = Integer.parseInt(args[1]);
		
		//printing a random number in the range the user gave me
		double RandomNum1 = Math.random();
		int num1 = (int) (RandomNum1 * (b - a) + a );
		System.out.println(num1);
		
		double RandomNum2 = Math.random();
		int num2 = (int) (RandomNum2 * (b - a) + a );
		System.out.println(num2);
		
		double RandomNum3 = Math.random();
		int num3 = (int) (RandomNum3 * (b - a) + a );
		System.out.println(num3);
		
		//checking what is the minimal number
		int minimal = 0;
		if (num1 <= num2 && num1 <= num3){
			minimal = num1;
		}
		else if(num2 <= num1 && num2 <= num3){
			minimal = num2;
		}
		else if(num3 <= num1 && num3 <= num2){
			minimal = num3;
		}
		
		
		System.out.println("The minimal generated number was " + minimal);	
	}
}
