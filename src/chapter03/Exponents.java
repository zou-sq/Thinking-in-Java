package chapter03;

/**
 * @author Mitnick
 * @date  2019��5��12�� ����1:17:10
 * @Description TODO
 */
public class Exponents {
	public static void main(String[] args) {
		float expFloat = 1.39e-43f;
		expFloat = 1.39E-43f;   // ��д��Сд��'e'������
		System.out.println(expFloat);
		
		double expDouble = 47e47d; //'d'���Բ���
		@SuppressWarnings("unused")
		double exoDouble2 = 47e47;  //�Զ�ת����double
		System.out.println(expDouble);
		
	}
}
