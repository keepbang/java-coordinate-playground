package coordinate.model;

import java.util.List;

public abstract class Figure implements FigureHandler {

    List<Point> pointList;

    public Figure(List<Point> pointList){
        this.pointList = pointList;
    }

    public double lineLength(Point firstPoint, Point secondPoint){
        return Math.sqrt(
                Math.pow(firstPoint.getX() - secondPoint.getX(),2)
                        + Math.pow(firstPoint.getY() - secondPoint.getY(),2)
        );
    }
}
