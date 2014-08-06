import java.util.Scanner;

public class Menu {

	private static final String MENU = "Enter your choice: ";

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String menuChoice;
		System.out.print(MENU);
		menuChoice = input.nextLine().toUpperCase();
		while (!menuChoice.equals("Q")) {
			// System.out.println(menuChoice);
			switch (menuChoice) {
			case "I":
				System.out.println("Instructions");
				break;
			case "P":
				System.out.println("Play");
				break;

			default:
				System.out.println("Unknown option");
				break;
			}
			System.out.print(MENU);
			menuChoice = input.nextLine().toUpperCase();
		}
		System.out.println("Finished");
	}
}
