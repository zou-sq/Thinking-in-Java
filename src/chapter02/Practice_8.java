package chapter02;

/**
 * @author Mitnick
 * @date  2019年5月10日 下午8:44:36
 * @Description TODO
 */
public class Practice_8 {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Student a = new Student();
		Student b = new Student();
		System.out.println(a.school.equals(b.school));
		// 静态方法本来应该是由类名直接调用的
	}
}

class Student{
	static String school = "Hainan University";
}