package pl.bykowski.springbootapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CarApi {

    private List<Car> carList;

    public CarApi() {
        carList = new ArrayList<>();
        carList.add(new Car(1L, "BMW"));
        carList.add(new Car(2L, "VW"));
    }

    @GetMapping("/car")
    public List<Car> getCars() {
        return carList;
    }
}
