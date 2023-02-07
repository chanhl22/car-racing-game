package hello.carracinggame;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static hello.carracinggame.CarRacingGameApplication.executionResult;
import static hello.carracinggame.CarRacingGameApplication.findWinner;
import static hello.carracinggame.CarRacingGameApplication.generateRandom;
import static hello.carracinggame.CarRacingGameApplication.moveForward;
import static org.assertj.core.api.Assertions.assertThat;

class CarRacingGameApplicationTest {

    @Test
    @DisplayName("자동차 이름을 가져온다.")
    void get_car_name() {
        Car car = new Car("pobi");
        assertThat(car.getName()).isEqualTo("pobi");
    }

    @Test
    @DisplayName("자동차 현재 위치를 가져온다")
    void get_car_position() {
        Car car = new Car("pobi");
        assertThat(car.getPosition()).isEqualTo(0);
    }

    @Test
    @DisplayName("자동차 현재 위치를 변경한다.")
    void update_car_position() {
        Car car = new Car("pobi");
        car.updatePosition();
        assertThat(car.getPosition()).isEqualTo(1);
    }

    @Test
    @DisplayName("난수를 생성한다.")
    void random_number_generate() {
        assertThat(generateRandom()).isGreaterThanOrEqualTo(0).isLessThanOrEqualTo(9);
    }

    @Test
    @DisplayName("무작위 값이 4 이상이면 전진한다.")
    void move_forward() {
        Car car1 = new Car("pobi");
        moveForward(car1, 5);
        assertThat(car1.getPosition()).isEqualTo(1);

        Car car2 = new Car("woni");
        moveForward(car2, 3);
        assertThat(car2.getPosition()).isEqualTo(0);
    }

    @Test
    @DisplayName("각 차수별 실행 결과.")
    void execution_result() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("pobi", 1));
        cars.add(new Car("woni", 2));
        cars.add(new Car("jun", 4));
        assertThat(executionResult(cars)).isEqualTo(
                "pobi : -\n" +
                "woni : --\n" +
                "jun : ----");
    }

    @Test
    @DisplayName("우승자를 찾는다.")
    void find_winner() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("pobi", 1));
        cars.add(new Car("woni", 2));
        cars.add(new Car("jun", 3));
        assertThat(findWinner(cars)).isEqualTo("jun");
    }
}