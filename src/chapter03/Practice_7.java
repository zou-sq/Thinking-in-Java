package chapter03;

import java.util.Random;

/**
 * @author Mitnick
 * @date  2019年5月11日 下午6:06:38
 * @Description TODO
 */
public class Practice_7 {
	public static void main(String[] args) {
		Random rand = new Random();
		int i = rand.nextInt(100) + 1;
		if (i > 50)
			System.out.println("正面");
		else
			System.out.println("反面");
	}
}
