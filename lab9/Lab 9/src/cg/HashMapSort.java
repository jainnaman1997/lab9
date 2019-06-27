package cg;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class HashMapSort {

	public static List<Integer> getValues(HashMap<Integer, Integer> h) {
		Collection<Integer>  c=h.values();
		List<Integer> cList=new ArrayList<Integer>(c);
		Collections.sort(cList);
		return cList;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements");
		int n=sc.nextInt();
		System.out.println("Enter the list elements");
		HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();
		for(int i=1;i<=n;i++) {
			hm.put(i, sc.nextInt());
		}
		List<Integer> l=getValues(hm);
		System.out.println("List in sorted order"+l);
		sc.close();
	}

}
