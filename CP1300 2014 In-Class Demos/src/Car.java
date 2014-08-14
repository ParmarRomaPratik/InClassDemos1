/**
 * Car class demo - Java version of the Car class from CP1200
 * 
 * @author Lindsay Ward 14/08/2014
 * 
 */
public class Car {

	float fuel;
	float odometer;

	/**
	 * Constructor (initial value)
	 * 
	 * @param fuel
	 */
	public Car(float fuel) {
		this.fuel = fuel;
		odometer = 0;
	}

	@Override
	public String toString() {
		return "The car has " + fuel + " units of fuel and has driven " + odometer + "km";
	}

	public float getFuel() {
		return fuel;
	}

	void addFuel(float fuelToAdd) {
		fuel += fuelToAdd;
	}

	public float getOdometer() {
		return odometer;
	}

	/**
	 * drive the car a given distance, if it has enough fuel
	 * if it does not have enough, drive until fuel runs out
	 * @param distance desired distance to try and drive
	 * @return distance actually travelled
	 */
	float drive(float distance) {
		if (distance > fuel) {
			distance = fuel;
			fuel = 0;
		} else
			fuel -= distance;
		odometer += distance;
		return distance;
	}

}
