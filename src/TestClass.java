/**
 * Test class to demonstrate the functionality of the GenericStack.
 */
public class TestClass {
    public static void main(String[] args){
        // --- Scenario 1: Number Stack (Integer) ---
        System.out.println("--- Testing Number Stack ---");
        GenericStack<Integer> numberStack = new GenericStack<>();

        // Adding elements to the stack
        numberStack.push(10);
        numberStack.push(20);
        numberStack.push(30);

        System.out.println("Stack content: " + numberStack.list());
        System.out.println("Peek top: " + numberStack.peek());
        System.out.println("Popped: " + numberStack.pop());
        System.out.println("After pop: " + numberStack.list());

        // --- Scenario 2: Text Stack (String) with Capacity Limit ---
        System.out.println("\n--- Testing Text Stack ---");
        String[] smallArray = new String[2];
        GenericStack<String> textStack = new GenericStack<>(smallArray);

        try {
            textStack.push("Hello");
            textStack.push("World");
            System.out.println("Full stack: " + textStack.list());
            // Attempting to push to a full stack to trigger exception
            textStack.push("Over Limit");
        }
        catch (StackFullException e) {
            System.out.println("Caught expected error: " + e.getMessage());
        }

        // --- Scenario 3: Testing Empty Stack Access ---
        System.out.println("\n--- Testing Empty Stack ---");
        GenericStack<Double> emptyStack = new GenericStack<>();
        try {
            // Attempting to pop from an empty stack to trigger exception
            emptyStack.pop();
        }
        catch (StackEmptyException e) {
            System.out.println("Caught expected error: " + e.getMessage());
        }
    }
}