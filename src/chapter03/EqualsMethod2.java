package chapter03;

/**
 * @author Mitnick
 * @date  2019��5��11�� ����5:35:57
 * @Description TODO
 */
public class EqualsMethod2 {
	public static void main(String[] args) {
		Value v1 = new Value();
		Value v2 = new Value();
		v1.i = v2.i =100;
		System.out.println(v1.equals(v2));
		
//		��������equals()Ĭ����Ϊ�ǱȽ����ã����Գ������Լ�����
//		�и���equal()���������򲻿��ܱ��ֳ�������ϣ������Ϊ
	}
}

class Value {
	int i;
}
