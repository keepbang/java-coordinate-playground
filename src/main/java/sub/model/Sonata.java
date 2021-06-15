package sub.model;

public class Sonata extends Car{
    public Sonata(double distance) {
        super(distance);
    }

    @Override
    public double getDistancePerLiter() {
        return 10;
    }

    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }
}
