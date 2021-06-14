package sub.model;

public abstract class Car {
    public double rentDistance;

    public Car(double distance){
        this.rentDistance = distance;
    }

    /**
     * 리터당 이동 거리. 즉, 연비
     */
    abstract double getDistancePerLiter();

    /**
     * 여행하려는 거리
     */
    double getTripDistance(){
        return this.rentDistance;
    };

    /**
     * 차종의 이름
     */
    public abstract String getName();

    /**
     * 주입해야할 연료량을 구한다.
     */
    public double getChargeQuantity() {
        return getTripDistance() / getDistancePerLiter();
    }
}
