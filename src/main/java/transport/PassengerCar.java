package transport;

import javax.annotation.PostConstruct;

public class PassengerCar extends Transport {

    private int maxSpeed;

    public PassengerCar(String brand, String model, int maxSpeed) {
        super(brand, model);
        this.maxSpeed = maxSpeed;
    }

    @PostConstruct
    private void startCar() {
        System.out.println(getModel() + " готов к работе.");
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return super.toString() + "Макс. скорость - " + maxSpeed + "км/ч.";
    }
}
