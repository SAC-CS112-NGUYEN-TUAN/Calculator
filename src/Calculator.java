import java.util.Scanner;


public class Calculator {
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner input = new Scanner(System.in);
			Scanner op =  new Scanner(System.in);
			
			float num1;
				
			System.out.print( "Enter Number A : ");
			num1 = input.nextFloat();
			float num2;
			
			System.out.print( "Enter Number B : ");
			num2 = input.nextFloat();
			
			System.out.println("Enter your operations: + - * /");
			char choose = op.next().charAt(0);
			
			float danswer = num1 / num2;
					if (choose == '+')
					{ System.out.println("Your answer is: " + (num1 + num2)); }
					else if (choose == '-')
					{ System.out.println("Your answer is: " + (num1 - num2)); }
					else if (choose == '*')
					{ System.out.println("Your answer is: " + (num1 * num2)); }
					else if (choose == '/')

					{ System.out.println("Your answer is: " + danswer); }
							
					}
			
			
}
