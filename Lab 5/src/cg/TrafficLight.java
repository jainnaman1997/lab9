package cg;

import java.util.Scanner;

public class TrafficLight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Red\nYellow\nGreen\nSelect one light");
		String st=sc.nextLine();
		switch(st) {
			case "Red":	System.out.println("Stop");
						break;
			case "Yellow":	System.out.println("Ready");
							break;
			case "Green":	System.out.println("Go");
							break;
			default:	System.out.println("Wrong choice");
						break;
		}

	}

}
