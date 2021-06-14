package sub;

import sub.model.Car;

public class RentCompany{
    private static RentCarList rentCarList;

    private RentCompany() {};

    public static RentCompany create() {
        rentCarList = new RentCarList();
        return new RentCompany();
    }

    public void addCar(Car car){
        rentCarList.add(car);
    }

    public String generateReport() {
        StringBuilder sb = new StringBuilder();
        for (Car car : rentCarList.getCarList()) {
            sb.append(car.getName() + " : " + Math.round(car.getChargeQuantity()) + "리터" + System.lineSeparator());
        }

        return sb.toString();
    }
}
