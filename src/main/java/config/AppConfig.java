package config;

import driver.Driver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import transport.Bus;
import transport.PassengerCar;
import transport.Trucks;

@Configuration
public class AppConfig {

    @Bean
    public PassengerCar getPassengerCarBeen() {
        return new PassengerCar("TOYOTA", "Chaser", 180);
    }

    @Bean
    public Bus getBusBeen() {
        return new Bus("VolgaBus", "Серпантин-10", 44);
    }

    @Bean
    public Trucks getTruckBeen() {
        return new Trucks("КамАЗ", "43118", 12f);
    }

    @Bean("DriverPassengerCar")
    public Driver getDriverPassengerCar() {
        return new Driver("Сокол А.Ф.", getPassengerCarBeen());
    }

    @Bean("DriverBus")
    public Driver getDriverBus() {
        return new Driver("Бирюков А.К.", getBusBeen());
    }

    @Bean("DriverTruck")
    public Driver getDriverTruck() {
        return new Driver("Фёдоров И.С.", getTruckBeen());
    }
}
