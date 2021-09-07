package finalstep.model;

import java.util.Objects;

public class Car {

	private final Name name;
	private Position position;

	public Car(Name name, Position position) {
		this.name = name;
		this.position = position;
	}

	public Car(String name, int position) {
		this.name = new Name(name);
		this.position = new Position(position);
	}

	public static Car createCar(String name) {
		return new Car(new Name(name), new Position(0));
	}

	public Car racing() {
		position = position.move();
		return this;
	}

	public String getName() {
		return name.getName();
	}

	public int getPosition() {
		return position.getPosition();
	}

	public boolean isMaxPosition(int maxPosition) {
		return position.isMaxPosition(maxPosition);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Car car = (Car)o;
		return Objects.equals(name, car.name) && Objects.equals(position, car.position);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, position);
	}

}
