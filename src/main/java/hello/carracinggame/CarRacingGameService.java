package hello.carracinggame;

import java.util.List;

public class CarRacingGameService {

    private final InputData inputData;
    private final OutputData outputData;
    private final Play play;
    private final Winner winner;

    public CarRacingGameService() {
        this.inputData = new InputData();
        this.outputData = new OutputData();
        this.play = new Play();
        this.winner = new Winner();
    }

    public void startGame() {
        String carNames = readyCarNames();
        int tryCount = readyTryCount();
        List<Car> cars = CarGenerator.checkCarName(carNames);

        startGame(cars, tryCount);
        findWinner(cars);
    }

    private String readyCarNames() {
        outputData.printInputCarNameMessage();
        return inputData.inputCarNames();
    }

    private int readyTryCount() {
        outputData.printInputTryCountMessage();
        return inputData.inputTryCount();
    }

    private void startGame(List<Car> cars, int tryCount) {
        outputData.printExecutionMessage();
        play.startGame(cars, tryCount);
    }

    private void findWinner(List<Car> cars) {
        String winner = this.winner.findWinnerResult(cars);
        outputData.printWinner(winner);
    }
}
