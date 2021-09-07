package finalstep.model;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class NameTest {

	@Test
	@DisplayName("이름을 생성한다.")
	public void createName() {
		Name name = new Name("abc");

		assertThat(name).isEqualTo(new Name("abc"));
	}

	@Test
	@DisplayName("자동차 이름이 빈값이면 예외가 발생한다.")
	public void checkEmpty() {
		assertThrows(IllegalArgumentException.class,
			() -> new Name(""));
	}

	@Test
	@DisplayName("자동차 이름이 NULL 이면 예외가 발생한다.")
	public void checkNull() {
		assertThrows(IllegalArgumentException.class,
			() -> new Name(null));
	}

	@Test
	@DisplayName("자동차 이름이 5글자가 넘으면 예외가 발생한다.")
	public void checkLimitLength() {
		assertThrows(IllegalArgumentException.class,
			() -> new Name("cores"));
	}
}
