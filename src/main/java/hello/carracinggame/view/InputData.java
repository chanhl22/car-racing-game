package hello.carracinggame.view;

import hello.carracinggame.view.utils.InputDataUtils;

import java.util.List;
import java.util.Scanner;

public class InputData {

    private static final Scanner sc = new Scanner(System.in);

    public static List<String> getNameOfCars() {
        return InputDataUtils.splitWithComma(sc.next());
    }

    public static int getTryCount() {
        return sc.nextInt();
    }
}
