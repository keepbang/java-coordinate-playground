package sub.model;

public class K5 implements Car {
    public double rentDistance;

    public K5(double distance){
        this.rentDistance = distance;
    }

    @Override
    public double getDistancePerLiter() {
        return 13;
    }

    @Override
    public double getTripDistance() {
        return this.rentDistance;
    }

    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }
}
