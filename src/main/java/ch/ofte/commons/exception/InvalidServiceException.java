package ch.ofte.commons.exception;

public class InvalidServiceException extends BaseLogicException {
    public InvalidServiceException(String serviceName) {
        super("The service \"" +  serviceName + "\" cannot be called");
    }
}
