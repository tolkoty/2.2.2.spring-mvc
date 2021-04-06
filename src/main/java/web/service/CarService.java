package web.service;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarService {

    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("Audi", "A4",2));
        cars.add(new Car("Ford", "Focus", 3));
        cars.add(new Car("Tesla", "S", 1));
        cars.add(new Car("Chevrolet", "Camaro", 4));
        cars.add(new Car("Toyota", "Chaser", 2));

    }

    public List<Car> show(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }

    public List<Car> showAll() {
        return cars;
    }
}
