package web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImp implements CarService {
        private List<Car> cars;

        {
            cars = new ArrayList<>();
            cars.add(new Car("Mazda", "M3", "Hath-Back"));
            cars.add(new Car("Mitsubisi", "Lancer", "10"));
            cars.add(new Car("Honda", "Civic", "Sport"));
            cars.add(new Car("Ford", "Mondeo", "Sport"));
            cars.add(new Car("Audi", "Q5", "Sport-Back"));
        }

        public List<Car> printCars (Integer count) {
            if (count == null) {
                return cars;
            }
            List<Car> cars1 = cars.stream().limit(count).collect(Collectors.toList());
            return cars1;
        }

}
