package chapter03;

/**
 * @author Mitnick
 * @date  2019年5月11日 下午5:06:31
 * @Description TODO
 */
public class AutoInc {
	public static void main(String[] args) {
		int i = 5, j = 8;
		
		System.out.println("i++: " + i++); //后缀先生成整个表达式的值，再执行自增或者自减的运算
		
		System.out.println("++j: " + ++j); //前缀先执行自增或者自减的运算，再生成整个表达式的值
	}
}
