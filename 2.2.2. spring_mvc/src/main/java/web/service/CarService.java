package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarService {

    public static List<Car> getCarsList(Integer count) {
        List<Car> carsList = new ArrayList<>();
        carsList.add(new Car("Honda", 1, "Black"));
        carsList.add(new Car("Volvo", 2, "Red"));
        carsList.add(new Car("Ford", 3, "Green"));
        carsList.add(new Car("Alfa Romeo", 4, "Magenta"));
        carsList.add(new Car("BMW", 5, "White"));

        return count == null ? carsList.stream().limit(carsList.size()).collect(Collectors.toList())
                             : carsList.stream().limit(count).collect(Collectors.toList());
    }
}
