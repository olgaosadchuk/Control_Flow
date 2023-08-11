package helloworld;

import java.util.Scanner;

public class ControlFlow {

	public static void main(String[] args) {

//		//1. Write a program that declares 1 integer variable x, and then assigns 7 to it. 
//		//Write an if statement to print out “Less than 10” if x is less than 10. 
//		//Change x to equal 15, and notice the result (console should not display anything).
//		
//		int x = 7;
//		
//		if (x<10) {
//			System.out.println("Less than 10");
//		}
//		
//		x = 15;

//_____________________________________________________________________________________________

//		//2.Write a program that declares 1 integer variable x, and then assigns 7 to it. 
//		//Write an if-else statement that prints out “Less than 10” if x is less than 10, 
//		//and “Greater than 10” if x is greater than 10. Change x to 15 and notice the result.
//		int x = 7;
//		
//		if (x < 10) {
//			System.out.println("Less than 10");
//		}
//		else {
//			System.out.println("Greater than 10");
//		}
//		x = 15;
//		System.out.println(x);

//______________________________________________________________________________________________

//		//3.Write a program that declares 1 integer variable x, and then assigns 15 to it. 
//		//Write an if-else-if statement that prints out “Less than 10” if x is less than 10; 
//		//“Between 10 and 20” if x is greater than 10 but less than 20, 
//		//and “Greater than or equal to 20” if x is greater than or equal to 20. 
//		//Change x to 50 and notice the result.
//		
//		int x = 15;
//		if (x < 10) {
//			System.out.println("Less than 10");
//		}
//		else if (x >= 10 && x < 20) {
//			System.out.println("Between 10 and 20");
//		}
//		else {
//			System.out.println("Greater than or equal to 20");
//		}
//		
//		x = 50;
//		if (x < 10) {
//			System.out.println("Less than 10");
//		}
//		else if (x >= 10 && x < 20) {
//			System.out.println("Between 10 and 20");
//		}
//		else {
//			System.out.println("Greater than or equal to 20");
//		}

//_____________________________________________________________________________________________

//		//4. Write a program that declares 1 integer variable x, and then assigns 15 to it. 
//		//Write an if-else statement that prints “Out of range” if the number is less than 10 or 
//		//greater than 20 and prints “In range” if the number is between 10 and 20 
//		//(including equal to 10 or 20). Change x to 5 and notice the result.
//		
//		int x = 15;
//		if (x < 10 || x > 20) {
//			System.out.println("Out of range");
//		}
//		else {
//			System.out.println("In range");
//		}
//		
//		x = 5;
//		if (x < 10 || x > 20) {
//			System.out.println("Out of range");
//		}
//		else {
//			System.out.println("In range");
//		}
//		
//		//__________________________________________________________________________________

//		// 5. Write a program that uses if-else-if statements to print out grades A, B,
//		// C, D, F, according to the following criteria:
//		// A: 90-100
//		// B: 80-89
//		// C: 70-79
//		// D: 60-69
//		// F: <60
//		// Use the Scanner class to accept a number score from the user to determine the
//		// letter grade.
//		// Print out “Score out of range” if the score is less than 0 or greater than
//		// 100.
//
//		Scanner sr = new Scanner(System.in);
//		System.out.println("Enter your grade ");
//		int g = sr.nextInt();
//		if (g >= 90 && g <= 100) {
//			System.out.println("A");
//		} else if (g >= 80 && g <= 89) {
//			System.out.println("B");
//		} else if (g >= 70 && g <= 79) {
//			System.out.println("C");
//		} else if (g >= 60 && g <= 69) {
//			System.out.println("D");
//		} else if (g < 60) {
//			System.out.println("F");
//		} else {
//			System.out.println("Score out of range");
//		}
//		sr.close();
////______________________________________________________________________________________________________

//		//6. Write a program that accepts an integer between 1 and 7 from the user. 
//		//Use a switch statement to print out the corresponding weekday. 
//		//Print “Out of range” if the number is less than 1 or greater than 7. 
//		//Do not forget to include “break” statements in each of your cases.
//		
//		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter the number between 1 and 7: ");
//		int day = scanner.nextInt();
//		switch (day) {
//		case 1: System.out.println("Mo");break;
//		case 2: System.out.println("Tu");break;
//		case 3: System.out.println("We");break;
//		case 4: System.out.println("Th");break;
//		case 5: System.out.println("Fr");break;
//		case 6: System.out.println("Sa");break;
//		case 7: System.out.println("Su");break;
//		default: System.out.println("Out of range");	
//		}
//		scanner.close();
//		
//		//_______________________________________________________________________________________________

		// 7. Create a program that lets the users input their filing status and income.
		// Display how much tax the user would have to pay according to status and
		// income.
		// The U.S. federal personal income tax is calculated based on the filing status
		// and taxable income.
		// There are four filing statuses: Single, Married Filing Jointly, Married
		// Filing Separately, and Head of Household.
		// The tax rates for 2009 are shown below.

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your filing status: Single, Married Filing Jointly, Married Filing Separately, and Head of Household: ");
		String status = scanner.nextLine();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your income: ");
		int income = sc.nextInt();

		if (status.equals("Single")) {
			if (income >= 0 && income <= 8350) {
				System.out.println("You would have to pay 10% income tax - " + "$" + income*10/100);
			} else if (income >= 8351 && income <= 33950) {
				System.out.println("You would have to pay 15% income tax - " + "$" + income*15/100);
			} else if (income >= 33951 && income <= 82250) {
				System.out.println("You would have to pay 25% income tax - " + "$" + income*25/100);
			} else if (income >= 82251 && income <= 171550) {
				System.out.println("You would have to pay 28% income tax - " + "$" + income*28/100);
			} else if (income >= 171551 && income <= 372950) {
				System.out.println("You would have to pay 33% income tax - " + "$" + income*33/100);
			} else if (income >= 372951){
				System.out.println("You would have to pay 35% income tax -" + "$" + income*35/100);
			}
			else {
				System.out.println("Enter the correct information!");
			}
			
		} else if (status.equals("Married Filing Jointly")) {
			if (income >= 0 && income <= 16700) {
				System.out.println("You would have to pay 10% income tax - " + "$" + income*10/100);
			} else if (income >= 16701 && income <= 67900) {
				System.out.println("You would have to pay 15% income tax - " + "$" + income*15/100);
			} else if (income >= 67901 && income <= 137050) {
				System.out.println("You would have to pay 25% income tax - " + "$" + income*25/100);
			} else if (income >= 137051 && income <= 208850) {
				System.out.println("You would have to pay 28% income tax - " + "$" + income*28/100);
			} else if (income >= 208851 && income <= 372950) {
				System.out.println("You would have to pay 33% income tax - " + "$" + income*33/100);
			} else if (income >= 372951){
				System.out.println("You would have to pay 35% income tax -" + "$" + income*35/100);
			}
			else {
				System.out.println("Enter the correct information!");
			}
			
		} else if (status.equals("Married Filing Separately")) {
			if (income >= 0 && income <= 8350) {
				System.out.println("You would have to pay 10% income tax- " + "$" + income*10/100);
			} else if (income >= 8351 && income <= 33950) {
				System.out.println("You would have to pay 15% income tax - " + "$" + income*15/100);
			} else if (income >= 33951 && income <= 68525) {
				System.out.println("You would have to pay 25% income tax - " + "$" + income*25/100);
			} else if (income >= 68526 && income <= 104425) {
				System.out.println("You would have to pay 28% income tax - " + "$" + income*28/100);
			} else if (income >= 104426 && income <= 186475) {
				System.out.println("You would have to pay 33% income tax - " + "$" + income*33/100);
			} else if (income >= 186476){
				System.out.println("You would have to pay 35% income tax -" + "$" + income*35/100);
			}
			else {
				System.out.println("Enter the correct information!");
			}
			
		} else if (status.equals("Head of Household")) {
			if (income >= 0 && income <= 11950) {
				System.out.println("You would have to pay 10% income tax- " + "$" + income*10/100);
			} else if (income >= 11951 && income <= 45500) {
				System.out.println("You would have to pay 15% income tax - " + "$" + income*15/100);
			} else if (income >= 45501 && income <= 117450) {
				System.out.println("You would have to pay 25% income tax - " + "$" + income*25/100);
			} else if (income >= 117451 && income <= 190200) {
				System.out.println("You would have to pay 28% income tax - " + "$" + income*28/100);
			} else if (income >= 190201 && income <= 372950) {
				System.out.println("You would have to pay 33% income tax - " + "$" + income*33/100);
			} else if (income >= 372951){
				System.out.println("You would have to pay 35% income tax -" + "$" + income*35/100);
			}
			else {
				System.out.println("Enter the correct information!");
			}
		}
		
		    else{
			System.out.println("Please enter the correct information!");
		}
	}
}
