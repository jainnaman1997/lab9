package cg;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountChar {

	public static Map<Character, Integer> countCharacter(char ch[]) {
		HashMap<Character, Integer> h=new HashMap<Character, Integer>();
		for(int i=0;i<ch.length;i++) {
			if(h.containsKey(ch[i])) {
				h.replace(ch[i], h.get(ch[i]), h.get(ch[i])+1);
			}
			else {
				h.put(ch[i], 1);
			}
		}
		return h;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.nextLine();
		char []ch=s.toCharArray();
		Map<Character, Integer> m=countCharacter(ch);
		System.out.println("Count for each character in "+s+" is "+m);
		sc.close();

	}

}
