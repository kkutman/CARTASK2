package services;

import classes.Car;
import classes.Person;

import java.util.List;

public interface СarService {

    String createCar(List<Car>cars);

    String removeCar(String name,List<Car>cars);

    List<Car>getAll();

    List<Person>findByName(String name,List<Person>people);

    List<Car>findByCountry(String name, List<Car> persons);
}
