package hello.carracinggame.domain;

public class Car {

    private final static int MINIMUM = 4;
    private String name;
    private int position;

    public Car(String name) {
        this.name = name;
    }

    public Car(String name, int position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public void moveForward(int randomNumber) {
        if (randomNumber >= MINIMUM) {
            this.position++;
        }
    }
}
