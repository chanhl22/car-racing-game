package hello.carracinggame;

import java.util.ArrayList;
import java.util.List;

public class Winner {

    public static void findWinner(List<Car> cars) {
        OutPutData.print("최종 우승자 : " + findWinnerResult(cars));
    }

    public static String findWinnerResult(List<Car> cars) {
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
