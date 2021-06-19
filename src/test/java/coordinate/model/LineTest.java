package coordinate.model;

import coordinate.utils.FigureSeparator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class LineTest {

    @ParameterizedTest
    @CsvSource({
        "'(10,10)-(14,15)',6.403124",
        "'(0,0)-(0,24)',24",
        "'(0,24)-(24,0)',33.9411"
    })
    void calculateSquareArea(String inputString, double resultArea){

        Line line = new Line(FigureSeparator.createPointList(inputString));

        assertEquals(line.area(),resultArea,0.001);
    }

}