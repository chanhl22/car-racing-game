package hello.carracinggame;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class CarRacingGameApplication {

	public static void main(String[] args) {
		InputData inputData = InputData.inputData();
		List<Car> cars = CarGenerator.checkCarName(inputData.getCarNameString());
		int tryCount = inputData.getTryCount();
		OutputData.printInputData(inputData.getCarNameString(), inputData.getTryCount());

		Play.play(cars, tryCount);
		Winner.findWinner(cars);
	}
}
