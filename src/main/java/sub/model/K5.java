package sub.model;

public class K5 extends Car {
    public K5(double distance) {
        super(distance);
    }

    @Override
    public double getDistancePerLiter() {
        return 13;
    }

    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }
}
