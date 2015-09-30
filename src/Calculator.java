import java.util.Scanner;


public class Calculator {
		public static void main(String[] args) {
	
			Scanner input = new Scanner(System.in);
			Scanner op =  new Scanner(System.in);
			
			float num1;
			System.out.print( "Enter Number A : ");
			num1 = input.nextFloat();
			
			float num2;
			System.out.print( "Enter Number B : ");
			num2 = input.nextFloat();
			
			System.out.println("Enter type your operations: plus / minus / mult / div");
			String choose = op.next();
			
			float danswer = num1 / num2;
					if (choose.equals("plus") )
					{ System.out.println("Your answer is: " + (num1 + num2)); }
					else if (choose.equals("minus") )
					{ System.out.println("Your answer is: " + (num1 - num2)); }
					else if (choose.equals("mult") )
					{ System.out.println("Your answer is: " + (num1 * num2)); }
					else if (choose.equals("div") )      // I still wonder why (choose == ("div"))not work

					{ System.out.println("Your answer is: " + danswer); }
							
					}
			
			
}