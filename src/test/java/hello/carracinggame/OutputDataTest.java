package hello.carracinggame;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static hello.carracinggame.OutputData.makeExecutionMessage;
import static hello.carracinggame.OutputData.makeInputCarNameMessage;
import static hello.carracinggame.OutputData.makeInputTryCountMessage;
import static org.assertj.core.api.Assertions.assertThat;

class OutputDataTest {

    @Test
    @DisplayName("입력받은 자동차 이름 출력하기.")
    void make_input_car_name_message() {
        assertThat(makeInputCarNameMessage("pobi,woni,jun")).isEqualTo(
                "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)\n" +
                        "pobi,woni,jun");
    }

    @Test
    @DisplayName("입력받은 시도 횟수 출력하기.")
    void make_input_try_count_message() {
        assertThat(makeInputTryCountMessage(5)).isEqualTo(
                "시도할 회수는 몇회인가요?\n" + 5);
    }

    @Test
    @DisplayName("실행 결과 출력하기.")
    void make_execution_message() {
        assertThat(makeExecutionMessage()).isEqualTo(
                "실행 결과");
    }
}