package hello.carracinggame.utils;

import java.util.Random;

public class RandomGenerator implements MovingCondition {

    static final Random random = new Random();
    static final int MAXIMUM_LIMIT = 9;

    public RandomGenerator() {
    }

    @Override
    public int getMovingCondition() {
        return generateRandom();
    }

    private int generateRandom() {
        return random.nextInt(MAXIMUM_LIMIT);
    }
}
