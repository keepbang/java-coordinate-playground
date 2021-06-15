package sub.model;

public class Sonata implements Car{
    public double rentDistance;

    public Sonata(double distance){
        this.rentDistance = distance;
    }

    @Override
    public double getDistancePerLiter() {
        return 10;
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
