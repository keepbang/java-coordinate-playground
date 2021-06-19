package coordinate.model;

import coordinate.exception.CoordinateNumberException;
import coordinate.model.Point;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

class PointTest {

    @ParameterizedTest
    @CsvSource({
        "0,0"
        ,"24,24"
        ,"0,24"
        ,"24,0"
    })
    void validPointSuccess(int x, int y){
        Point point = new Point(Arrays.asList(x,y));

        assertThat(point.getX()).isEqualTo(x);
        assertThat(point.getY()).isEqualTo(y);
    }

    @ParameterizedTest
    @CsvSource({
        "-1,0"
        ,"0,-1"
        ,"25,24"
        ,"24,25"
    })
    void validPointFailure(int x, int y){
        assertThatThrownBy(() -> new Point(Arrays.asList(x,y))).isInstanceOf(CoordinateNumberException.class)
                .hasMessageContaining("point좌표의 숫자가 너무 크거나 작습니다.");
    }

}