package chapter13;

/**
 * @author Mitnick
 * @date  2019年5月18日 下午7:32:35
 * @Description TODO
 */
public class Immutable {
	public static void main(String[] args) {
		String q = "howdy";
		System.out.println(q);
		String qq = upcase(q);
		System.out.println(qq);
		System.out.println(q);
	}
	
	public static String upcase(String s) {
		return s.toUpperCase();
	}
}
