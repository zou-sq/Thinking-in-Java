package chapter03;

/**
 * @author Mitnick
 * @date  2019年5月12日 上午1:28:39
 * @Description TODO
 */
public class Practice_9 {
	public static void main(String[] args) {
		//最大最小值已经被对应的包装器类型定义好了对应的属性：MAX_VALUE, MIN_VALUE
		float floatMax = Float.MAX_VALUE;
		float floatMin = Float.MIN_VALUE;
		System.out.println(floatMax + " " + floatMin);
		
		double doubleMax = Double.MAX_VALUE;
		double doubleMin = Double.MIN_NORMAL;
		System.out.println(doubleMax + " " + doubleMin);
	}
}
