package coordinate.model;

import coordinate.utils.FigureSeparator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static coordinate.model.FigureType.createFigure;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FigureTypeTest {

    @ParameterizedTest
    @CsvSource({
            "'(10,10)-(22,10)-(22,18)-(10,18)',SQUARE",
            "'(0,0)-(12,0)-(12,10)-(0,10)',SQUARE",
            "'(0,12)-(12,12)-(0,8)',TRIANGLE",
            "'(0,0)-(24,13)',LINE",
    })
    void figureApplyTest(String inputString, String type){
        Figure figure = createFigure(FigureSeparator.createPointList(inputString));

        assertThat(figure.type().name()).isEqualTo(type);

    }

}