package hello.carracinggame.domain.dto;

import hello.carracinggame.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class GameResult {

    private final List<List<Car>> gameRecords = new ArrayList<>();

    public void addGameResult(List<Car> cars) {
        this.gameRecords.add(cars);
    }

    public List<List<Car>> getRecordGameResults() {
        return gameRecords;
    }
}
