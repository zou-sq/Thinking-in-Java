package chapter02;
/**
 * @author Mitnick
 * @date  2019年5月10日 下午5:39:19
 * @Description TODO
 */
public class Practice_1 {
	short s;  // 默认值为0
	int i;    // 默认值为0
	long l;   // 默认值为0
	
	float f;  // 默认值为0.0
	double d; // 默认值为0.0

	char c;     // char 类型的默认值是一个空格
	
	boolean b;  // 默认值为false
	
	byte b2;    // 默认值为0
	
	public static void main(String[] args) {
		Practice_1 p = new Practice_1();
		
		System.out.println(p.s);
		System.out.println(p.i);
		System.out.println(p.l);
		System.out.println(p.f);
		System.out.println(p.d);
		System.out.println(p.c);
		System.out.println(p.b);
		System.out.println(p.b2);
	}
}
