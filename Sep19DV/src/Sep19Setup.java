import java.util.Scanner;

public class Sep19Setup {
    private double expenses;
//**************
    public Sep19Setup(double expenses) {
        this.expenses = expenses;
    }

    public void toStringMethod() {
        System.out.println("Expenses: " + expenses);
    }

    public double calculateNetSalary(double salary) {
        return salary - expenses;
    }
//* during this section on top where the starts are i and this to do the math for the 
//* for the system which would tgake you salary and subtract your expenses
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fullName = "";
        double salary = 0;
        String profession = "";
        boolean isHome = false;

        System.out.print("Enter your full name: ");
        fullName = scanner.nextLine();
//* During this section of the code the line 6- 13 i just identified all the variables i used for this assignemnet and i
//*i knew i would need some string and double becaue im asking for values in numbers
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
//* Java complier it told me what was wrong with my code and also i used it to identify the while and if statement
        System.out.print("Enter your profession: ");
        profession = scanner.nextLine();

        System.out.print("Are you a homeowner? Yes/No: ");
        String homeownerInput = scanner.nextLine();
        switch (homeownerInput.toLowerCase()) {
            case "Yes":
                isHome = true;
                break;
                //*during this i wanted to update this ection a little more from just a simple answert to a more professonial 
                //* pers ay you would have a simple Y/N when you could actualy put the words to make the interface a lot nicer
                
            case "No":
                isHome = false;
                break;
            default:
                System.out.println("Not a homeowner");
                isHome = false;
                break;
        }
//* These next code was included due to the fact that i needed to add a swtich i had wrote the code without using it 
//* becasue i would it to be more efficent and i also used pasted classwork for this section
        System.out.print("Enter your monthly expenses: ");
        double monthlyExpenses = scanner.nextDouble();
        Sep19Setup user = new Sep19Setup(monthlyExpenses);
        user.toStringMethod();

        double netSalary = user.calculateNetSalary(salary);
        System.out.println("\n--- User Information ---");
        System.out.println("Full Name: " + fullName);
        System.out.println("Salary after expenses: " + salary);
        //* NEW CODE During this section of the code i wanted to add the salary of the person 
        //* with this i also wanted to add the salary - the expnese so they could see what they actually earn
        //* so that they could know how much money they have to invest which will be in another code
        
        System.out.println("Profession: " + profession);
        System.out.println("Homeowner: " + (isHome ? "Yes" : "No"));
        System.out.println("Net Salary after expenses: " + netSalary);
        System.out.println("Salary: " + salary);
//* I simply just printed all the options i wanted to bu just println and adding the amount os it can display
        scanner.close();
        
    	//* during this section Which is the section addition to the code we will
	//* we will be adding a chart to compare the amount of someones salary to 
	//* how much they are allowed to spend on the on a house by giving them a net price
	//*$600,000 for every $200,000 they make or a conversion rate of .66
	    
    }
}
