package chapter03;

/**
 * @author Mitnick
 * @date  2019��5��11�� ����6:51:05
 * @Description TODO
 */
public class Literals {
	public static void main(String[] args) {
		int i1 = 0x2f;
		System.out.println("i1: " + Integer.toBinaryString(i1));
		int i2 = 0127;   //�˽�������ǰ׺0��������0~7����������ʾ
		System.out.println("i2: " + i2);
	}
}
