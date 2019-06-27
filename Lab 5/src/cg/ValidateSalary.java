package cg;

import java.util.Scanner;

import com.cg.eis.exception.EmployeeException;

public class ValidateSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your salary");
		int salary=sc.nextInt();
		try {
			if(salary<3000)
				throw new EmployeeException();
			else
				System.out.println("Salary is valid");
		}catch (EmployeeException e) {
			// TODO: handle exception
			System.err.println("Salary is invalid");
		}
		sc.close();

	}

}
