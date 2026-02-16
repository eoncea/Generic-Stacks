/**
 * A generic Stack implementation using an array.
 * This class follows the Last-In-First-Out (LIFO) principle.
 *
 * @param <T> The type of elements held in this stack.
 */
public class GenericStack<T> {
    /** The array used to store the stack elements. */
    private T[] array;
    /** The index of the current topmost element. Starts at -1 when empty. */
    private int top = -1;

    /**
     * Default constructor creating a stack with a capacity of 10.
     */
    @SuppressWarnings("unchecked")
    public GenericStack() {
        array = (T[]) new Object[10];
    }

    /**
     * Constructor using a pre-defined array as the storage attribute.
     * @param array The array to be used for storage.
     */
    public GenericStack(T[] array) {
        this.array = array;
    }

    /**
     * Adds an element to the top of the stack.
     * @param element The item to be added.
     * @throws StackFullException if the internal array is full.
     */
    public void push(T element){
        if(top >= array.length - 1){
            throw new StackFullException();
        }
        array[++top] = element;
    }

    /**
     * Returns the top element without removing it.
     * @return The topmost element in the stack.
     * @throws StackEmptyException if the stack contains no elements.
     */
    public T peek(){
        if(top < 0) {
            throw new StackEmptyException();
        }
        return array[top];
    }

    /**
     * Removes and returns the top element of the stack.
     * @return The element that was removed.
     * @throws StackEmptyException if the stack contains no elements.
     */
    public T pop(){
        if(top < 0){
            throw new StackEmptyException();
        }
        T element = array[top];
        array[top] = null; // Clean reference for garbage collection
        top--; // Corrected: Must decrement top pointer
        return element;
    }

    /**
     * Concatenates all current elements into a string separated by semicolons.
     * @return A semicolon-separated string of all elements.
     */
    public String list(){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i <= top; i++){
            sb.append(array[i]);
            if(i < top){
                sb.append(";");
            }
        }
        return sb.toString();
    }
}