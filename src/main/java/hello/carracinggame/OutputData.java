package hello.carracinggame;

public class OutputData {

    private static final String INPUT_CAR_NAME_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private static final String INPUT_TRY_COUNT_MESSAGE = "시도할 회수는 몇회인가요?";
    private static final String EXECUTION_RESULT_MESSAGE = "실행 결과";
    private static final String WINNER_MESSAGE = "최종 우승자 : ";

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

    public void printWinner(String winner) {
        print(WINNER_MESSAGE + winner);
    }
}
