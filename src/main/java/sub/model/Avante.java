package sub.model;

public class Avante implements Car {

    public double rentDistance;

    public Avante(double distance){
        this.rentDistance = distance;
    }

    @Override
    public double getDistancePerLiter() {
        return 15;
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
