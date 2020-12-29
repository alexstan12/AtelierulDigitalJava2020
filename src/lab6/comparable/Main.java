package lab6.comparable;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<Car>();
        cars.add(new Car(1990,2000,"Car1"));
        cars.add(new Car(2019,2000,"Car2"));
        cars.add(new Car(2016,2000,"Car3"));
        cars.add(new Car(2016,2003,"Car4"));

        Collections.sort(cars);
        System.out.println(cars);
    }
}
