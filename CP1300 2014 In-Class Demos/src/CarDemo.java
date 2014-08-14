import java.io.IOException;
import java.util.Scanner;

/**
 * Car class usage demo - Java version of the Car class program from CP1200
 * 
 * @author Lindsay Ward 14/08/2014
 * 
 */
// note that you do not need to import your own classes in the same package in your projects

public class CarDemo {

	private static final String MENU = "Menu:\nd) drive\nr) refuel\nq) quit";

	public static void main(String[] args) throws IOException {

		// Create an instance of a Car with an initial fuel value of 100
		Car car = new Car(100.0f);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Let's drive!");
		// The following line will print the car object using the toString method in the class
		System.out.println(car);
		System.out.println(MENU);

		String choice = scanner.nextLine();
		while (!choice.equals("q")) {
			switch (choice) {
			case "d":
				System.out.print("How many km do you wish to drive? ");
				float distanceToDrive = scanner.nextFloat();
				scanner.nextLine();
				float distanceDriven = car.drive(distanceToDrive);
				System.out.print("The car drove " + distanceDriven + "km");
				// using a getter method on the next line 
				if (car.getFuel() == 0)
					System.out.print(" and ran out of fuel");
				System.out.println(".");
				break;
			case "r":
				System.out.println("How many units of fuel do you want to add to the car? ");
				float fuelToAdd = scanner.nextFloat();
				scanner.nextLine();
				while (fuelToAdd < 0) {
					System.out.println("Fuel amount must be >= 0");
					System.out.println("How many units of fuel do you want to add to the car? ");
					fuelToAdd = scanner.nextFloat();
					scanner.nextLine();
				}
				// calling a mutator method below
				car.addFuel(fuelToAdd);
				System.out.println("Added " + fuelToAdd + " units of fuel.");
				break;
			default:
				System.out.println("Invalid choice");
			}
			System.out.println("\n" + car);
			System.out.println(MENU);
			choice = scanner.nextLine();
		}
		System.out.println("\nGood bye!");
	}
}
