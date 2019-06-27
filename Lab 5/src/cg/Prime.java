package cg;

import java.util.Scanner;

public class Prime {

	public static void getPrime(int n) {
		for(int i=2;i<=n;i++) {
			int flag=0;
			for(int j=2;j<=Math.sqrt(i);j++) {
				if(i%j==0) {
					flag=1;
					break;
				}
			}
			if(flag==0) {
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a natural number");
		int n=sc.nextInt();
		if(n<2) {
			System.out.println("No prime number upto "+n+" exist");
		}
		else {
			System.out.println("Prime numbers upto "+n+" :");
			getPrime(n);
		}
		sc.close();

	}

}
