package hello.carracinggame.utils;

import java.util.Random;

public class RandomUtils {

    public RandomUtils() {
    }

    public int generateRandom() {
        Random random = new Random();
        return random.nextInt(9);
    }
}
