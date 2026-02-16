public class TestClass {
    public static void main(String[] args){
        //Number Stack
        System.out.println("--- Testing Number Stack ---");
        GenericStack<Integer> numberStack = new GenericStack<>();

        numberStack.push(10);
        numberStack.push(20);
        numberStack.push(30);

        System.out.println("Stack content: " + numberStack.list());
        System.out.println("Peek top: " + numberStack.peek());
        System.out.println("Popped: " + numberStack.pop());
        System.out.println("After pop: " + numberStack.list());



        System.out.println("\n--- Testing Text Stack ---");
        String[] smallArray = new String[2];
        GenericStack<String> textStack = new GenericStack<>(smallArray);

        try {
            textStack.push("Hello");
            textStack.push("World");
            System.out.println("Full stack: " + textStack.list());
            textStack.push("Over Limit");

        }
        catch (StackFullException e) {
            System.out.println("Caught expected error: " + e.getMessage());
        }

        System.out.println("\n--- Testing Empty Stack ---");
        GenericStack<Double> emptyStack = new GenericStack<>();
        try {
            emptyStack.pop();
        }
        catch (StackEmptyException e) {
            System.out.println("Caught expected error: " + e.getMessage());
        }
    }
}
