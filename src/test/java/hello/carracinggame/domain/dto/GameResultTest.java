package hello.carracinggame.domain.dto;

import hello.carracinggame.domain.Car;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class GameResultTest {

    @Test
    @DisplayName("게임 결과를 가져온다.")
    void get_result() {
        GameResult gameResult = new GameResult();

        assertThat(gameResult.getRecordGameResults().size()).isEqualTo(0);
    }

    @Test
    @DisplayName("게임 결과를 추가한다.")
    void add_result() {
        GameResult gameResult = new GameResult();
        Car car1 = new Car("pobi", 5);
        Car car2 = new Car("woni", 2);
        Car car3 = new Car("jun", 3);
        List<Car> cars = Arrays.asList(car1, car2, car3);

        gameResult.addGameResult(cars);

        assertThat(gameResult.getRecordGameResults().size()).isEqualTo(1);
    }
}