package baekjoon;


import java.util.Collections;
import java.util.Scanner;
public class baekjoon_10807 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int[] arr;
		
		
		a = sc.nextInt();
		arr = new int[a];
		for(int i = 0 ; i < a ; i++) {
			arr[i] = (int) (Math.random()*100)+1;
		}
		processMeth(arr) ; 
		
		
	}
	public static void processMeth(int[] a) {

		
	}

}
