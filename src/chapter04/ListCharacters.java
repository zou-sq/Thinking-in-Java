package chapter04;

/**
 * @author Mitnick
 * @date  2019��5��13�� ����1:08:43
 * @Description TODO
 */
public class ListCharacters {
	public static void main(String[] args) {
		for(char c = 0; c < 128; c++) {
//			����c��forѭ���ı��ʽ�ﱻ���壬����main()��ʼ�ĵط�����
//			c�����������for���Ƶı��ʽ�ķ�Χ��
			if(Character.isLowerCase(c))
//				ʹ����java.lang.Character��װ���࣬����಻���ܰ�char��������
//				��װ�����󣬻��б�����÷����������õ���static isLowerCase()��
//				����������е��ַ��Ƿ�ΪСд�ַ�
				System.out.println("Value: " + (int)c +
						" Character: " + c);
		}
	}
}
