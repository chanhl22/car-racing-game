package hello.carracinggame;

import hello.carracinggame.controller.CarRacingGameController;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CarRacingGameApplication {

	public static void main(String[] args) {
		CarRacingGameController controller = new CarRacingGameController();
		controller.start();
	}
}
