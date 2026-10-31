public class Main {

    public static void main(String[] args) {

        Vehicle[] vehicles = {
            new Car(),
            new Motorcycle()
        };

        for (Vehicle vehicle : vehicles) {
            vehicle.moveForward();
            vehicle.moveBackward();
            vehicle.moveLeft();
            vehicle.moveRight();

            System.out.println();
        }
    }
}