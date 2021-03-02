import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistrationProblem {

	public String firstName;
	public String lastName;
	public String email;

	public boolean checkNamePattern(String name) {

		return (Pattern.matches("[A-Z]{1}[a-z]{2,}", name));

	}

	public boolean validation(boolean valid) {

		if (valid) {

			System.out.println("Updated");

			return true;

		}

		else {

			System.out.println("Enter valid Input");

		}

		return false;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		UserRegistrationProblem urp = new UserRegistrationProblem();

		System.out.println("Enter First Name");

		urp.firstName = sc.nextLine();

		while (!urp.validation(urp.checkNamePattern(urp.firstName)))

			urp.firstName = sc.nextLine();

		System.out.println("Enter Last Name");

		urp.lastName = sc.nextLine();

		while (!urp.validation(urp.checkNamePattern(urp.lastName)))

			urp.lastName = sc.nextLine();

		sc.close();

	}

}
