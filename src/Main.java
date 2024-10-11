public class Main {
    public static void main(String[] args) {
        Car land_rover = new Car();
        Car toyota = new Car("Toyota", 150, true, 20);

        System.out.println(land_rover.countSpeed(10));
        System.out.println(toyota.countSpeed(10));

    }
}