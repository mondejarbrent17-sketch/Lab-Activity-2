public class Main {

    public static void main(String[] args) {

        Vehicle v1 = new Vehicle("Toyota", "Vios", 2015);
        Vehicle v2 = new Vehicle("Honda", "Civic", 1995);
        Vehicle v3 = new Vehicle("Ford", "Ranger", 2020);

        System.out.println("=== Vehicle 1 ===");
        v1.displayInfo();
        System.out.println("Age: " + v1.calculateAge());
        System.out.println("Vintage: " + v1.isVintage());
        System.out.println("Brand: " + v1.getBrand());
        System.out.println("Model: " + v1.getModel());
        System.out.println("Year: " + v1.getYear());

        System.out.println("\n=== Vehicle 2 ===");
        v2.displayInfo();
        System.out.println("Age: " + v2.calculateAge());
        System.out.println("Vintage: " + v2.isVintage());
        System.out.println("Brand: " + v2.getBrand());
        System.out.println("Model: " + v2.getModel());
        System.out.println("Year: " + v2.getYear());

        System.out.println("\n=== Vehicle 3 ===");
        v3.displayInfo();
        System.out.println("Age: " + v3.calculateAge());
        System.out.println("Vintage: " + v3.isVintage());
        System.out.println("Brand: " + v3.getBrand());
        System.out.println("Model: " + v3.getModel());
        System.out.println("Year: " + v3.getYear());

        System.out.println("\n=== setYear Tests ===");

        System.out.println("setYear(2000): " + v1.setYear(2000));
        System.out.println("Year: " + v1.getYear());
        System.out.println("Age: " + v1.calculateAge());
        System.out.println("Vintage: " + v1.isVintage());

        System.out.println("\nsetYear(1885): " + v1.setYear(1885));
        System.out.println("Year: " + v1.getYear());

        System.out.println("\nsetYear(2027): " + v1.setYear(2027));
        System.out.println("Year: " + v1.getYear());

        System.out.println("\n=== Constructor Tests ===");

        Vehicle invalid1 = new Vehicle("Test", "Car", 1885);
        System.out.println("Year with 1885: " + invalid1.getYear());

        Vehicle invalid2 = new Vehicle("Test", "Car", 2027);
        System.out.println("Year with 2027: " + invalid2.getYear());
    }
}