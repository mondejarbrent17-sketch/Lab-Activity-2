
public class Car extends Vehicle implements Serviceable {

    @Override
    public void moveForward() {
        System.out.println("A car moves forward");
    }

    @Override
    public void moveBackward() {
        System.out.println("A car moves backward");
    }

    @Override
    public void moveLeft() {
        System.out.println("A car moves left");
    }

    @Override
    public void moveRight() {
        System.out.println("A car moves right");
    }

    @Override
    public void service() {
        System.out.println("Car: check oil and brakes.");
    }
}
