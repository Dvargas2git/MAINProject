//Dennis Vargas
//Professor Serena Schwartz
// IS 345: Java Programming
//Due Date: 12/9/2024

//Description: This Java code allows users to track their spending by 
//logging each expense along with the category and amount. 
//It calculates the average spending in each category over a specified period
//and provides alerts if the user exceeds their average spending threshold. 
//The program helps individuals manage their budget by offering insights into 
//their spending habits and notifying them when they are at risk of overspending.

//Future add-ons: I would love to implement this for landlords so they can know how to manage there 
//properties because 95% of people who become landlords do not succeed due to 
//poor management.

import java.awt.font.NumericShaper.Range;
import java.util.Scanner;

public class YEARLONGPROJECT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
// First step i did which i have changed three different times due to learning
// More efficient ways to code i learned that with doubles you can ask for a number
// which can be displayed and understood by the code.
        
        
        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();

        System.out.print("What's your occupation? ");
        String occupation = scanner.nextLine();

        System.out.print("What is your intended salary per month? ");
        double intendedSalary = scanner.nextDouble();

        System.out.print("How much do you pay on mortgage per month? ");
        double mortgage = scanner.nextDouble();

        System.out.print("How much do you pay in BGE per month? ");
        double bge = scanner.nextDouble();

        System.out.print("How much do you pay in water bills per month? ");
        double waterBills = scanner.nextDouble();
        
        
// ERROR: FIXED 11/25/2024        
// During this section i found many errors in my old code which would create problems
/*       System.out.print("Enter your monthly expenses: ");
        double monthlyExpenses = scanner.nextDouble();
        ClassProject user = new ClassProject(monthlyExpenses);
        user.toStringMethod();

        double netSalary = user.calculateNetSalary(salary); */
        
        
        
        System.out.print("How many people live in the house? ");
        int numberOfPeople = scanner.nextInt();
//MATH: The math shown below will give you the total amount of expenses
//This will also show the WALMART Data which was taken from the web to tell us that on average a 
// single person spends about $190
        double groceryExpense = numberOfPeople * 190;
        double totalExpenses = mortgage + bge + waterBills + groceryExpense;
        
// Around this time I noticed that this was a very confusing way to use coding methods
// So when it can to cases and break i instead, picked the route to let the user give a response
// which is clear to yes or no.
/*
  System.out.print("Are you a homeowner? Yes/No: ");
       String homeownerInput = scanner.nextLine();
       switch (homeownerInput.toLowerCase()) {
           case "Yes":
               isHome = true;
               break;            
           case "No":
               isHome = false;
               break;
           default:
               System.out.println("Not a homeowner");
               isHome = false;
               break;
 */

        
 // Finally I came back to decode my code because i found that a lot of lines were being print at 
 //different times which made the system believe that it was reading a different code 
 //For example one issues i had to overcome was the Mortgage+ BGE+ Water Bill.
 // The issue i have having is that the bills were being asked at the same time instead of 
 //separate so the user would have had no clue what to type into the input
        
        System.out.println("\n--- Financial Summary ---");
        System.out.println("Full Name: " + fullName);
        System.out.println("Occupation: " + occupation);
        System.out.println("Intended Salary: $" + intendedSalary);
        System.out.println("Mortgage: $" + mortgage);
        System.out.println("BGE: $" + bge);
        System.out.println("Water Bills: $" + waterBills);
        System.out.println("Grocery Expense: $" + groceryExpense);
        System.out.println("Total Expenses: $" + totalExpenses);
        
//Last step was to print all information that i was given while adding some math function which were taken from 
//WALMART DATABASE: showing that on average one person buys $190 of grocery per month so it will calculate the amount
// of people and then sum up how much they will spend on groceries.
        
        double remainingAmount = intendedSalary - totalExpenses;
        System.out.println("Remaining Amount after Expenses: $" + remainingAmount);
        
//Last part of this project i wanted to add a line of code which would be beneficial for the user
//So i added a Math line which will let you the amount you have left for the month.

        scanner.close();
    }
}

//With my submission date coming soon my last implementation to this code are to 
//Set a budget and track expense so when you pass a certain number you will get a notification so
//you know not to pass or spend anymore.
//Thank you!!
