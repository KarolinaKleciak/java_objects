package LAB5_P;

import java.time.LocalDate;
import java.time.Period;
public class Car {
   public String brand;
   public String model;
   public int engine;

   public String engine_type;
   public String body_type;

   public int year;

   public double price;
    String date_of_first_registration;

    public Car(String br, String mo, int eng, String eng_type, String bo_type, int ye, double pr, String date) {

        this.brand = br;
        this.model = mo;
        this.engine = eng;
        this.engine_type = eng_type;
        this.body_type = bo_type;
        this.year = ye;
        this.price = pr;
        this.date_of_first_registration = date;
    }

    public void setBrand(String _brand) {

        this.brand = _brand;
    }

    public void setModel(String _model) {

        this.model = _model;
    }

    public void setEngine(int _engine) {

        this.engine = _engine;
    }

    public void setEngineType(String _engine_type) {

        this.engine_type = _engine_type;
    }

    public void setBodyType(String _body_type) {

        this.body_type = _body_type;
    }

    public void setYear(int _year) {

        this.year = _year;
    }

    public void setPrise(double _price) {

        this.price = _price;
    }

    public void setDate(String _date) {

        this.date_of_first_registration = _date;
    }

    String getBrand() {
        return this.brand;
    }

    String getModel() {
        return this.model;
    }

    int getEngine() {
        return this.engine;
    }

    String getEngineType() {
        return this.engine_type;
    }

    String getBodyType() {
        return this.body_type;
    }

    int getYear() {
        return this.year;
    }

    double getPrice() {
        return this.price;
    }

    String getDate_of_first_registration() {
        return this.date_of_first_registration;
    }

    public static boolean WhetherGuarantee(String date_registration) {

        LocalDate date = LocalDate.parse(date_registration);
        LocalDate currentData = LocalDate.now();

        int car_year = Period.between(date, currentData).getYears();

        return car_year < 2;
    }

    @Override
    public String toString() {

        boolean whether_guarantee = this.WhetherGuarantee(this.date_of_first_registration);

        //zrobic zeby pierwsza litera ciagu znaku byla duza a reszta mala dla kazdej cehcy w klasie
        //przenieść do metody addcar
        String print_string = this.brand + ", " + this.model + ", " + this.engine + "cm^3, " + this.engine_type + ", " + this.body_type + ", " + this.year + ", " + this.price + ", " + this.date_of_first_registration + "\nHas guarantee: " + whether_guarantee;

        return print_string;
    }
}

