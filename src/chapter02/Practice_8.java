package chapter02;

/**
 * @author Mitnick
 * @date  2019��5��10�� ����8:44:36
 * @Description TODO
 */
public class Practice_8 {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Student a = new Student();
		Student b = new Student();
		System.out.println(a.school.equals(b.school));
		// ��̬��������Ӧ����������ֱ�ӵ��õ�
	}
}

class Student{
	static String school = "Hainan University";
}