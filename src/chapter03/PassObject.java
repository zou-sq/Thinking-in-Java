package chapter03;

/**
 * @author Mitnick
 * @date  2019年5月11日 上午11:17:23
 * @Description TODO
 */
public class PassObject {
	static void f(Letter y) {
		y.c = 'z';    //改变的是f()之外的对象
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