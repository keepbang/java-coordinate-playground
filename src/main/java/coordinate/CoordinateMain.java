package coordinate;

import coordinate.model.Figure;
import coordinate.model.FigureType;
import coordinate.model.Point;
import coordinate.utils.FigureSeparator;

import java.util.List;

import static coordinate.model.FigureType.createFigure;
import static coordinate.view.InputView.inputString;
import static coordinate.view.OutputView.inputText;
import static coordinate.view.OutputView.result;

public class CoordinateMain {

    public static void main(String[] args) {

        inputText();
        String inputString = inputString();

        List<Point> pointList = FigureSeparator.createPointList(inputString);

        Figure figure = createFigure(pointList);

        FigureType type = figure.type();

        result(type.result(figure.area()));

    }
}
