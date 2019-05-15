package chapter03;

/**
 * @author Mitnick
 * @date  2019年5月11日 下午5:49:07
 * @Description TODO
 */
public class Practice_6 {
	public static void main(String[] args) {
		Dog dog1 = new Dog();
		dog1.name = "spot";
		dog1.says = "Ruff! ";
		
		Dog dog3 = new Dog();
		dog3.name = "spot";
		dog3.says = "Ruff! ";
		
		System.out.println(dog3.equals(dog1));
		System.out.println(dog3.name.equals(dog1.name));
		System.out.println(dog3.says.equals(dog1.says));
	}
}
