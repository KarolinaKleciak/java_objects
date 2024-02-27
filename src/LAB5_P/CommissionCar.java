package LAB5_P;
import java.util.ArrayList;

public class CommissionCar {

    public ArrayList<Car> cars;

    public CommissionCar(){
        cars = new ArrayList<Car>();
    }

    public void addCar(String brand, String model, int engine, String engine_type, String body_type, int year, double price, String date_of_registration) {

        this.cars.add(new Car(brand.toLowerCase(), model.toLowerCase(), engine , engine_type.toLowerCase(), body_type.toLowerCase(), year, price,date_of_registration.toLowerCase()));
    }

    public void printCars(){

        for (Car car: cars) {
            System.out.println(car.toString());
        }
    }
}