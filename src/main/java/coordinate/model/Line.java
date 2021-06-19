package coordinate.model;

import java.util.List;

public class Line extends Figure {

    public Line(List<Point> pointList) {
        super(pointList);
    }


    @Override
    public double area() {
        return super.lineLength(pointList.get(0), pointList.get(1));
    }

    @Override
    public FigureType type() {
        return FigureType.LINE;
    }
}
