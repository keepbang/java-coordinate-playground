package coordinate.model;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Square extends Figure {
    public Square(List<Point> pointList) {
        super(pointList);
    }

    @Override
    public double area() {
        return width() * height();
    }

    @Override
    public FigureType type() {
        return FigureType.SQUARE;
    }

    public int width(){
        List<Integer> xList = pointList.stream()
                .mapToInt(Point::getX)
                .sorted()
                .boxed()
                .collect(Collectors.toList());

        int maxX = xList.stream().mapToInt(x -> x).max().getAsInt();
        int minX = xList.stream().mapToInt(x -> x).min().getAsInt();

        return maxX - minX;

    }

    public int height(){
        List<Integer> yList = pointList.stream()
                .mapToInt(Point::getY)
                .sorted()
                .boxed()
                .collect(Collectors.toList());

        int maxY = yList.stream().mapToInt(x -> x).max().getAsInt();
        int minY = yList.stream().mapToInt(x -> x).min().getAsInt();

        return maxY - minY;
    }

}
