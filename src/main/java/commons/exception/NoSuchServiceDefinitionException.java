package commons.exception;

public class NoSuchServiceDefinitionException extends BaseLogicException {
    public NoSuchServiceDefinitionException(String serviceName) {
        super("Service \"" + serviceName + "\" not found!");
    }
}
