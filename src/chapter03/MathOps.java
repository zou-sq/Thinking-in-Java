package chapter03;
import java.util.Random;
/**
 * @author Mitnick
 * @date  2019��5��11�� ����11:36:33
 * @Description TODO
 */
public class MathOps {
	public static void main(String[] args) {
		Random rand = new Random(47);
		// �ڴ���Random�������ṩ���ӣ����ṩ�Ļ�Java�Ὣ
		// ��ǰʱ����Ϊ����������������ӣ��������������
		// ���ض�������ֵ���ǲ�����ͬ�����������
	
		int j;
		j = rand.nextInt(100) + 1; // ����1-100��ֵ��rand.nextInt(����)��������0-����-1��Χ�ڵ�����
		System.out.println(j);
		
		Random rand2 = new Random(66);
		Random rand3 = new Random(66);
		for (int i = 0; i < 10; i++) {
			System.out.print(rand2.nextFloat() + " ");
			System.out.println(rand3.nextFloat() + " ");
		}
		
		Random rand4 = new Random(66);
		int k = 0;
		while (k < 10) {
			System.out.print(rand4.nextBoolean() + " ");
			System.out.print(rand4.nextDouble() + "");
			System.out.print(rand4.nextFloat() + "");
			System.out.print(rand4.nextGaussian() + " ");
			System.out.println(rand4.nextLong());
			k++;
		}
	}
}
