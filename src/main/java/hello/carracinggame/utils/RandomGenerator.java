package hello.carracinggame.utils;

import java.util.Random;

public class RandomGenerator implements MovingCondition {

    public RandomGenerator() {
    }

    @Override
    public int getMovingCondition() {
        return generateRandom();
    }

    private int generateRandom() {
        Random random = new Random();
        return random.nextInt(9);
    }
}
