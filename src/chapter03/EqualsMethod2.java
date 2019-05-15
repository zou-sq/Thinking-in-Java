package chapter03;

/**
 * @author Mitnick
 * @date  2019年5月11日 下午5:35:57
 * @Description TODO
 */
public class EqualsMethod2 {
	public static void main(String[] args) {
		Value v1 = new Value();
		Value v2 = new Value();
		v1.i = v2.i =100;
		System.out.println(v1.equals(v2));
		
//		这是由于equals()默认行为是比较引用，所以除非在自己的类
//		中覆盖equal()方法，否则不可能表现出我们所希望的行为
	}
}

class Value {
	int i;
}
