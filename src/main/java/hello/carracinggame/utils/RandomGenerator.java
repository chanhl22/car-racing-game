package hello.carracinggame.utils;

import java.util.Random;

public class RandomGenerator implements MovingCondition {

    static final Random random = new Random();

    public RandomGenerator() {
    }

    @Override
    public int getMovingCondition() {
        return generateRandom();
    }

    private int generateRandom() {
        return random.nextInt(9);
    }
}
