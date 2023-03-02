package hello.carracinggame.domain;

public class Car {

    private final static int MINIMUM = 4;
    private final String name;
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

    public Car moveForward(int randomNumber) {
        if (randomNumber >= MINIMUM) {
            this.position++;
        }
        return new Car(this.name, this.position);
    }

    public boolean isMaximumPosition(int maxPosition) {
        return this.position == maxPosition;
    }
}
