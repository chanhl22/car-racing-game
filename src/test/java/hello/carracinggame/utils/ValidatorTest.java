package hello.carracinggame.utils;

import hello.carracinggame.utils.Validator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

class ValidatorTest {

    @Test
    @DisplayName("자동차 이름은 한 개 이상이다.")
    void car_is_empty() {
        Validator validator = new Validator();
        ArrayList<String> nameOfCars = new ArrayList<>();
        assertThatThrownBy(() -> validator.checkIsEmpty(nameOfCars))
                .isInstanceOf(IllegalStateException.class)
                .hasMessageContaining("[ERROR] 자동차 이름을 한개 이상 입력해주세요.");
    }

    @Test
    @DisplayName("자동차 이름은 5글자 이하이다.")
    void car_name_less_than_5() {
        Validator validator = new Validator();
        List<String> nameOfCars = Arrays.asList("Kassadin", "Anivia", "Viktor");
        assertThatThrownBy(() -> validator.checkLength(nameOfCars))
                .isInstanceOf(IllegalStateException.class)
                .hasMessageContaining("[ERROR] 자동차 이름 길이는 5이하여야 합니다.");
    }
}