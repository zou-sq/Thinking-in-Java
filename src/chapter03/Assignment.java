package chapter03;

/**
 * @author Mitnick
 * @date  2019��5��10�� ����9:28:36
 * @Description TODO
 */
public class Assignment {
	public static void main(String[] args) {
		Tank t1 = new Tank();
		Tank t2 = new Tank();
		t1.level = 9;
		t2.level = 47;
		System.out.println("1: t1.level: " + t1.level +
				", t2.level: "  + t2.level);
		
		t1.level = t2.level;
		System.out.println("2: t1.level: " + t1.level +
				", t2.level: "  + t2.level);
		t1.level = 27;
		System.out.println("3: t1.level: " + t1.level +
				", t2.level: "  + t2.level);
		

		t1 = t2;
		System.out.println("4: t1.level: " + t1.level +
				", t2.level: "  + t2.level);
		t1.level = 27;
		System.out.println("5: t1.level: " + t1.level +
				", t2.level: "  + t2.level);
		
	}
}

class Tank{
	int level;
}