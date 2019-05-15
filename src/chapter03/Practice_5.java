package chapter03;

/**
 * @author Mitnick
 * @date  2019年5月11日 下午5:41:22
 * @Description TODO
 */
public class Practice_5 {
	public static void main(String[] args) {
		Dog dog1 = new Dog();
		Dog dog2 = new Dog();
		dog1.name = "spot";
		dog1.says = "Ruff! ";
		dog2.name = "scruffy";
		dog2.says = "Wurf! ";
		System.out.println(dog1.name + " " + dog1.says);
		System.out.println(dog2.name + " " + dog2.says);
	}
}

class Dog {
	String name;
	String says;
}