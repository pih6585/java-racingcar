package finalstep.model;

import java.util.Objects;

public class Count {

	private static final String CHECK_POSITIVE_ERROR_MESSAGE = "이동거리는 음수가 될수 없습니다.";
	private static final int ZERO_POINT = 0;

	private final int count;
	private int tryNumber;

	public Count(int count) {
		checkPositive(count);
		this.count = count;
		tryNumber = 0;
	}

	private void checkPositive(int count) {
		if (count < ZERO_POINT) {
			throw new IllegalArgumentException(CHECK_POSITIVE_ERROR_MESSAGE);
		}
	}

	public boolean isNotFinish() {
		return tryNumber < count;
	}

	public void tryRacing() {
		tryNumber += 1;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Count count1 = (Count)o;
		return count == count1.count;
	}

	@Override
	public int hashCode() {
		return Objects.hash(count);
	}

}
