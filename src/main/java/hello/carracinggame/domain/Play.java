package hello.carracinggame.domain;

import hello.carracinggame.utils.RandomUtils;

import java.util.List;
import java.util.stream.Collectors;

public class Play {

    private List<Car> cars;
    private final RandomUtils randomUtils;

    public Play() {
        this.randomUtils = new RandomUtils();
    }

    public void readyGame(List<String> nameOfCars) {
        this.cars = nameOfCars.stream()
                .map(Car::new)
                .collect(Collectors.toList());
    }

    public void aRoundOfGame() {
        this.cars.forEach(car -> car.moveForward(randomUtils.generateRandom()));
    }

    public List<Car> getCars() {
        return cars;
    }
}
