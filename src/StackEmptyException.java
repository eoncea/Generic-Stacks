/**
 * Exception thrown when an access operation (pop/peek) is attempted on an empty stack.
 */
public class StackEmptyException extends RuntimeException {
    public StackEmptyException() {
        // Corrected message: was "full", changed to "empty"
        super("Stack is empty!");
    }
}