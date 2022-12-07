package classes;

import enums.Colour;
import enums.Country;

import java.math.BigDecimal;
import java.time.Year;

public class Car {
    private String name;
    private String mark;
    private BigDecimal price;
    private Year releaseYear;
    private Colour color;
    private Country countryOfOrigin;

    public Car(String name, String mark, BigDecimal price, Year releaseYear, Colour color, Country countryOfOrigin) {
        this.name = name;
        this.mark = mark;
        this.price = price;
        this.releaseYear = releaseYear;
        this.color = color;
        this.countryOfOrigin = countryOfOrigin;
    }

    public String getName() {
        return name;
    }

    public String getMark() {
        return mark;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Year getReleaseYear() {
        return releaseYear;
    }

    public Colour getColor() {
        return color;
    }

    public Country getCountryOfOrigin() {
        return countryOfOrigin;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", mark='" + mark + '\'' +
                ", price=" + price +
                ", releaseYear=" + releaseYear +
                ", color=" + color +
                ", countryOfOrigin=" + countryOfOrigin +
                '}';
    }
}
