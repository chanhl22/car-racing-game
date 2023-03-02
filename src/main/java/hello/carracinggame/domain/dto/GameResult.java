package hello.carracinggame.domain.dto;

import hello.carracinggame.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class GameResult {

    private final List<List<Car>> recordGameResults = new ArrayList<>();

    public void addGameResult(List<Car> cars) {
        this.recordGameResults.add(cars);
    }

    public List<List<Car>> getRecordGameResults() {
        return recordGameResults;
    }
}
