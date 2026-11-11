
public class Main {

    public static void performService(Serviceable item) {
        item.service();
    }

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

        System.out.println("=== Interface Implementation ===");

        Serviceable[] items = {
            new Car(),
            new Motorcycle(),
            new Printer()
        };

        for (Serviceable item : items) {
            performService(item);
        }
    }
}
