package hello.carracinggame;

import java.util.List;

public class Play {

    public static void play(List<Car> cars, int tryCount) {
        OutputData.printExecutionMessage();
        for (int i = 0; i < tryCount; i++) {
            cars.forEach(car -> moveForward(car, RandomUtils.generateRandom()));
            OutputData.print(makeExecutionResult(cars));
            OutputData.printNewLine();
        }
    }

    public static void moveForward(Car car, int number) {
        if (number >= 4) {
            car.updatePosition();
        }
    }

    public static String makeExecutionResult(List<Car> cars) {
        StringBuilder sb = new StringBuilder();
        for (Car car : cars) {
            int position = car.getPosition();
            String temp = "-".repeat(Math.max(0, position));
            sb.append(car.getName()).append(" : ").append(temp).append("\n");
        }
        return sb.deleteCharAt(sb.length() - 1).toString();
    }
}
