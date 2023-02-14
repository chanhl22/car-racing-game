package hello.carracinggame;

import hello.carracinggame.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class Winner {

    public Winner() {
    }

    public String findWinnerResult(List<Car> cars) {
        cars.sort((o1, o2) -> o2.getPosition() - o1.getPosition());

        ArrayList<String> winners = new ArrayList<>();
        winners.add(cars.get(0).getName());
        for (int i = 1; i < cars.size(); i++) {
            if (cars.get(0).getPosition() == cars.get(i).getPosition()) {
                winners.add(cars.get(i).getName());
            }
        }
        return String.join(", ", winners);
    }
}
