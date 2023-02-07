package hello.carracinggame;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class InputDataTest {

    @Test
    @DisplayName("입력받은 자동차 이름 문자열을 가져온다.")
    void get_car_name() {
        InputData inputData = new InputData("pobi,woni,jun");
        assertThat(inputData.getCarNameString()).isEqualTo("pobi,woni,jun");
    }

    @Test
    @DisplayName("입력받은 시도 횟수를 가져온다.")
    void get_try_count() {
        InputData inputData = new InputData(5);
        assertThat(inputData.getTryCount()).isEqualTo(5);
    }
}