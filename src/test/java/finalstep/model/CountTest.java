package finalstep.model;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CountTest {

	@Test
	@DisplayName("카운트를 생성한다.")
	public void createCount() {
		Count count = new Count(2);

		assertThat(count).isEqualTo(new Count(2));
	}

	@Test
	@DisplayName("카운트가 음수이면 예외가 발생한다.")
	public void checkPositive() {
		assertThrows(IllegalArgumentException.class,
			() -> new Count(-1));
	}

	@Test
	@DisplayName("카운트와 시도회수가 같으면 레이싱 종료이다.")
	public void isFinish() {
		Count count = new Count(2);
		count.tryRacing();
		count.tryRacing();

		assertThat(count.isNotFinish()).isFalse();
	}

}