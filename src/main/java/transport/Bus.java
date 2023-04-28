package transport;

import javax.annotation.PostConstruct;

public class Bus extends Transport {

    private int seats;

    public Bus(String brand, String model, int seats) {
        super(brand, model);
        this.seats = seats;
    }

    @PostConstruct
    private void startCar() {
        System.out.println(getBrand() + " готов к работе.");
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public String toString() {
        return super.toString() + "Количество посадочных мест = " + seats + ".";
    }
}
