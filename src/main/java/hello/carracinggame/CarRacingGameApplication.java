package hello.carracinggame;

import hello.carracinggame.controller.CarRacingGameController;
import hello.carracinggame.domain.Play;
import hello.carracinggame.utils.RandomGenerator;
import hello.carracinggame.utils.Validator;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CarRacingGameApplication {

    public static void main(String[] args) {
        CarRacingGameController controller = new CarRacingGameController(
                new Validator(),
                new Play(new RandomGenerator()));
        controller.start();
    }
}
