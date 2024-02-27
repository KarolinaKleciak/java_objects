package LAB5_P;

import static LAB5_P.Car.*;
import static LAB5_P.CommissionCar.*;

public class Main {
    public static void main(String[] args) {
        Car car1= new Car("Audi", "a5", 3000, "Benzynowy", "SUV", 2018, 190000, "2021" );

        car1.setBrand("Audi a5");
        System.out.println(car1.getBrand());

        car1.setDate("2018-01-01");
        System.out.println(car1.getDate_of_first_registration());

        WhetherGuarantee(car1.getDate_of_first_registration());
        CommissionCar store = new CommissionCar();

        System.out.println();
        store.addCar("Audi", "A3", 2000, "Diesel", "Sedan", 2019, 50000, "2022-05-15");
        store.addCar("BMW", "X5", 3000, "Petrol", "SUV", 2020, 80000, "2020-02-20");
        store.addCar("Mercedes", "C-Class", 1600, "Petrol", "Coupe", 2018, 60000, "2018-10-10");
        store.addCar("Ford", "Focus", 1500, "Diesel", "Hatchback", 2021, 30000, "2021-01-01");
        store.addCar("Toyota", "Camry", 2500, "Hybrid", "Sedan", 2020, 70000, "2023-06-30");
        store.addCar("Volkswagen", "Golf", 1400, "Petrol", "Hatchback", 2017, 40000, "2017-08-22");
        store.addCar("Honda", "CR-V", 2000, "Petrol", "SUV", 2019, 55000, "2019-04-12");
        store.addCar("Hyundai", "Kona", 1000, "Electric", "SUV", 2022, 90000, "2022-03-05");
        store.addCar("Kia", "Sportage", 1600, "Diesel", "SUV", 2018, 48000, "2018-12-18");
        store.addCar("Nissan", "Qashqai", 1300, "Petrol", "SUV", 2021, 65000, "2021-11-10");
        store.printCars();
    }
}