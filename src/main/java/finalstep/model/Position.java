package finalstep.model;

import java.util.Objects;

import finalstep.service.RandomMove;

public class Position {

	private static final String CHECK_POSITIVE_ERROR_MESSAGE = "이동거리는 음수가 될수 없습니다.";
	private static final int ZERO_POINT = 0;
	private final int position;

	public Position(int position) {
		checkPositive(position);
		this.position = position;
	}

	private void checkPositive(int position) {
		if (position < ZERO_POINT) {
			throw new IllegalArgumentException(CHECK_POSITIVE_ERROR_MESSAGE);
		}
	}

	public Position move() {
		if (moveCondition()) {
			return new Position(position);
		}
		return new Position(position + 1);
	}

	private boolean moveCondition(){
		return RandomMove.generateValue() < 4;
	}

	public int getPosition() {
		return position;
	}

	public boolean isMaxPosition(int maxPosition) {
		return position == maxPosition;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Position position1 = (Position)o;
		return position == position1.position;
	}

	@Override
	public int hashCode() {
		return Objects.hash(position);
	}

}
