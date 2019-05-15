package chapter03;

/**
 * @author Mitnick
 * @date  2019年5月11日 下午5:19:28
 * @Description TODO
 */
public class Equivalence {
	public static void main(String[] args) {
		Integer i1 = new Integer(47);
		Integer i2 = new Integer(47);
//		== 与!=比较的是对象的引用，可以直接比较基本数据类型（八种）
//		要比较对象，使用方法equals()
		System.out.println(i1 == i2);
		System.out.println(i1.equals(i2));
	}
}
