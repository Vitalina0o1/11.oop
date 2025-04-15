import java.io.PrintStream;

public class My_Dogs {

	public static void main(String[] args) {
		Dog dog1 = new Dog();
		//Scanner sc = new Scanner (System.in);
		PrintStream o = System.out;
		dog1.setName("Лайка");
		dog1.shy();
		
		o.println(dog1.getPaddedName());
		o.println(dog1.getPaddedExpression());

	}

}
