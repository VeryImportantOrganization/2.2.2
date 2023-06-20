package web.service;

import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

public class CarService {


    public static List<Car> getNumOfCars(List<Car> carList, int num) {
        if(num == 0 || num >5) {
            return carList;
        }
        return carList.stream().limit(num).collect(Collectors.toList());
    }
}
