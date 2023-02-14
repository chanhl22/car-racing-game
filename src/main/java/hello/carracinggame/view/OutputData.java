package hello.carracinggame.view;

import hello.carracinggame.domain.Car;

import java.util.List;
import java.util.stream.Collectors;

public class OutputData {

    private static final String INPUT_CAR_NAME_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private static final String INPUT_TRY_COUNT_MESSAGE = "시도할 회수는 몇회인가요?";
    private static final String EXECUTION_RESULT_MESSAGE = "실행 결과";
    private static final String WINNER_MESSAGE = "최종 우승자 : ";
    private static final String HYPHEN = "-";
    private static final String COLON  = " : ";
    private static final String NEW_LINE  = "\n";

    public OutputData() {
    }

    public void printNameOfCarsInputMessage() {
        print(INPUT_CAR_NAME_MESSAGE);
    }

    public void printTryCountInputMessage() {
        print(INPUT_TRY_COUNT_MESSAGE);
    }

    public static void printNewLine() {
        System.out.println();
    }

    public static void print(String result) {
        System.out.println(result);
    }

    public void printExecutionMessage() {
        printNewLine();
        print(EXECUTION_RESULT_MESSAGE);
    }

    public void printExecutionResult(List<Car> cars) {
        print(makeExecutionResult(cars));
        printNewLine();
    }

    private String makeExecutionResult(List<Car> cars) {
        List<String> results = cars.stream()
                .map(this::makeEachCarExecutionResult)
                .collect(Collectors.toList());

        StringBuilder listString = new StringBuilder();
        results.forEach(listString::append);
        listString.deleteCharAt(listString.length() - 1);
        return listString.toString();
    }

    private String makeEachCarExecutionResult(Car car) {
        int position = car.getPosition();
        String countString = HYPHEN.repeat(Math.max(0, position));
        return car.getName() + COLON + countString + NEW_LINE;
    }

    public void printWinner(List<String> winners) {
        print(WINNER_MESSAGE + makeWinnerResult(winners));
    }

    private String makeWinnerResult(List<String> winners) {
        return String.join(", ", winners);
    }
}
