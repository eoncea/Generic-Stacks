public class StackFullException extends RuntimeException {
    public StackFullException(String message) {
        super("Stack is full!");
    }
}
