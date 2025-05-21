import java.util.Scanner;
public class Multiplication{
public static void main(String [] args){

Scanner input = new Scanner(System.in);

	int result = 0;
System.out.print("Enter first number: ");
 int firstNumber = input.nextInt();

System.out.print("Enter second number: ");
 int secondNumber = input.nextInt();


for(int i = 1; i <= secondNumber; i++  ){


   result = result + firstNumber;

	}

	System.out.println("Multiplication of number: " + result);
}

	}