package chapter03;

/**
 * @author Mitnick
 * @date  2019��5��11�� ����11:17:23
 * @Description TODO
 */
public class PassObject {
	static void f(Letter y) {
		y.c = 'z';    //�ı����f()֮��Ķ���
	}
	public static void main(String[] args) {
		Letter x = new Letter();
		x.c = 'a';
		System.out.println(x.c);
		f(x);
		System.out.println(x.c);
	}
}

class Letter {
	char c;
}