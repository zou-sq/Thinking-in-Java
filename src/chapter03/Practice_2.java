package chapter03;

/**
 * @author Mitnick
 * @date  2019年5月10日 下午9:37:35
 * @Description TODO
 */
public class Practice_2 {
	public static void main(String[] args) {
		Type pe1 = new Type();
		Type pe2 = new Type();
		
		pe1.f = 3.14f;
		pe1.s = "string";
		pe2.f = 9.8f;
		pe2.s = "string";
		System.out.println(pe1.f + " " + pe2.f);
		
		pe1.f = 9.8f;
		System.out.println(pe1.f + " " + pe2.f);
		System.out.println(pe1.f == pe2.f);
		
//		pe1 = pe2;
//		pe1.f = 0.1f;
//		System.out.println(pe1.f + " " + pe2.f);
		
		System.out.println(pe1.s == pe2.s);
		System.out.println(pe1.s.equals(pe2.s));
	}
}

class Type{
	float f;
	String s;
}