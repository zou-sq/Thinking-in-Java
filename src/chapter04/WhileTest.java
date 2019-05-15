package chapter04;

/**
 * @author Mitnick
 * @date  2019年5月13日 上午12:53:22
 * @Description TODO
 */
public class WhileTest {
	static boolean condition() {
		boolean result = Math.random() < 0.99;
//		Math库里的static（静态）方法random()，该方法的作用是
//		产生0和1之间的（包括0，但不包括1）的一个double值
		
		System.out.print(result + ", ");
		return result;
	}
		
	public static void main(String[] args) {
		while(condition())
			System.out.println("Inside 'while'");
		
		System.out.println("Exited 'while'");
	}
}
