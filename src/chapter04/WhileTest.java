package chapter04;

/**
 * @author Mitnick
 * @date  2019��5��13�� ����12:53:22
 * @Description TODO
 */
public class WhileTest {
	static boolean condition() {
		boolean result = Math.random() < 0.99;
//		Math�����static����̬������random()���÷�����������
//		����0��1֮��ģ�����0����������1����һ��doubleֵ
		
		System.out.print(result + ", ");
		return result;
	}
		
	public static void main(String[] args) {
		while(condition())
			System.out.println("Inside 'while'");
		
		System.out.println("Exited 'while'");
	}
}
