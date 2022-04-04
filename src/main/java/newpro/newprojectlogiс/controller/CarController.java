package newpro.newprojectlogiс.controller;

import newpro.newprojectlogiс.domain.Car;
import newpro.newprojectlogiс.repository.CarRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/car")
public class CarController extends RestAbstractController<Car, CarRepository> {
    public CarController(CarRepository repository) {
        super(repository);
    }
}
