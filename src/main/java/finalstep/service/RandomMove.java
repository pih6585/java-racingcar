package finalstep.service;

import java.util.Random;

public class RandomMove {

	private static final Random random = new Random(10);

	public static int generateValue() {
		return random.nextInt();
	}
}
