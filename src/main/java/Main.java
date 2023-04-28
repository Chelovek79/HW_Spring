import config.AppConfig;
import driver.Driver;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Driver driver1 = context.getBean("DriverPassengerCar", Driver.class);
        Driver driver2 = context.getBean("DriverBus", Driver.class);
        Driver driver3 = context.getBean("DriverTruck", Driver.class);

        context.close();

        System.out.println(driver1 + "\n" + driver2 + '\n' + driver3 + '\n');
    }
}
