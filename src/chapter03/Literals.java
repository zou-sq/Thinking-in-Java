package chapter03;

/**
 * @author Mitnick
 * @date  2019年5月11日 下午6:51:05
 * @Description TODO
 */
public class Literals {
	public static void main(String[] args) {
		int i1 = 0x2f;
		System.out.println("i1: " + Integer.toBinaryString(i1));
		int i2 = 0127;   //八进制数由前缀0及后续的0~7的数字来表示
		System.out.println("i2: " + i2);
	}
}
