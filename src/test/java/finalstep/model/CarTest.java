package finalstep.model;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarTest {

	@Test
	@DisplayName("자동차를 생성한다.")
	public void createCar() {
		Car car = Car.createCar("abc");

		assertThat(car).isEqualTo(Car.createCar("abc"));
	}

	@Test
	@DisplayName("경주의 최고 점수와 일치여부를 알수있다.")
	public void isMaxPosition() {
		Car car = Car.createCar("abc");
		boolean maxPosition = car.isMaxPosition(1);
		assertThat(maxPosition).isFalse();
	}
}
