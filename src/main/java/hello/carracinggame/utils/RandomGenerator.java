package hello.carracinggame.utils;

import java.util.Random;

public class RandomGenerator implements MoveCondition {

    public RandomGenerator() {
    }

    @Override
    public int getMoveCondition() {
        return generateRandom();
    }

    private int generateRandom() {
        Random random = new Random();
        return random.nextInt(9);
    }
}
