package hello.carracinggame.domain;

import hello.carracinggame.utils.MoveCondition;

import java.util.List;
import java.util.stream.Collectors;

public class Play {

    private List<Car> cars;
    private final MoveCondition moveCondition;

    public Play(MoveCondition moveCondition) {
        this.moveCondition = moveCondition;
    }

    public Play(List<Car> cars, MoveCondition moveCondition) {
        this.cars = cars;
        this.moveCondition = moveCondition;
    }

    public void readyGame(List<String> nameOfCars) {
        this.cars = nameOfCars.stream()
                .map(Car::new)
                .collect(Collectors.toList());
    }

    public void playARoundOfGame() {
        this.cars.forEach(car -> car.moveForward(moveCondition.getMoveCondition()));
    }

    public List<Car> getCars() {
        return cars;
    }

    public List<String> findWinner() {
        return this.cars.stream()
                .filter(car -> car.isMaximumPosition(findMaxPosition()))
                .map(Car::getName)
                .collect(Collectors.toList());
    }

    private Integer findMaxPosition() {
        return this.cars.stream()
                .max((o1, o2) -> o1.getPosition() - o2.getPosition())
                .map(Car::getPosition)
                .orElseThrow(() -> new IllegalStateException("[ERROR] 우승자가 없습니다."));
    }
}
