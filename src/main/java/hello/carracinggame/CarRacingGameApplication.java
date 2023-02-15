package hello.carracinggame;

import hello.carracinggame.controller.CarRacingGameController;
import hello.carracinggame.domain.Play;
import hello.carracinggame.utils.RandomUtils;
import hello.carracinggame.utils.Validator;
import hello.carracinggame.view.InputData;
import hello.carracinggame.view.OutputData;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CarRacingGameApplication {

    public static void main(String[] args) {
        CarRacingGameController controller = new CarRacingGameController(
                new InputData(),
                new OutputData(),
                new Validator(),
                new Play(new RandomUtils()));
        controller.start();
    }
}
