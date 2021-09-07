package finalstep.model;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PositionTest {

	@Test
	@DisplayName("위치를 생성한다.")
	public void createPosition() {
		Position position = new Position(2);

		assertThat(position).isEqualTo(new Position(2));
	}

	@Test
	@DisplayName("이동거리는 음수가 되면 예외가 발생한다.")
	public void checkPositive() {
		assertThrows(IllegalArgumentException.class,
			() -> new Position(-1));
	}

	@Test
	@DisplayName("랜덤값이 4보다 크면 한칸 이동한다.")
	public void movePosition() {
		Position position = new DummyPosition(2);
		Position move = position.move();

		assertThat(move).isEqualTo(new Position(3));
	}

	@Test
	@DisplayName("최대 이동값과 일치하면 true 이다.")
	public void isMaxPosition() {
		Position position = new Position(2);

		assertThat(position.isMaxPosition(2)).isTrue();
	}

	static class DummyPosition extends Position {

		public DummyPosition(int position) {
			super(position);
		}

		@Override
		public Position move() {
			return new Position(getPosition() + 1);
		}
	}
}
