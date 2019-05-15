package chapter04;

import java.util.Random;

/**
 * @author Mitnick
 * @date  2019年5月14日 下午7:42:20
 * @Description TODO
 */
public class ForEachFloat {
	public static void main(String[] args) {
		Random rand = new Random();
		float f[] = new float[10];
		for(int i = 0; i < 10; i++)
			f[i] = rand.nextFloat();
		
		for(float x: f)
			System.out.println(x);
//		任何返回一个数组的方法都可以使用foreach
	}
}
