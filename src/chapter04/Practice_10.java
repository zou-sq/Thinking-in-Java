package chapter04;

/**
 * @author Mitnick
 * @date  2019年5月15日 上午1:28:28
 * @Description TODO
 */
public class Practice_10 {
	static int digit(int i) {
		return i % 10;
	}
	static int tenDigit(int i) {
		return (i % 100 / 10);
	}
	static int hundredDigit(int i) {
		return (i % 1000 / 100);
	}
	static int thousandDigit(int i) {
		return (i / 1000);
	}
	static void test(int m, int n) {
		if (m % 10 == 0 && n % 10 == 0);
		else
			System.out.println(m * n);
	}
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		for(int j = 1000; j < 10000; j++) {
			int a, b, c, d;
			a = thousandDigit(j);
			b = hundredDigit(j);
			c = tenDigit(j);
			d = digit(j);
			
			if((a * 10 + b ) * (c * 10 + d) == j)
				test(a * 10 + b, c * 10 + d);
			else if((a * 10 + b ) * (d * 10 + c) == j)
				test(a * 10 + b, d * 10 + c);
			else if((b * 10 + a ) * (d * 10 + c) == j)
				test(b * 10 + a, d * 10 + c);
			else if((b * 10 + a ) * (c * 10 + d) == j)
				test(b * 10 + a, c * 10 + d);
			
			else if((a * 10 + c ) * (d * 10 + b) == j)
				test(a * 10 + c, d * 10 + b);
			else if((a * 10 + c ) * (b * 10 + d) == j)
				test(a * 10 + c, b * 10 + d);
			else if((c * 10 + a ) * (d * 10 + b) == j)
				test(c * 10 + a, d * 10 + b);
			else if((c * 10 + a ) * (b * 10 + d) == j)
				test(c * 10 + a, b * 10 + d);
			
			else if((a * 10 + d ) * (c * 10 + b) == j)
				test(a * 10 + d, c * 10 + b);
			else if((a * 10 + d ) * (b * 10 + c) == j)
				test(a * 10 + d, b * 10 + c);
			else if((d * 10 + a ) * (c * 10 + b) == j)
				test(d * 10 + a, c * 10 + b);
			else if((d * 10 + a ) * (b * 10 + c) == j)
				test(d * 10 + a, b * 10 + c);
		}
		long endTime = System.nanoTime();
		System.out.println(startTime +" " +  endTime + " " + (endTime - startTime));
	}
}
