package finalstep.model;

import java.util.List;

public class RacingGame {

	private final Cars cars;
	private final Count count;

	public RacingGame(Cars cars, Count count) {
		this.cars = cars;
		this.count = count;
	}

	public boolean isFinish() {
		return count.isNotFinish();
	}

	public RacingGame racing() {
		count.tryRacing();
		cars.racing();
		return this;
	}

	public List<Car> findWinnerCars() {
		return cars.findWinnerCars();
	}

	public Cars getCars() {
		return cars;
	}
}
