import java.util.Arrays;
import java.util.Scanner;

/*
 * Tomas Carrillo
 * 22MAR22
 * 
 * Write a program to reverse the order of words in a sentence
This question involves String concepts. .split(" ") method i.e split by space, might be helpful here
1.
 */
public class Solution1 {

	public static void main(String[] arg) {

		String o[] = "What's my name".split("");
		String result = "";
		for (int i = o.length - 1; i >= 0; i--) {
			result += o[i] + "";
		}
		System.out.println(result);
		
		//2. Checking for leap year. If number is divisible with no remainder
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year that you would like to check");
		double year = sc.nextDouble();

		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
			System.out.println("Is a leap year");

		} else
			System.out.println("Not a leap Year");
//3. Program executing forever loop 
		int counter = 0;

		while (true) {
//Breaks Counter at 5
			if (counter == 5) {
				break;
				
				//omits printing counter 3
			} else if (counter == 3) {
				counter++;

				continue;
			}
		
			System.out.println(counter);
			counter++;
		}//4. Create array and print all floats within using for loop
			float[] numbers = { 2.5f, 4.8f, 9.07f, 12.55f, 55.7f };
			for (int i = 0; i <= numbers.length - 1; i++) {
				System.out.println(numbers[i]);
				
				//5. Write program that request user for decimal input and use Math. 
			}
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Enter a decimal number");
			double dc = sc1.nextDouble();
			System.out.println("The ceil value of the number is " + Math.ceil(dc));
			System.out.println("The floor value of the number is " + Math.floor(dc));
			System.out.println("The number rounded to the nearest integer is " + Math.round(dc)); 
			
	
	//7. Program to practice Exception handling 
	int num1;
	int num2;
	
	try {
		
		System.out.println("Enter the first nuber: ");
		num1 = input.nextInt();
		
		System.out.println("Enter the second number: ");
		num2 = input.nextInt();
		
		System.out.println("The division of the 2 numbers is: " + (num1/num2));
		
	} catch (ArithmeticException e) {
		
		System.out.println(e.getStackTrace());
		
	} catch (Exception e) {
		
		System.out.println(e.getStackTrace());
		
	} finally {
		
		System.out.println("Thank you");
		
		
	}
	
	
	
	}
	}


