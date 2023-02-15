package hello.carracinggame.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class PlayTest {

    @Test
    @DisplayName("자동차들을 가져온다.")
    void execution_result() {
        Play play = new Play();
        List<Car> cars = play.getCars();
        assertThat(cars).isNullOrEmpty();
    }

    @Test
    @DisplayName("게임에 사용할 자동차들을 생성한다.")
    void ready_game() {
        Play play = new Play();
        List<String> nameOfCars = Arrays.asList("pobi", "woni", "jun");
        play.readyGame(nameOfCars);
        assertThat(play.getCars()).anyMatch(car -> car.getName().contains("pobi"))
                .anyMatch(car -> car.getName().contains("woni"))
                .anyMatch(car -> car.getName().contains("jun"));
    }

    @Test
    @DisplayName("게임을 진행한다.")
    void a_round_of_game() {
        Car car1 = new Car("pobi", 5);
        Car car2 = new Car("woni", 2);
        Car car3 = new Car("jun", 3);
        List<Car> cars = Arrays.asList(car1, car2, car3);
        Play play = new Play(cars);
        play.playARoundOfGame();
        assertThat(play.getCars().get(0).getPosition()).matches(position -> position == 5 || position == 6);
    }

    @Test
    @DisplayName("우승자를 찾는다.")
    void find_winner() {
        Car car1 = new Car("pobi", 5);
        Car car2 = new Car("woni", 2);
        Car car3 = new Car("jun", 3);
        List<Car> cars = Arrays.asList(car1, car2, car3);
        Play play = new Play(cars);
        assertThat(play.findWinner().get(0)).isEqualTo("pobi");
    }
}