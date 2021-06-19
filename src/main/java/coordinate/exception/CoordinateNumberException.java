package coordinate.exception;

public class CoordinateNumberException extends NumberFormatException {
    public CoordinateNumberException() {
        super("point좌표의 숫자가 너무 크거나 작습니다.");
   }
}
