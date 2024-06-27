package exception2;

import java.util.Scanner;

public class LoanEligibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 String nationality;
		 double salary,loanAmount;
		

	        try 
	        {
	            System.out.print("Enter your nationality: ");
	            nationality = sc.nextLine();

	            if (!nationality.equalsIgnoreCase("Indian"))
	            {
	                throw new Exception("Only Indian are eligible for the loan.");
	            }

	            System.out.print("Enter your salary: ");
	            salary = sc.nextDouble();

	            if (salary <= 50000) 
	            {
	                throw new Exception("Salary must be greater than 50000 to be eligible for the loan.");
	            }

	            loanAmount = 0.7 * salary;
	            System.out.println("Loan sanctioned: " + loanAmount);

	        }
	        catch (Exception e) 
	        {
	            System.out.println("Loan cannot be sanctioned: " + e.getMessage());
	        } 
	      
	}

}
