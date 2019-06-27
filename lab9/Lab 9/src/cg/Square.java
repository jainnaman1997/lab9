package cg;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Square {

	public static Map<Integer, Integer> getSquares(int arr[]) {
		HashMap<Integer, Integer> h=new HashMap<Integer, Integer>();
		for(int i=0;i<arr.length;i++) {
			h.put(arr[i], arr[i]*arr[i]);
		}
		return h;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements");
		int n=sc.nextInt();
		System.out.println("Enter array elements");
		int []arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Map<Integer, Integer> m=getSquares(arr);
		System.out.println("Square of the array elements is "+m);
		sc.close();

	}

}
