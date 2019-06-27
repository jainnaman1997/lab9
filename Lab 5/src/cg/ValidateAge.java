package cg;

import java.util.Scanner;

class InvalidAgeException extends Exception{

	private static final long serialVersionUID = 1L;
	
}

public class ValidateAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		try {
			if(age<=15)
				throw new InvalidAgeException();
			else
				System.out.println("Age is valid");
		}catch (InvalidAgeException e) {
			// TODO: handle exception
			System.err.println("Please enter valid age");
		}
		sc.close();

	}

}
