import java.util.Scanner;

/**
 * 
 */

/**
 * @author Tobias
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HelloUser user = new HelloUser();
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello ASE2015 - how are you now? :)");
		System.out.println("Please enter your name: ");
		String r = sc.nextLine();
		System.out.println(user.greetUser(r));
	}

}
