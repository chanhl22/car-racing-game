package hello.carracinggame;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CarTest {

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
}