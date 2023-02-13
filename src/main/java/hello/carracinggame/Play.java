package hello.carracinggame;

import java.util.List;

public class Play {

    public Play() {
    }

    public List<Car> aRoundOfGame(List<String> nameOfCars) {

        return null;
    }

//    public void startGame(List<Car> cars, int tryCount) {
//        for (int i = 0; i < tryCount; i++) {
//            cars.forEach(car -> moveForward(car, RandomUtils.generateRandom()));
//            OutputData.print(makeExecutionResult(cars));
//            OutputData.printNewLine();
//        }
//    }

    public void moveForward(Car car, int number) {
        if (number >= 4) {
            car.updatePosition();
        }
    }

    public String makeExecutionResult(List<Car> cars) {
        StringBuilder sb = new StringBuilder();
        for (Car car : cars) {
            int position = car.getPosition();
            String temp = "-".repeat(Math.max(0, position));
            sb.append(car.getName()).append(" : ").append(temp).append("\n");
        }
        return sb.deleteCharAt(sb.length() - 1).toString();
    }
}
