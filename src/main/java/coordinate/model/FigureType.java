package coordinate.model;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public enum FigureType {
    LINE(2,Line::new){
        @Override
        public String result(double area) {
            return "두 점 사이 거리는 " + area;
        }
    },
    SQUARE(4,Square::new){
        @Override
        public String result(double area) {
            return "사각형 넓이는 " + area ;
        }
    },
    TRIANGLE(3,Triangle::new){
        @Override
        public String result(double area) {
            return "삼각형 넓이는 " + area;
        }
    };

    public abstract String result(double area);

    private Integer figurePointCount;
    private Function<List<Point>, Figure> function;

    FigureType(Integer figurePointCount, Function<List<Point>, Figure> function) {
        this.figurePointCount = figurePointCount;
        this.function = function;
    }

    public static Figure createFigure(List<Point> pointList){
        return Arrays.stream(values())
                .filter(f -> f.figurePointCount.equals(pointList.size()))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("좌표의 개수가 잘못되었습니다."))
                .function.apply(pointList);
    }
}
