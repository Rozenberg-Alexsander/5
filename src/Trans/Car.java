package Trans;

import Trans.Rideable;
import Trans.Transport;

public abstract  class Car extends Transport implements Rideable {
    String brand;
    int horsePower;
    boolean isAwd;
    float acceleration;

    public Car() {
        this("Land rover", 150, true, 10);

    }

    Car(String brand, int horsePower, boolean isAwd, float acceleration) {
        this.brand = brand;
        this.horsePower = horsePower;
        this.isAwd = isAwd;
        this.acceleration = acceleration;
        type = "Car";

    }

    abstract void start();


    void setAcceleration(float acceleration) {
        this.acceleration = acceleration;
    }

    float countSpeed(float time) {
        return (100 / acceleration) * time;
    }

    @Override
    public void ride() {
        System.out.println("Riding car");
    }
}