package finalstep.model;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarsTest {

	@Test
	@DisplayName("자동차들을 생성한다.")
	public void createCars() {
		Cars cars = new Cars("aaa,bbb,ccc");

		assertThat(cars).isEqualTo(new Cars("aaa,bbb,ccc"));
	}

	@Test
	@DisplayName("자동차들의 이름이 중복되면 예외가 발생한다.")
	public void checkDuplication() {
		assertThrows(IllegalArgumentException.class,
			() -> new Cars("aaa,aaa,bbb"));
	}

	@Test
	@DisplayName("레이싱의 최고 점수를 알수 있다.")
	public void maxPosition() {
		Cars cars = new Cars(getCars());

		assertThat(cars.maxPosition()).isEqualTo(3);
	}

	@Test
	@DisplayName("레이싱의 우승자를 알 수 있다.")
	public void findWinnerCars() {
		Cars cars = new Cars(getCars());

		assertThat(cars.findWinnerCars()).containsExactly(new Car("aaa", 3));
	}

	private List<Car> getCars() {
		List<Car> cars = new ArrayList<>();
		cars.add(new Car("aaa", 3));
		cars.add(new Car("bbb", 2));
		cars.add(new Car("ccc", 1));
		return cars;
	}
}
