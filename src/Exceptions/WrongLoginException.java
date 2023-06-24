package Exceptions;

public class WrongLoginException extends RuntimeException {

    private static final String DEFAULT_MESSAGE = "Login must be less then 20 symbols";

    public WrongLoginException() {
        this(DEFAULT_MESSAGE);
    }
    public WrongLoginException(String message) {
        super(message);
    }

}
