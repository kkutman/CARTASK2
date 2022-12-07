package classes;

import enums.Gender;
import exception.PhoneNumberEzsaption;

import java.awt.color.ICC_ColorSpace;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Person {
    private String name;
    private LocalDate dateOfBirth;
    private Gender gender;
    private BigDecimal money;
    private String phoneNumber;
    private List<Car> cars;

    public Person(String name, LocalDate dateOfBirth, Gender gender, BigDecimal money, String phoneNumber, List<Car> cars) throws PhoneNumberEzsaption {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.money = money;
        if(phoneNumber.length()<=13) {
            if(phoneNumber.contains("+996")){
                this.phoneNumber = phoneNumber;
            }else {
                throw new PhoneNumberEzsaption("ОШИБКА В НОМЕРЕ ОБОНЕНТА" );
            }
        }

        this.cars = cars;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public Gender getGender() {
        return gender;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", gender=" + gender +
                ", money=" + money +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", cars=" + cars +"\n";
    }
}
