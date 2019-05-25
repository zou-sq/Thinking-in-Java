package chapter13;

/**
 * @author Mitnick
 * @date  2019年5月20日 上午12:43:53
 * @Description TODO
 */
public class Super_24 {
	public static void main(String[] args) {
		String[] c = {"+", "-", "*", "/"};
//		System.out.println(c.length);
//		System.out.println(c[0]);
		
		int sum = 1;
		for(int i = 0; i < c.length; i++) {
			for(int j = 0; j < c.length; j++) {
				for(int k = 0; k < c.length; k++) {
					System.out.println(sum++ + ": " + 'a' + c[i] + 'b' + c[j] + 'c' + c[k] + 'd');
//					System.out.println(1 + c[i] + 2 + c[j] + 3 + c[k] + 4);
				}
			}
		}
		
		System.out.println(sum);
	}
}
