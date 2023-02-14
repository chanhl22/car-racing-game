package hello.carracinggame.utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RandomUtilsTest {

    @Test
    @DisplayName("난수를 생성한다.")
    void random_number_generate() {
        RandomUtils randomUtils = new RandomUtils();
        assertThat(randomUtils.generateRandom())
                .isGreaterThanOrEqualTo(0)
                .isLessThanOrEqualTo(9);
    }
}