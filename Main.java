public class Main {
    public static void printDetails(Vehicle vehicle) {
        vehicle.displayInfo();
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Car("Toyota", "Vios", 2026, 4);
        vehicle.displayInfo();
        System.out.println();

        vehicle = new Motorcycle("Honda", "XRM", 2015, "Manual");
        vehicle.displayInfo();
        System.out.println();

        vehicle = new Truck("Isuzu", "N-Series", 2026, 6.0);
        vehicle.displayInfo();
        System.out.println("\n--- Method Parameter ---");

        Car car = new Car("Tesla", "Roadster", 2026, 4);
        Motorcycle motor = new Motorcycle("Kawasaki", "Ninja", 2026, "Manual");
        Truck truck = new Truck("Isuzu", "F-Series", 2026, 10.0);

        printDetails(car);
        System.out.println();

        printDetails(motor);
        System.out.println();

        printDetails(truck);
    }
}