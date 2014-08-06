import java.util.Scanner;


public class Menu {

	private static final String MENU = "Enter your choice: ";

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String menuChoice;
		System.out.print(MENU);
		menuChoice = input.nextLine();
		while (!menuChoice.toUpperCase().equals("Q")) {
			System.out.println(menuChoice);
			System.out.print(MENU);
			menuChoice = input.nextLine();
		}
		System.out.println("Finished");
	}

}
