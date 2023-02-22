package hello.carracinggame.domain;

import hello.carracinggame.domain.dto.GameResult;
import hello.carracinggame.utils.MoveCondition;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Play {

    private List<Car> cars = new ArrayList<>();
    private final MoveCondition moveCondition;

    public Play(MoveCondition moveCondition) {
        this.moveCondition = moveCondition;
    }

    public Play(List<Car> cars, MoveCondition moveCondition) {
        this.cars = cars;
        this.moveCondition = moveCondition;
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
                .map(car -> car.moveForward(moveCondition.getMoveCondition()))
                .collect(Collectors.toList());
    }

    public List<String> findWinner() {
        return this.cars.stream()
                .filter(car -> car.isMaximumPosition(findMaxPosition()))
                .map(Car::getName)
                .collect(Collectors.toList());
    }

    private int findMaxPosition() {
        return this.cars.stream()
                .max((o1, o2) -> o1.getPosition() - o2.getPosition())
                .map(Car::getPosition)
                .orElseThrow(() -> new IllegalStateException("[ERROR] 우승자가 없습니다."));
    }
}
