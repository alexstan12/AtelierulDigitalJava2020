package lab6.comparable;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<Car>();
        cars.add(new Car(1990,2000,"Car1"));
        cars.add(new Car(2019,2000,"Car2"));
        cars.add(new Car(2016,2000,"Car3"));
        cars.add(new Car(2016,2003,"Car4"));

        Collections.sort(cars, new Comparator<Car>() { //sorting using Comparator based on year
            @Override
            public int compare(Car car1, Car car2) {
                return Integer.compare(car1.getYear(), car2.getYear());
            }
        });
        System.out.println(cars);
    }
}
