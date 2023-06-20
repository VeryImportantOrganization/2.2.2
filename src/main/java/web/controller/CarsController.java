package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    @GetMapping("/cars")
    public String getNumOfCars(@RequestParam(value = "num", defaultValue = "6") int num, Model model) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("car1", 123, 2010));
        carList.add(new Car("car2", 234, 2015));
        carList.add(new Car("car3", 345, 2017));
        carList.add(new Car("car4", 456, 2020));
        carList.add(new Car("car5", 567, 2022));
        carList = CarService.getNumOfCars(carList, num);
        model.addAttribute("num", carList);
        return "cars";
    }
}
