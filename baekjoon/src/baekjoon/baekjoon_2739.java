package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
public class baekjoon_2739 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		processMath(a);
	}
	public static void processMath(int a) {
		for (int i = 1 ; i < 10; i++) {
			System.out.println(a + " * " + i + " = " + (a*i) );
		}
	}

}
