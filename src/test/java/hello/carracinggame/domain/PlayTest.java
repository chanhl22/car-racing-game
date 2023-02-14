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
}