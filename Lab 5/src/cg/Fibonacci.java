package cg;

import java.util.Scanner;

public class Fibonacci {

	public static int fibo(int n) {
		int a1=1, a2=1;
		if(n==1 || n==2) {
			return a1;
		}
		else {
			int t=a1+a2;
			for(int i=2;i<n;i++) {
				t=a1+a2;
				a2=a1;
				a1=t;
			}
			return t;
		}
	}
	public static int recFibo(int n) {
		if(n==1 || n==2)
			return 1;
		else
			return recFibo(n-1)+recFibo(n-2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a  natural number");
		int n=sc.nextInt();
		int val1=fibo(n);
		int val2=recFibo(n);
		System.out.println("Fibonacci value without recurssion is "+val1);
		System.out.println("Fibonacci value with recurssion is "+val2);
		sc.close();

	}

}
