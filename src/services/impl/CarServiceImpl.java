package services.impl;

import classes.Car;
import classes.Person;
import enums.Country;
import services.СarService;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements СarService {
    List<Car>cars = new ArrayList<>();
    @Override
    public String createCar(List<Car> cars) {
        this.cars.addAll(cars);
        return "ВАША ОПЕРАЦИЯ ПРОШЛА УСПЕШНО!";
    }

    @Override
    public String removeCar(String name, List<Car> cars) {
        for (Car car : cars) {
            if(car.getName().equals(name)){
                this.cars.remove(car);
            }
        }
        return "ВАША ОПЕРАЦИЯ ПРОШЛА УСПЕШНО!";
    }

    @Override
    public List<Car> getAll() {
        return cars;
    }

    @Override
    public List<Person> findByName(String name, List<Person> people) {
        List<Person> people1 = new ArrayList<>();
        for (Person person : people) {
            if(person.getName().equals(name)){
                people1.add(person);
                return people1;
            }
        }
        return null;
    }

    @Override
    public List<Car> findByCountry(String name, List<Car> cars) {
        List<Car> carList = new ArrayList<>();
        for (Car car : cars) {
            if (car.getCountryOfOrigin().name().equals(name.toUpperCase())){
                carList.add(car);

            }
        }
        return carList;


    }
}
