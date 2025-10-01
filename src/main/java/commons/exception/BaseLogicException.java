package commons.exception;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;

@Getter
@JsonIgnoreProperties({"stackTrace", "suppressed", "localizedMessage", "cause"})
public class BaseLogicException extends RuntimeException {
    protected int code = 500;
    public BaseLogicException(String message) {
        super(message);
    }
}
