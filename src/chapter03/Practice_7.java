package chapter03;

import java.util.Random;

/**
 * @author Mitnick
 * @date  2019��5��11�� ����6:06:38
 * @Description TODO
 */
public class Practice_7 {
	public static void main(String[] args) {
		Random rand = new Random();
		int i = rand.nextInt(100) + 1;
		if (i > 50)
			System.out.println("����");
		else
			System.out.println("����");
	}
}
