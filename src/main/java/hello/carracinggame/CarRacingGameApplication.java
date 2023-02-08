package hello.carracinggame;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class CarRacingGameApplication {

	public static void main(String[] args) {
		CarRacingGameService carRacingGameService = new CarRacingGameService();
		carRacingGameService.startGame();
	}
}
