package hello.carracinggame;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static hello.carracinggame.CarGenerator.checkCarLength;
import static hello.carracinggame.CarGenerator.checkIsEmpty;
import static hello.carracinggame.CarGenerator.initCar;
import static hello.carracinggame.CarGenerator.splitCarName;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

class CarGeneratorTest {

    @Test
    @DisplayName("자동차 이름을 쉼표로 구분한다.")
    void split_car_name() {
        assertThat(splitCarName("pobi,woni,jun")).contains("pobi", "woni", "jun");
    }

    @Test
    @DisplayName("자동차 이름은 한 개 이상이다.")
    void car_is_empty() {
        assertThatThrownBy(() -> checkIsEmpty(new String[]{}))
                .isInstanceOf(IllegalStateException.class)
                .hasMessageContaining("[ERROR] 자동차 이름을 한개 이상 입력해주세요.");
    }

    @Test
    @DisplayName("자동차 이름은 5글자 이하이다.")
    void car_name_less_than_5() {
        assertThatThrownBy(() -> checkCarLength(new String[]{"Kassadin", "Anivia", "Viktor"}))
                .isInstanceOf(IllegalStateException.class)
                .hasMessageContaining("[ERROR] 자동차 이름 길이는 5이하여야 합니다.");
    }

    @Test
    @DisplayName("자동차 객체를 만든다.")
    void init_car() {
        assertThat(initCar(new String[]{"pobi", "woni", "jun"}).size()).isEqualTo(3);
    }
}