package chapter03;
import java.util.Random;
/**
 * @author Mitnick
 * @date  2019年5月11日 上午11:36:33
 * @Description TODO
 */
public class MathOps {
	public static void main(String[] args) {
		Random rand = new Random(47);
		// 在创建Random对象是提供种子，不提供的话Java会将
		// 当前时间作为随机数生成器的种子，随机数生成器对
		// 于特定的种子值总是产生相同的随机数序列
	
		int j;
		j = rand.nextInt(100) + 1; // 产生1-100的值，rand.nextInt(参数)产生的是0-参数-1范围内的整数
		System.out.println(j);
		
		Random rand2 = new Random(66);
		Random rand3 = new Random(66);
		for (int i = 0; i < 10; i++) {
			System.out.print(rand2.nextFloat() + " ");
			System.out.println(rand3.nextFloat() + " ");
		}
		
		Random rand4 = new Random(66);
		int k = 0;
		while (k < 10) {
			System.out.print(rand4.nextBoolean() + " ");
			System.out.print(rand4.nextDouble() + "");
			System.out.print(rand4.nextFloat() + "");
			System.out.print(rand4.nextGaussian() + " ");
			System.out.println(rand4.nextLong());
			k++;
		}
	}
}
