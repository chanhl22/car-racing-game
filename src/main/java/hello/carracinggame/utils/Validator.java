package hello.carracinggame.utils;

import java.util.List;

public class Validator {

    public Validator() {
    }

    public void validateNameOfCars(List<String> nameOfCars) {
        checkIsEmpty(nameOfCars);
        checkLength(nameOfCars);
    }

    public void checkIsEmpty(List<String> nameOfCars) {
        if (nameOfCars.isEmpty()) {
            throw new IllegalStateException("[ERROR] 자동차 이름을 한개 이상 입력해주세요.");
        }
    }

    public void checkLength(List<String> nameOfCars) {
        if (nameOfCars.stream()
                .anyMatch(nameOfCar -> nameOfCar.length() > 5)) {
            throw new IllegalStateException("[ERROR] 자동차 이름 길이는 5이하여야 합니다.");
        }
    }
}
