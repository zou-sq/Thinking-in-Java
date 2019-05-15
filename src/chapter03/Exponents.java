package chapter03;

/**
 * @author Mitnick
 * @date  2019年5月12日 上午1:17:10
 * @Description TODO
 */
public class Exponents {
	public static void main(String[] args) {
		float expFloat = 1.39e-43f;
		expFloat = 1.39E-43f;   // 大写和小写的'e'都可以
		System.out.println(expFloat);
		
		double expDouble = 47e47d; //'d'可以不用
		@SuppressWarnings("unused")
		double exoDouble2 = 47e47;  //自动转换成double
		System.out.println(expDouble);
		
	}
}
