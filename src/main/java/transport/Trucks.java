package transport;

import javax.annotation.PostConstruct;

public class Trucks extends Transport {

    private float capacity;

    public Trucks(String brand, String model, float capacity) {
        super(brand, model);
        this.capacity = capacity;
    }

    @PostConstruct
    private void startCar() {
        System.out.println(getBrand() + " готов к работе.");
    }

    public float getCapacity() {
        return capacity;
    }

    public void setCapacity(float capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return super.toString() + "Грузоподъёмность = " + capacity + "тонн.";
    }
}
