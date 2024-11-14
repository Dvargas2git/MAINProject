import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;

public class ClassProject {
   private double expenses;
   
//**************
   public ClassProject(double expenses) {
       this.expenses = expenses;
   }

   public void toStringMethod() {
       System.out.println("Expenses: " + expenses);
   }

   public double calculateNetSalary(double salary) {
       return salary - expenses;
   }

   //* during this section on top where the starts are i and this to do the math for the 
   //* for the system which would take your salary and subtract your expenses
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       String fullName = "";
       double salary = 0;
       String profession = "";
       boolean isHome = false;

       // Create ArrayList and LinkedList
       ArrayList<String> userInfoList = new ArrayList<>();
       LinkedList<String> salaryDetails = new LinkedList<>();

       System.out.print("Enter your full name: ");
       fullName = scanner.nextLine();
//* During this section of the code the line 6- 13 i just identified all the variables i used for this assignemnet and i
//*i knew i would need some string and double because I'm asking for values in numbers
       boolean validSalary = false;
       while (!validSalary) {
           System.out.print("Enter your salary: ");
           if (scanner.hasNextDouble()) {
               salary = scanner.nextDouble();
               validSalary = true;
           } else {
               System.out.println("You need to put a real number");
               scanner.next(); 
           }
       }
       scanner.nextLine(); 
//* During this section of the code i did have to do a bit of research not only from my class work but from 
//* Java compiler it told me what was wrong with my code and also I used it to identify the while and if statement
       System.out.print("Enter your profession: ");
       profession = scanner.nextLine();

       System.out.print("Are you a homeowner? Yes/No: ");
       String homeownerInput = scanner.nextLine();
       switch (homeownerInput.toLowerCase()) {
           case "yes":
               isHome = true;
               break;
               //* during this i wanted to update this section a little more from just a simple answer to a more professional 
               //* way you would have a simple Y/N when you could actually put the words to make the interface a lot nicer
               
           case "no":
               isHome = false;
               break;
           default:
               System.out.println("Not a homeowner");
               isHome = false;
               break;
       }
//* These next code was included due to the fact that i needed to add a switch i had written the code without using it 
//* because I would want it to be more efficient and I also used pasted classwork for this section
       System.out.print("Enter your monthly expenses: ");
       double monthlyExpenses = scanner.nextDouble();
       ClassProject user = new ClassProject(monthlyExpenses);
       user.toStringMethod();

       double netSalary = user.calculateNetSalary(salary);
       
       //* Store user information in ArrayList
       userInfoList.add("Full Name: " + fullName);
       userInfoList.add("Profession: " + profession);
       userInfoList.add("Homeowner: " + (isHome ? "Yes" : "No"));
       userInfoList.add("Salary: " + salary);
       userInfoList.add("Monthly Expenses: " + monthlyExpenses);
       userInfoList.add("Net Salary after expenses: " + netSalary);

       // Display user info from ArrayList
       System.out.println("\n--- User Information from ArrayList ---");
       for (String info : userInfoList) {
           System.out.println(info);
       }

       //* Add detailed salary info to LinkedList
       salaryDetails.add("Salary: " + salary);
       salaryDetails.add("Monthly Expenses: " + monthlyExpenses);
       salaryDetails.add("Net Salary after expenses: " + netSalary);

       // Display salary details from LinkedList
       System.out.println("\n--- Salary Details from LinkedList ---");
       for (String detail : salaryDetails) {
           System.out.println(detail);
       }

       scanner.close();
       
    //* during this section which is the section addition to the code we will
//* we will be adding a chart to compare the amount of someone's salary to 
//* how much they are allowed to spend on a house by giving them a net price
//* $600,000 for every $200,000 they make or a conversion rate of .66
   }
}
