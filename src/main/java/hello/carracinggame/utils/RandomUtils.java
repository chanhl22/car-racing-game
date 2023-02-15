package hello.carracinggame.utils;

import java.util.Random;

public class RandomUtils implements MoveCondition{

    public RandomUtils() {
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
