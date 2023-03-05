package hello.carracinggame.view.utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class InputDataUtilsTest {

    @Test
    @DisplayName("입력 받은 문자열을 ,로 나눈다.")
    void split_comma() {
        String input = "pobi,woni,jun";

        assertThat(InputDataUtils.splitWithComma(input)).isEqualTo(Arrays.asList("pobi", "woni", "jun"));
    }
}