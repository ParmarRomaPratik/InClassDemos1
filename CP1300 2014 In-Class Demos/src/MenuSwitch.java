import java.util.Scanner;

public class MenuSwitch {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter choice: ");
		int menuChoice = input.nextInt();
		// System.out.println(menuChoice);
		while (menuChoice != 0) {
			switch (menuChoice) {
			case 1:
				System.out.println("One");
				break;

			default:
				System.out.println("Unknown Option");
				break;
			}
			System.out.print("Enter choice: ");
			menuChoice = input.nextInt();
		}

	}

}
