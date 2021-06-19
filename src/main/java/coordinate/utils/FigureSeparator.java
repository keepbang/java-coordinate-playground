package coordinate.utils;

import coordinate.model.Point;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FigureSeparator {
    public static List<Point> createPointList(String inputString) {
        return Arrays.stream(splitHyphen(inputString))
                .map(FigureSeparator::replaceList)
                .map(Point::new)
                .collect(Collectors.toList());
    }

    private static String[] splitHyphen(String inputString) {

        String[] splitter = inputString.split("-");

        if(splitter.length == 1){
            throw new IllegalArgumentException("한개의 좌표만 존재합니다.");
        }

        return splitter;
    }

    private static List<Integer> replaceList(String input) {
        return Arrays.stream(input.replaceAll("[()]", "")
                .split(","))
                .mapToInt(Integer::valueOf)
                .boxed()
                .collect(Collectors.toList());
    }
}
