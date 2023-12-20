/*
 * Three sides can form a triangle if the sum of the lengths of any two sides is greater than the length of the remaining side. 
 * This is known as the Triangle Inequality Theorem. 
 * Write a program that tests if three given integers form a triangle.
 */ 
public class Triangle {
	public static void main(String[] args) {
		int a , b , c;
		
		a = Integer.parseInt(args[0]);
		b = Integer.parseInt(args[1]);
		c = Integer.parseInt(args[2]);
		
		boolean length1 = a < b + c;
		boolean length2 = b < a + c;
		boolean length3 = c < a + b;
		
		if (length1 == length2 == length3){
			System.out.println(a + ", " + b + ", " + c + ": true");
		}
		else{
			System.out.println(a + ", " + b + ", " + c + ": false");
		}	
	}
}
