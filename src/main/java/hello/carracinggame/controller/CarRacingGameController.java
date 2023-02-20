package hello.carracinggame.controller;

import hello.carracinggame.domain.Play;
import hello.carracinggame.utils.Validator;
import hello.carracinggame.view.InputData;
import hello.carracinggame.view.OutputData;

import java.util.List;

public class CarRacingGameController {

    private final InputData inputData;
    private final OutputData outputData;
    private final Validator validator;
    private final Play play;

    public CarRacingGameController(InputData inputData, OutputData outputData, Validator validator, Play play) {
        this.inputData = inputData;
        this.outputData = outputData;
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
        outputData.printNameOfCarsInputMessage();
        return inputData.getNameOfCars();
    }

    private int readyTryCount() {
        outputData.printTryCountInputMessage();
        return inputData.getTryCount();
    }

    private void startGame(List<String> nameOfCars, int tryCount) {
        outputData.printExecutionMessage();
        play.readyGame(nameOfCars);
        while (tryCount-- > 0) {
            play.playARoundOfGame();
            outputData.printExecutionResult(play.getCars());
        }
    }

    private void findWinner() {
        List<String> winners = play.findWinner();
        outputData.printWinner(winners);
    }
}
