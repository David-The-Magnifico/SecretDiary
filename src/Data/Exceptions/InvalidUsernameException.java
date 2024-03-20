package Data.Exceptions;

public class InvalidUsernameException extends RuntimeException {
    private static final Object message = new Object();

    public InvalidUsernameException(String username) {
        String message = new String(username);
        super(message);
    }
}
