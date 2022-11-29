package baekjoon;

import java.util.ArrayList;
import java.util.Collections;

import java.util.Scanner;
public class baekjoon_2480 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		
//		a = (int)(Math.random() * 6) + 1; 
//		b = (int)(Math.random() * 6) + 1; 
//		c = (int)(Math.random() * 6) + 1;
		
		a = sc.nextInt();
		System.out.print(" ");
		b = sc.nextInt();
		System.out.print(" ");
		c = sc.nextInt();
		processMeth(a,b,c) ; 
		
		
	}
	public static void processMeth(int a, int b, int c) {
		if(a == b) {
			if(a==c) {
				System.out.println(10000 + (a * 1000));
			}else {
				System.out.println(1000 + (a * 100));
			}
		}else if(a == c) {
			System.out.println(1000 + (a * 100));
		}else if (b == c){
			System.out.println(1000 + (b * 100));
		}else {
			ArrayList<Integer> list = new ArrayList<Integer>();
			list.add(a);
			list.add(b);
			list.add(c);

			Collections.sort(list,Collections.reverseOrder());
			System.out.println(list.get(0)*100);
			
		}
	}

}
