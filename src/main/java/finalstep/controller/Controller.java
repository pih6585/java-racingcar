package finalstep.controller;

import finalstep.model.Cars;
import finalstep.model.Count;
import finalstep.model.RacingGame;
import finalstep.view.InputView;
import finalstep.view.OutputView;

public class Controller {

	public void run() {
		Cars cars = new Cars(InputView.inputName());
		Count count = new Count(InputView.inputRoundCount());

		RacingGame racingGame = new RacingGame(cars, count);

		OutputView.printResult();
		while (racingGame.isFinish()) {
			OutputView.printResultByRound(racingGame.racing());
		}
		OutputView.printWinnerCars(racingGame.findWinnerCars());
	}
}
