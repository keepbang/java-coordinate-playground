package coordinate.model;

import java.util.List;

public class Triangle extends Figure {
    public Triangle(List<Point> pointList) {
        super(pointList);
    }

    @Override
    public double area() {
        double lineA = lineLength(pointList.get(0),pointList.get(1));
        double lineB = lineLength(pointList.get(1),pointList.get(2));
        double lineC = lineLength(pointList.get(2),pointList.get(0));

        double s = (lineA + lineB + lineC) / 2;

        return Math.sqrt(s * (s - lineA) * (s - lineB) * (s - lineC));
    }

    @Override
    public FigureType type() {
        return FigureType.TRIANGLE;
    }

}
