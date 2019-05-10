package chapter02;

import java.util.Scanner;

/**
 * @author Mitnick
 * @date  2019年5月10日 下午8:16:50
 * @Description TODO
 */
public class Practice_6 {
		int storage(String s) {
		return s.length();
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();
		
		Practice_6 p = new Practice_6();
		int i = p.storage(a);
		System.out.println(i);
		scan.close();
	}
}
