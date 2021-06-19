package coordinate.model;

import coordinate.utils.FigureSeparator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @ParameterizedTest
    @CsvSource({
        "'(10,10)-(22,10)-(22,18)-(10,18)',96",
        "'(0,0)-(12,0)-(12,10)-(0,10)',120",
        "'(0,10)-(24,10)-(24,24)-(0,24)',336",
        "'(3,7)-(10,7)-(10,18)-(3,18)',77"
    })
    void calculateSquareArea(String inputString, double resultArea){

        Square square = new Square(FigureSeparator.createPointList(inputString));

        assertEquals(square.area(),resultArea,0.001);
    }

}