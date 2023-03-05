package hello.carracinggame.view.utils;

import java.util.Arrays;
import java.util.List;

public class InputDataUtils {

    private static final String COMMA = ",";

    public static List<String> splitWithComma(String carNames) {
        return Arrays.asList(carNames.split(COMMA));
    }
}
