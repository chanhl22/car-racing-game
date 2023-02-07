package hello.carracinggame;

import java.util.Random;

public class RandomUtils {

    public static int generateRandom() {
        Random random = new Random();
        return random.nextInt(9);
    }
}
