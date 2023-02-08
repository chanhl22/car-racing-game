package hello.carracinggame;

import java.util.Scanner;

public class InputData {

    private final Scanner sc = new Scanner(System.in);

    public InputData() {
    }

    public String inputCarNames() {
        return sc.next();
    }

    public int inputTryCount() {
        return sc.nextInt();
    }
}
