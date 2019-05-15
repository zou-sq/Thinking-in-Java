package chapter04;

import java.util.Scanner;

/**
 * @author Mitnick
 * @date  2019年5月15日 上午1:09:57
 * @Description TODO
 */
public class Practice_9 {
	static int fib(int i) {
		switch(i) {
		case 1: return 1;
		case 2: return 1;
		default: return (fib(i - 1) + fib(i - 2));
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		 for(int j = 1; j <= input; j++) {
			 System.out.println(fib(j));
		 }
		 scan.close();
	}
}
