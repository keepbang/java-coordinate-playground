package sub.model;

public class Avante extends Car {
    public Avante(double distance) {
        super(distance);
    }

    @Override
    public double getDistancePerLiter() {
        return 15;
    }

    @Override
    public String getName() {
        return "Avante";
    }
}
