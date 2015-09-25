import java.util.Scanner;


public class Calculator {
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner input = new Scanner(System.in);
			Scanner op =  new Scanner(System.in);
			
			float num1;
				
			System.out.print( "Enter Number A : ");
			num1 = input.nextInt();
							
			float num2;
			
			System.out.print( "Enter Number B : ");
			num2 = input.nextInt();
			
			System.out.println("Enter your selection:\n1 : A + B\n2 : A - B\n3 : A * B\n4 : A / B\n");
			int choose = input.nextInt();
			
			float danswer = num1 / num2;
					if (choose == 1)
					{ System.out.println("Your answer is: " + (num1 + num2)); }
					else if (choose == 2)
					{ System.out.println("Your answer is: " + (num1 - num2)); }
					else if (choose == 3)
					{ System.out.println("Your answer is: " + (num1 * num2)); }
					else if (choose == 4)
					{ System.out.println("Your answer is: " + danswer); }
							
					}
			
			
}

// Please update with the latest code
