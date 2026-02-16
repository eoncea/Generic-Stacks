/**
 * Exception thrown when a push operation is attempted on a full stack.
 */
public class StackFullException extends RuntimeException {
    public StackFullException() {
        super("Stack is full!");
    }
}