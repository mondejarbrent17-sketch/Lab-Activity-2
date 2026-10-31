public class Car extends Vehicle {

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
}