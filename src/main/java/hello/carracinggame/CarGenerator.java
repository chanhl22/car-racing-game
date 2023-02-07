package hello.carracinggame;

import java.util.ArrayList;
import java.util.List;

public class CarGenerator {

    public static List<Car> checkCarName(String cars) {
        String[] carNames = splitCarName(cars);
        checkIsEmpty(carNames);
        checkCarLength(carNames);
        return initCar(carNames);
    }

    public static String[] splitCarName(String cars) {
        return cars.split(",");
    }

    public static void checkIsEmpty(String[] carNames) throws IllegalStateException {
        if (carNames.length == 0) {
            throw new IllegalStateException("[ERROR] 자동차 이름을 한개 이상 입력해주세요.");
        }
    }

    public static void checkCarLength(String[] carNames) throws IllegalStateException {
        for (String carName : carNames) {
            if (carName.length() > 5) {
                throw new IllegalStateException("[ERROR] 자동차 이름 길이는 5이하여야 합니다.");
            }
        }
    }

    public static List<Car> initCar(String[] carNames) {
        ArrayList<Car> carList = new ArrayList<>();
        for (String carName : carNames) {
            carList.add(new Car(carName));
        }
        return carList;
    }
}
