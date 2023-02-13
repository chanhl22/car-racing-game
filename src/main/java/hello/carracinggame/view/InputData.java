package hello.carracinggame.view;

import hello.carracinggame.view.utils.InputDataUtils;

import java.util.List;
import java.util.Scanner;

public class InputData {

    private final Scanner sc = new Scanner(System.in);
    private final InputDataUtils inputDataUtils;

    public InputData() {
        inputDataUtils = new InputDataUtils();
    }

    public List<String> getNameOfCars() {
        return inputDataUtils.splitWithComma(sc.next());
    }

    public int getTryCount() {
        return sc.nextInt();
    }
}
