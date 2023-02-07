package hello.carracinggame;

import java.util.Scanner;

public class InputData {

    private String carNameString;
    private int tryCount;

    public static InputData inputData() {
        Scanner sc = new Scanner(System.in);
        String carNameString = sc.next();
        int tryCount = sc.nextInt();

        return new InputData(carNameString, tryCount);
    }

    public InputData(String carNameString) {
        this.carNameString = carNameString;
    }

    public InputData(int tryCount) {
        this.tryCount = tryCount;
    }

    public InputData(String carNameString, int tryCount) {
        this.carNameString = carNameString;
        this.tryCount = tryCount;
    }

    public String getCarNameString() {
        return carNameString;
    }

    public int getTryCount() {
        return tryCount;
    }
}
