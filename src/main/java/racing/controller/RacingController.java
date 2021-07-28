package racing.controller;

import racing.domain.Racing;
import racing.view.RacingView;

public class RacingController {

	public static void main(String[] args) {
		RacingView racingView = new RacingView();
		String carsName = racingView.firstRequestView();
		int roundCount = racingView.secondRequestView();
		Racing racing = Racing.raceStart(carsName);
		racingView.racingStartView();
		for (int i = 0; i < roundCount; i++) {
			racingView.racingResultView(racing.carsRaceForResult());
		}
		racingView.racingWinnerView(racing.winnerPlayer());
	}

}
