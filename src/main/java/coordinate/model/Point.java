package coordinate.model;

import coordinate.exception.CoordinateNumberException;

import java.util.List;

public class Point {
    public static final int MIN_NUMBER = 0;
    public static final int MAX_NUMBER = 24;

    private int x;
    private int y;

    public Point(List<Integer> pointList){
        this(pointList.get(0), pointList.get(1));
    }

    public Point(int x, int y){
        if(!validNumberCheck(x,y)){
            throw new CoordinateNumberException();
        }

        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public boolean validNumberCheck(int x, int y){
        return (x >= MIN_NUMBER && x <= MAX_NUMBER)
                && (y >= MIN_NUMBER && y <= MAX_NUMBER);
    }
}
