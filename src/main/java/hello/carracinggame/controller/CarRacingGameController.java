package hello.carracinggame.controller;

import hello.carracinggame.domain.Play;
import hello.carracinggame.domain.dto.GameResult;
import hello.carracinggame.utils.Validator;
import hello.carracinggame.view.InputData;
import hello.carracinggame.view.OutputData;

import java.util.List;

public class CarRacingGameController {

    private final Validator validator;
    private final Play play;

    public CarRacingGameController(Validator validator, Play play) {
        this.validator = validator;
        this.play = play;
    }

    public void start() {
        List<String> nameOfCars = readyNameOfCars();
        int tryCount = readyTryCount();

        validator.validateNameOfCars(nameOfCars);

        startGame(nameOfCars, tryCount);
        findWinner();
    }

    private List<String> readyNameOfCars() {
        OutputData.printNameOfCarsInputMessage();
        return InputData.getNameOfCars();
    }

    private int readyTryCount() {
        OutputData.printTryCountInputMessage();
        return InputData.getTryCount();
    }

    private void startGame(List<String> nameOfCars, int tryCount) {
        GameResult gameResult = play.playGame(nameOfCars, tryCount);
        OutputData.printGameResult(gameResult);
    }

    private void findWinner() {
        List<String> winners = play.findWinner();
        OutputData.printWinner(winners);
    }
}
