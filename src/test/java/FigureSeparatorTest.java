import coordinate.utils.FigureSeparator;
import coordinate.model.Point;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.catchThrowable;

public class FigureSeparatorTest {


    @ParameterizedTest
    @CsvSource({
        "'(0,0)-(24,24)',2",
        "'(2,2)-(4,2)-(4,4)',3",
        "'(2,2)-(4,2)-(2,4)-(4,4)',4"
    })
    @DisplayName("문자열 pointList로 나누기 성공 케이스")
    void splitInputStringFailure(String inputString, int size){

        List<Point> pointList = FigureSeparator.createPointList(inputString);



        assertThat(pointList.size()).isEqualTo(size);
    }

    @ParameterizedTest
    @CsvSource({
            "'(0,0)-'",
            "'(2,2)-(4O,2)'"
    })
    @DisplayName("문자열 pointList로 나누기 성공 케이스")
    void splitInputStringSuccess(String inputString){
        Throwable thrown = catchThrowable(() -> FigureSeparator.createPointList(inputString));

        assertThat(thrown).isInstanceOf(IllegalArgumentException.class);
    }
}
