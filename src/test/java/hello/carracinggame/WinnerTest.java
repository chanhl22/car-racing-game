package hello.carracinggame;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static hello.carracinggame.Winner.findWinnerResult;
import static org.assertj.core.api.Assertions.assertThat;

class WinnerTest {

    @Test
    @DisplayName("우승자를 찾는다.")
    void find_winner() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("pobi", 1));
        cars.add(new Car("woni", 2));
        cars.add(new Car("jun", 3));
        assertThat(findWinnerResult(cars)).isEqualTo("jun");
    }
}