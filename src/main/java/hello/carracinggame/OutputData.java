package hello.carracinggame;

public class OutputData {

    private static final String INPUT_CAR_NAME_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private static final String INPUT_TRY_COUNT_MESSAGE = "시도할 회수는 몇회인가요?";
    private static final String EXECUTION_RESULT_MESSAGE = "실행 결과";

    public static void printInputData(String carNameString, int tryCount) {
        print(makeInputCarNameMessage(carNameString));
        print(makeInputTryCountMessage(tryCount));
        printNewLine();
    }

    public static void printNewLine() {
        System.out.println();
    }

    public static void print(String result) {
        System.out.println(result);
    }

    public static String makeInputCarNameMessage(String carNameString) {
        return INPUT_CAR_NAME_MESSAGE + "\n" + carNameString;
    }

    public static String makeInputTryCountMessage(int tryCount) {
        return INPUT_TRY_COUNT_MESSAGE + "\n" + tryCount;
    }

    public static void printExecutionMessage() {
        print(makeExecutionMessage());
    }

    public static String makeExecutionMessage() {
        return EXECUTION_RESULT_MESSAGE;
    }
}
