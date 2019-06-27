package cg;

import java.util.Scanner;

class FirstNameException extends Exception {

	private static final long serialVersionUID = 1L;
	
}

class LastNameException extends Exception {

	private static final long serialVersionUID = 1L;
	
}

public class ValidateName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First name");
		String f_name=sc.next();
		System.out.println("Enter Last name");
		String l_name=sc.next();
		try {
			if(f_name=="")
				throw new FirstNameException();
			if(l_name=="")
				throw new LastNameException();
		}catch (FirstNameException e) {
			// TODO: handle exception
			System.out.println("First name can't be null");
		}catch (LastNameException e) {
			// TODO: handle exception
			System.out.println("Last name can't be null");
		}
		sc.close();

	}

}
