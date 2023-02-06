package hello.carracinggame;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

@SpringBootApplication
public class CarRacingGameApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String cars = sc.next();
		String[] carNames = splitCarName(cars);
		for (String carName : carNames) {
			checkLength(carName);
		}
		List<Car> carList = initCarList(carNames);
		int moveCount = sc.nextInt();
		for (int i = 0; i < moveCount; i++) {
			carList.forEach(car -> moveForward(car, generateRandom()));
			System.out.println(executionResult(carList));
		}
		System.out.println("최종 우승자 : " + findWinner(carList));
	}

	public static String[] splitCarName(String cars) {
		return cars.split(",");
	}

	public static void checkLength(String carName) throws IllegalStateException {
		if (carName.length() > 5) {
			throw new IllegalStateException("자동차 이름 길이는 5이하여야 합니다.");
		}
	}

	public static List<Car> initCarList(String[] carNames) {
		ArrayList<Car> carList = new ArrayList<>();
		for (String carName : carNames) {
			carList.add(new Car(carName));
		}
		return carList;
	}

	public static int generateRandom() {
		Random random = new Random();
		return random.nextInt(9);
	}

	public static void moveForward(Car car, int number) {
		if (number >= 4) {
			car.updatePosition();
		}
	}

	public static String executionResult(List<Car> cars) {
		StringBuilder sb = new StringBuilder();
		for (Car car : cars) {
			int position = car.getPosition();
			String temp = "-".repeat(Math.max(0, position));
			sb.append(car.getName()).append(" : ").append(temp).append("\n");
		}
		return sb.deleteCharAt(sb.length() - 1).toString();
	}

	public static String findWinner(List<Car> cars) {
		ArrayList<String> temp = new ArrayList<>();
		cars.sort((o1, o2) -> o2.getPosition() - o1.getPosition());
		temp.add(cars.get(0).getName());
		for (int i = 1; i < cars.size(); i++) {
			if (cars.get(0).getPosition() == cars.get(i).getPosition()) {
				temp.add(cars.get(i).getName());
			}
		}
		String[] temp2 = new String[temp.size()];
		for (int i = 0; i < temp.size(); i++) {
			temp2[i] = temp.get(i);
		}
		return String.join(",", temp2);
	}
}
