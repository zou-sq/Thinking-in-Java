package chapter02;

/**
 * @author Mitnick
 * @date  2019��5��10�� ����8:36:18
 * @Description TODO
 */
public class Practice_7 {
	public static void main(String[] args) {
		Incrementable.increment();
		System.out.println(StaticTest.i);
	}
}

class StaticTest{
	static int i =47;
}

class Incrementable{
	static void increment() {
		StaticTest.i++;
	}
}
