package finalstep.view;

import java.util.Scanner;

public class InputView {

	private static final String INPUT_NAME_MESSAGE = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).";
	private static final String INPUT_ROUND_COUNT_MESSAGE = "시도할 회수는 몇회인가요?";
	private static final String INTEGER_TYPE_MATCH_ERROR_MESSAGE = "숫자만 입력 가능합니다.";

	private static final Scanner scanner = new Scanner(System.in);

	public static String inputName() {
		System.out.println(INPUT_NAME_MESSAGE);
		return scanner.nextLine();
	}

	public static int inputRoundCount() {
		System.out.println(INPUT_ROUND_COUNT_MESSAGE);
		if (!scanner.hasNextInt()) {
			throw new IllegalStateException(INTEGER_TYPE_MATCH_ERROR_MESSAGE);
		}
		return scanner.nextInt();
	}
}
