package darek9k;

public class NotCheckedException extends RuntimeException{
    public NotCheckedException() {
    }

    public NotCheckedException(String message) {
        super(message);
    }

    public NotCheckedException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotCheckedException(Throwable cause) {
        super(cause);
    }
}
