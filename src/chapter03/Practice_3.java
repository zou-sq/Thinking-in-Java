package chapter03;

/**
 * @author Mitnick
 * @date  2019年5月11日 上午11:24:37
 * @Description TODO
 */
public class Practice_3 {
	static void f(Number n) {
		n.f = 9.8f;
	}
	public static void main(String[] args) {
		Number a = new Number();
		a.f = 0.1f;
		System.out.println(a.f);
		f(a);
		System.out.println(a.f);
	}
}

class Number {
	float f = 3.14f;
}