import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/**
 * The golden boy
 */
public class Vino implements Vinos{
    private  String name;
    private String brand;
    private String country;
    private LocalDate date;
    private  int years;

    public Vino(String name, String brand, String country, LocalDate date) {
        this.name = name;
        this.brand = brand;
        this.country = country;
        this.years = Period.between(date,LocalDate.now()).getYears();
    }

    public Vino() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    @Override
    public String toString() {
        return "Vino{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", country='" + country + '\'' +
                ", date=" + date +
                ", years=" + years +
                '}';
    }

    @Override
    public void vino(Vino vinos) {

        vinos.getName();
        vinos.getBrand();
        vinos.getDate();
        vinos.getCountry();
    }
}

