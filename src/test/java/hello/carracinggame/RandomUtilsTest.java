package hello.carracinggame;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static hello.carracinggame.RandomUtils.generateRandom;
import static org.assertj.core.api.Assertions.assertThat;

class RandomUtilsTest {

    @Test
    @DisplayName("난수를 생성한다.")
    void random_number_generate() {
        assertThat(generateRandom())
                .isGreaterThanOrEqualTo(0)
                .isLessThanOrEqualTo(9);
    }
}