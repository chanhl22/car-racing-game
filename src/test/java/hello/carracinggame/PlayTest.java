package hello.carracinggame;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class PlayTest {

    @Test
    @DisplayName("무작위 값이 4 이상이면 전진한다.")
    void move_forward() {
        Play play = new Play();
        Car car1 = new Car("pobi");
        play.moveForward(car1, 5);
        assertThat(car1.getPosition()).isEqualTo(1);

        Car car2 = new Car("woni");
        play.moveForward(car2, 3);
        assertThat(car2.getPosition()).isEqualTo(0);
    }

    @Test
    @DisplayName("각 차수별 실행 결과.")
    void execution_result() {
        Play play = new Play();
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("pobi", 1));
        cars.add(new Car("woni", 2));
        cars.add(new Car("jun", 4));
        assertThat(play.makeExecutionResult(cars)).isEqualTo(
                "pobi : -\n" +
                        "woni : --\n" +
                        "jun : ----");
    }
}