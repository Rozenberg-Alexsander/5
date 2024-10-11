package Trans;

public class Main {
    public static void main(String[] args) {
        Car sedan = new Sedan();
        sedan.start();
        sedan.toString();
        System.out.println(sedan);

        //rideRideable(new Car());
        //rideRideable(new Boat());

        Transport transport = new Transport();
    }

    public static void rideRideable(Rideable rideable) {
        rideable.ride();
    }
}