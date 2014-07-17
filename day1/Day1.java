/*
Created by Aaron Jones
Description: The purpose of this program is to make the user learn the basics of java.
In five different lessons.

1) Variables
2) Printing
3) Math
4) Git
5) Linux Commands


*/

import java.util.*

public class Day1
{
	public static void main(String [] args)
	{

	}

	public void displayMenu()
	{
		System.out.println("1) Printing");
		System.out.println("2) Variables");
		System.out.println("3) Math");
		System.out.println("4) Git");
		System.out.println("5) Linux Commands");
	}

	public void printingLesson()
	{
		System.out.println("Welcome to the Printing Lesson");
		System.out.println("In the following program we will be learning how
							to print output in the through the command line.");
		System.out.println("I suggest that if you haven't checked out the Linux Commands 
							tutorial or the Git tutorial you do so before viewing this lesson!");
		System.out.println("/n Printing into the command line comes out with the following Commands
			                'System.out.println(\"yourmessagehere\"); /n");
	}

	public void variablesLesson()
	{

	}

	public void mathLesson()
	{

	}

	public void gitLesson()
	{

	}

	/*
	Things I want to implement into this code. 

	1) 
	*/
	public void tryPrinting(Scanner kb)
	{
		String answer;
		String name = "Laine Tomsha";
			/*This is question 1 */
		System.out.println("Remember type in the exact command you would if you 
							were typing it into the source code.");
		System.out.println("After five tries on each question you will be sent 
			                back to the lesson. Good luck!");

		System.out.println("Question 1: Enter the line of code to print out \"
		                   Hello World\": ");
	 					answer = kb.nextLine();
	 		if(answer.equals("System.out.println(\"Hello World\");");
	 		{
	 			System.out.println("Correct!");
	 		}
	 		else
	 		{
	 			System.out.println("Wrong try again!");
	 		}
	 		/*This is question 2*/
	 	System.out.println("Question 2: Enter the line of code to print out \"Java is cool\" ");
	 		answer = kb.nextLine();
	 		if(answer.equals("System.out.println(\"Java is cool\");");
	 		{
	 			System.out.println("Correct!");
	 		}
	 		else
	 		{
	 			System.out.println("Wrong try again!");
	 		}
	 		/*This is question 3 */
	 	System.out.println("Question 3: Enter the line of code to print out your name");
	 		answer = kb.nextLine();
	 		if(answer.equals("System.out.println(\"Laine Tomsha\");");
	 		{
	 			System.out.println("Correct!");
	 		}
	 		else
	 		{
	 			System.out.println("Wrong try again!");
	 		}
	 		/*This is question 4 */
	 	System.out.println("Question 4: Enter the line of code to print out your mother's name");
	 	answer = kb.nextLine();
	 		if(answer.equals("System.out.println(\"Heather Tomsha\");");
	 		{
	 			System.out.println("Correct!");
	 		}
	 		else
	 		{
	 			System.out.println("Wrong try again!");
	 		}
	 		/*This is question 5 */
	 	System.out.println("Question 5: Enter the line of code to print out your age");
	 	answer = kb.nextLine();
	 		if(answer.equals("System.out.println(\"20\");");
	 		{
	 			System.out.println("Correct!");
	 		}
	 		else
	 		{
	 			System.out.println("Wrong try again!");
	 		}

	}

	public void variablesLesson()
	{

	}

	public void mathLesson()
	{

	}

	public void gitLesson()
	{

	}

	public void linuxLesson()
	{
		
	}
}
