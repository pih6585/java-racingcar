package finalstep.view;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import finalstep.model.Car;
import finalstep.model.RacingGame;

public class OutputView {

	private static final String RESULT_MESSAGE = "실행결과";
	private static final int START_INCLUSIVE = 0;
	private static final String FINAL_WINNERS_MESSAGE = " 가 최종 우승했습니다.";

	public static void printResult() {
		System.out.println(RESULT_MESSAGE);
	}

	public static void printResultByRound(RacingGame racingGame) {
		for (Car car : racingGame.getCars().resultCars()) {
			System.out.println(car.getName() + " : " + convertPosition(car.getPosition()));
		}
		System.out.println();
	}

	private static String convertPosition(int position) {
		return IntStream.range(START_INCLUSIVE, position)
			.mapToObj(i -> "-")
			.collect(Collectors.joining());
	}

	public static void printWinnerCars(List<Car> winnerCars) {
		System.out.println(getWinnersName(winnerCars) + FINAL_WINNERS_MESSAGE);
	}

	private static String getWinnersName(List<Car> winnerCars) {
		return winnerCars.stream()
			.map(Car::getName)
			.collect(Collectors.joining(","));
	}
}
