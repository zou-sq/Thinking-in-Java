package chapter03;

/**
 * @author Mitnick
 * @date  2019��5��11�� ����5:19:28
 * @Description TODO
 */
public class Equivalence {
	public static void main(String[] args) {
		Integer i1 = new Integer(47);
		Integer i2 = new Integer(47);
//		== ��!=�Ƚϵ��Ƕ�������ã�����ֱ�ӱȽϻ����������ͣ����֣�
//		Ҫ�Ƚ϶���ʹ�÷���equals()
		System.out.println(i1 == i2);
		System.out.println(i1.equals(i2));
	}
}
