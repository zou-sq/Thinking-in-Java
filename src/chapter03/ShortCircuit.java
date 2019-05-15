package chapter03;

/**
 * @author Mitnick
 * @date  2019��5��11�� ����6:17:18
 * @Description TODO
 */
public class ShortCircuit {
	static boolean test1(int val) {
		System.out.println("test1(" + val + ")");
		System.out.println("result: " + (val < 1));
		return val < 1;
	}
	static boolean test2(int val) {
		System.out.println("test2(" + val + ")");
		System.out.println("result: " + (val < 2));
		return val < 2;
	}
	static boolean test3(int val) {
		System.out.println("test3(" + val + ")");
		System.out.println("result: " + (val < 3));
		return val < 3;
	}
	public static void main(String[] args) {
		boolean b = test1(0) && test2(3) && test3(3);
		System.out.println("b = " + b);
		
		System.out.println();
		boolean c = test1(0) || test2(2) || test3(3);
		System.out.println("c = " + c);
		
		//"&"��"|"�ǲ���·�����۵�һ���Ƿ���ȷ�������߼����ʽ��ֵ������Ѻ���ÿһ����ִ��
		System.out.println();
		boolean e = test1(0) & test2(2) & test3(3);
		System.out.println("e = " + e);
		
		System.out.println();
		boolean d = test1(0) | test2(2) | test3(3);
		System.out.println("d = " + d);
		
	}
}
