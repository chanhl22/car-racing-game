package hello.carracinggame.domain;

import hello.carracinggame.domain.dto.GameResult;
import hello.carracinggame.utils.RandomGenerator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class PlayTest {

    @Test
    @DisplayName("게임을 진행한다.")
    void play_game() {
        Play play = new Play(new RandomGenerator());
        List<String> nameOfCars = Arrays.asList("pobi", "woni", "jun");
        GameResult gameResult = play.playGame(nameOfCars, 1);

        List<List<Car>> recordGameResults = gameResult.getRecordGameResults();

        assertAll(
                () -> assertThat(recordGameResults.get(0).get(0).getName())
                        .isEqualTo("pobi"),
                () -> assertThat(recordGameResults.get(0).get(0).getPosition())
                        .matches(position -> position == 0 || position == 1)
        );
    }

    @Test
    @DisplayName("우승자를 찾는다.")
    void find_winner() {
        Car car1 = new Car("pobi", 5);
        Car car2 = new Car("woni", 2);
        Car car3 = new Car("jun", 3);
        List<Car> cars = Arrays.asList(car1, car2, car3);

        Play play = new Play(cars, new RandomGenerator());

        assertThat(play.findWinner().get(0)).isEqualTo("pobi");
    }
}