package sub;

import sub.model.Car;

import java.util.ArrayList;
import java.util.List;

public class RentCarList {
    private List<Car> carList;

    public RentCarList(){
        this.carList = new ArrayList<>();
    }

    public void add(Car car) {
        carList.add(car);
    }

    public List<Car> getCarList(){
        return this.carList;
    }
}
