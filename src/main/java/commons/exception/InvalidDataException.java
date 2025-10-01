package commons.exception;

public class InvalidDataException extends BaseLogicException {
    public InvalidDataException(String message) {
        super(message);
        this.code = 400;
    }
}
