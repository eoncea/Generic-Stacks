public class GenericStack<T> {
    private T[] array;
    private int top = -1;

    public GenericStack() {
        array = (T[]) new Object[10];

    }
    public GenericStack(T[] array) {
        this.array = array;

    }



}