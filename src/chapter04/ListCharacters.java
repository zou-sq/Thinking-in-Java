package chapter04;

/**
 * @author Mitnick
 * @date  2019年5月13日 上午1:08:43
 * @Description TODO
 */
public class ListCharacters {
	public static void main(String[] args) {
		for(char c = 0; c < 128; c++) {
//			变量c在for循环的表达式里被定义，不是main()开始的地方定义
//			c的作用域就是for控制的表达式的范围内
			if(Character.isLowerCase(c))
//				使用了java.lang.Character包装器类，这个类不但能把char基本类型
//				包装进对象，还有别的有用方法，这里用到的static isLowerCase()方
//				法检查问题中的字符是否为小写字符
				System.out.println("Value: " + (int)c +
						" Character: " + c);
		}
	}
}
