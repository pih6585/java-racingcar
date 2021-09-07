package finalstep.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Cars {

	private static final String REGEX = ",";
	private static final String CHECK_DUPLICATION_ERROR_MESSAGE = "중복되는 자동차 이름이 존재 합니다.";
	private final List<Car> cars;

	public Cars(List<Car> cars) {
		this.cars = cars;
	}

	public Cars(String name) {
		String[] carsName = toSplit(name);
		checkDuplication(carsName);
		cars = toList(carsName);
	}

	private String[] toSplit(String carsName) {
		return carsName.split(REGEX);
	}

	private void checkDuplication(String[] carsName) {
		if (Arrays.stream(carsName)
			.distinct()
			.count() != Arrays.stream(carsName).count()) {
			throw new IllegalArgumentException(CHECK_DUPLICATION_ERROR_MESSAGE);
		}
	}

	private List<Car> toList(String[] carsName) {
		return Arrays.stream(carsName)
			.map(Car::createCar)
			.collect(Collectors.toList());
	}

	public List<Car> racing() {
		for (Car car : cars) {
			car.racing();
		}
		return Collections.unmodifiableList(cars);
	}

	public List<Car> resultCars() {
		return cars;
	}

	public List<Car> findWinnerCars() {
		return cars.stream()
			.filter(car -> car.isMaxPosition(maxPosition()))
			.collect(Collectors.toList());
	}

	public int maxPosition() {
		return cars.stream()
			.mapToInt(Car::getPosition)
			.max()
			.orElse(0);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Cars cars1 = (Cars)o;
		return Objects.equals(cars, cars1.cars);
	}

	@Override
	public int hashCode() {
		return Objects.hash(cars);
	}

}
