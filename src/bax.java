import java.io.PrintStream;
import java.util.Collections;
import java.util.Scanner;

public class bax {

	public static void main(String[] args) {
		Cat cat1 = new Cat();
		
        PrintStream o = System.out;
        
		Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя  1  кошки: ");
		String a =sc.nextLine();
		cat1.setName(a);
		System.out.println("имя кошки: "+cat1.getName());
		
		
		System.out.println("Выберите действие: ");
		System.out.println("1. спать");
		System.out.println("2. улыбаться");
		System.out.println("3. умереть");
		
		
		int b =sc.nextInt();
		sc.nextLine();
		switch (b) {
		case 1:
			cat1.sleep();
			break;
		case 2:
			cat1.smile();
			break;
		case 3:
			cat1.die();
			break;
			
		}
		//o.println(cat1.getExpression());
		
		Cat cat2 = new Cat();
		System.out.println("Введите имя 2 кошки: ");
		String c =sc.nextLine();
		cat2.setName(c);
		System.out.println("имя кошки: "+cat2.getName());
		
		
		System.out.println("Выберите действие: ");
		System.out.println("1. спать");
		System.out.println("2. улыбаться");
		System.out.println("3. умереть");
		
		
		int k =sc.nextInt();
		sc.nextLine();
		switch (k) {
		case 1:
			cat2.sleep();
			break;
		case 2:
			cat2.smile();
			break;
		case 3:
			cat2.die();
			break;
			
		}
		//String test = String.join("", Collections.nCopies(3, " "));t

		o.println(cat1.getPaddedName()+" "+ cat2.getPaddedName());
		o.println(cat1.getPaddedExpression()+" "+cat2.getPaddedExpression());

	}


}
