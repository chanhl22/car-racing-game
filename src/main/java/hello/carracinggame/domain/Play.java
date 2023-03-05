package hello.carracinggame.domain;

import hello.carracinggame.domain.dto.GameResult;
import hello.carracinggame.utils.MovingCondition;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Play {

    private List<Car> cars = new ArrayList<>();
    private final MovingCondition movingCondition;

    public Play(MovingCondition movingCondition) {
        this.movingCondition = movingCondition;
    }

    public Play(List<Car> cars, MovingCondition movingCondition) {
        this.cars = cars;
        this.movingCondition = movingCondition;
    }

    public GameResult playGame(List<String> nameOfCars, int tryCount) {
        readyGame(nameOfCars);

        GameResult gameResult = new GameResult();
        while (tryCount-- > 0) {
            gameResult.addGameResult(playARoundOfGame());
        }
        return gameResult;
    }

    private void readyGame(List<String> nameOfCars) {
        this.cars = nameOfCars.stream()
                .map(Car::new)
                .collect(Collectors.toList());
    }

    private List<Car> playARoundOfGame() {
        return this.cars.stream()
                .map(car -> car.moveForward(movingCondition.getMovingCondition()))
                .collect(Collectors.toList());
    }

    public List<String> findWinner() {
        return this.cars.stream()
                .filter(car -> car.isSamePosition(findMaxPosition()))
                .map(Car::getName)
                .collect(Collectors.toList());
    }

    private int findMaxPosition() {
        return this.cars.stream()
                .max(Comparator.comparingInt(Car::getPosition))
                .map(Car::getPosition)
                .orElseThrow(() -> new IllegalStateException("[ERROR] 우승자가 없습니다."));
    }
}
