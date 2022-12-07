import classes.Car;
import classes.Person;
import enums.Colour;
import enums.Country;
import enums.Gender;
import exception.PhoneNumberEzsaption;
import services.impl.CarServiceImpl;
import services.impl.PersonServiceImpl;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Year;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        try {


            Scanner scanner = new Scanner(System.in);
            Car car1 = new Car("e34", "BMW", new BigDecimal(3000), Year.of(1996), Colour.BLUE, Country.GERMANY);
            Car car2 = new Car("e46", "BMW", new BigDecimal(6000), Year.of(2005), Colour.RED, Country.GERMANY);
            Car car3 = new Car("e30", "BMW", new BigDecimal(3000), Year.of(1990), Colour.RED, Country.GERMANY);
            Car car4 = new Car("mark 2", "TOYOTA", new BigDecimal(2000), Year.of(1993), Colour.WHITE, Country.JAPAN);
            Car car5 = new Car("focus", "BMW", new BigDecimal(3000), Year.of(2000), Colour.BLUE, Country.USA);
            Car car6 = new Car("veiron", "BUGATI", new BigDecimal(3000000), Year.of(1996), Colour.BLUE, Country.GERMANY);
            Car car7 = new Car("a6", "AUDI", new BigDecimal(50000), Year.of(2017), Colour.PINK, Country.GERMANY);
            Car car8 = new Car("mazda 3", "MAZDA", new BigDecimal(3000), Year.of(2021), Colour.BLUE, Country.CHINA);
            Car car9 = new Car("matiz", "DEWO", new BigDecimal(3000), Year.of(1996), Colour.BLUE, Country.KYRGYZSTAN);
            Car car10 = new Car("labo", "DEWO", new BigDecimal(300), Year.of(1996), Colour.BLUE, Country.KYRGYZSTAN);
            Car car11 = new Car("m5", "BMW", new BigDecimal(70000), Year.of(2022), Colour.BLUE, Country.GERMANY);
            List<Car> cars = new ArrayList<>(List.of(car3, car5, car6, car7, car8, car9, car10));
            List<Car> carsKutman = new ArrayList<>(List.of(car1, car11));
            List<Car> carsBakas = new ArrayList<>(List.of(car2));
            List<Car> carsAiperi = new ArrayList<>(List.of(car4));
            List<Car> carsAigul = new ArrayList<>();
            carsAigul.add(car8);

            Person person1 = new Person("kutman", LocalDate.of(2004, 6, 11), Gender.MALE, new BigDecimal(300000)
                    , "+996704830408", carsKutman);
            Person person2 = new Person("bakas", LocalDate.of(1996, 3, 23), Gender.MALE, new BigDecimal(9000),
                    "+996777777777", carsBakas);
            Person person3 = new Person("aiperi", LocalDate.of(1995, 3, 24), Gender.FEMALE, new BigDecimal(12000),
                    "+996777777777", carsAiperi);

            List<Person> people = new ArrayList<>(List.of(person1, person2, person3));
            PersonServiceImpl personService = new PersonServiceImpl();
            personService.createPerson(people); //1great person
            CarServiceImpl carService = new CarServiceImpl();
            carService.createCar(cars); //1 great car
            while (true) {
                System.out.println("""
                        PRESS 1 GET PERSSON!
                        PRESS 2 REMOVE PERSON!
                        PRESS 3 FIND BY NAME!
                        PRESS 4 FIND BY CARE NAME!
                        PRESS 5 PAY CARS!
                        PRESS 6 SORT PERSON DATE OF BORDS
                        PRESS 7 SORT PERSON NAME!
                        PRESS 8 SORT GENDER!
                        PRESS 9 GET AGE!
                        PRESS 10 REMOVE CAR!
                        PRESS 11 GET ALL CAR!
                        PRESS 12 FIND BY  NAME!
                        PRESS 13 FIND BY  COUNTRY!
                        """);
                System.out.print("PRESS : ");
                int swith = scanner.nextInt();
                switch (swith) {
                    case 1:
                        System.out.println(personService.getAll());
                        break;
                    case 2:
                        String n2 = scanner.nextLine();
                        System.out.print("REMOVE PERSON : ");
                        System.out.println(personService.removePerson(scanner.nextLine(), people));
                        System.out.println(personService.getAll());
                        break;
                    case 3:
                        String n1 = scanner.nextLine();
                        System.out.print("FIND BY NAME : ");
                        String name = scanner.nextLine();
                        System.out.println(personService.findByName(name, people));
                        break;
                    case 4:
                        String n4 = scanner.nextLine();
                        System.out.print("FIND BY CAR NAME : ");
                        System.out.println(personService.findByCarName(scanner.nextLine(), people));
                        break;
                    case 5:
                        String n5 = scanner.nextLine();
                        System.out.print("PERSON NAME : ");
                        String name1 = scanner.nextLine();
                        while (true) {

                            System.out.print("CAR NAME : ");
                            String carName1 = scanner.nextLine();
                            System.out.println(personService.payCars(name1, people, carName1, cars));
                            if ((personService.payCars(name1, people, carName1, cars)==("У ВАС НЕ ДОСТАТОЧНО ДЕНЕГ!"))){
                                break;
                            }
                        }
                        break;


                    case 6:
                        System.out.println("PRESS 1 = 1-2");
                        System.out.println("PRESS 2 = 2-1");
                        System.out.print("PRESS : ");
                        System.out.println(personService.sortPersonDateOfBirth(scanner.nextInt(), people));
                        break;
                    case 7:
                        System.out.println("PRESS 1 = A-Я");
                        System.out.println("PRESS 2 = Я-А");
                        System.out.print("PRESS : ");
                        System.out.println(personService.sortPersonName(scanner.nextInt(), people));
                        break;
                    case 8:
                        System.out.println("PRESS 1 = M-F");
                        System.out.println("PRESS 2 = F-M");
                        System.out.print("PRESS : ");
                        System.out.println(personService.sortGender(scanner.nextInt(), people));
                        break;
                    case 9:
                        String name4 = scanner.nextLine();
                        System.out.print("PRESS PERSON NAME : ");
                        System.out.println(personService.getAge(scanner.nextLine(), people));
                        break;
                    case 10:
                        String m = scanner.nextLine();
                        System.out.print("REMOVE CAR : ");
                        carService.removeCar(scanner.nextLine(), cars);
                        System.out.println(carService.getAll());
                        break;
                    case 11:
                        System.out.println(carService.getAll());
                        break;
                    case 12:
                        String name31 = scanner.nextLine();
                        System.out.print("FIND BY  NAME : ");
                        System.out.println(carService.findByName(scanner.nextLine(), people));
                        break;
                    case 13:
                        String na = scanner.nextLine();
                        System.out.print("FIND BY  COUNTRY : ");
                        System.out.println(carService.findByCountry(scanner.nextLine(), cars));
                        break;
                    default:
                        System.out.println("ВЫ ВВЕЛИ НЕ ПРАВИЛНУЮ КОМБИНАЦИЯ!!!");
                        break;
                }
            }
        }catch (PhoneNumberEzsaption e){
            System.out.println(e.getMessage());
        }catch (InputMismatchException e){
            System.err.println("ВЫ ВВЕЛИ ЦЫФРУ МЕСТО БУКВ!!");
        }

    }
}