package chapter04;

import java.util.Random;

/**
 * @author Mitnick
 * @date  2019��5��14�� ����7:42:20
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
//		�κη���һ������ķ���������ʹ��foreach
	}
}
