package web.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("Red","BMW","V8"));
        cars.add(new Car("Blue","Buick","W12"));
        cars.add(new Car("White","Mazda","V4"));
        cars.add(new Car("Pink","Daewoo","V4"));
        cars.add(new Car("Yellow","Mercedes-Benz","V6"));
    }
    @Override
    public List<Car> getCars(int count) {
        return ((count > 0 && count < 5) ? cars.stream().limit(count).toList() : cars);
    }
}
