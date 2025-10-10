package ch.ofte.commons.exception;

public class InvalidServiceException extends BaseLogicException {
    public InvalidServiceException(String serviceName) {
        super("The service \"" +  serviceName + "\" cannot be called");
    }

    public InvalidServiceException(String serviceName, String message) {
        super("The service \"" +  serviceName + "\" cannot be called, reason: " + message);
    }
}
