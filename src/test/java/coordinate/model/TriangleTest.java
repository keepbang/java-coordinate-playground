package coordinate.model;

import coordinate.utils.FigureSeparator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @ParameterizedTest
    @CsvSource({
            "'(10,10)-(14,15)-(20,8)',29",
            "'(3,22)-(17,15)-(1,1)',154",
            "'(0,24)-(24,24)-(0,0)',288"
    })
    void calculateSquareArea(String inputString, double resultArea){
        Triangle triangle = new Triangle(FigureSeparator.createPointList(inputString));

        assertEquals(triangle.area(),resultArea,0.1);
    }
}