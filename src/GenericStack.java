public class GenericStack<T> {
    private T[] array;
    private int top = -1;

    public GenericStack() {
        array = (T[]) new Object[10];

    }
    public GenericStack(T[] array) {
        this.array = array;

    }

    public void push(T element){
        if(top >= array.length-1){
            throw new StackFullException();
        }

        array[++top] = element;
    }

    public T peek(){
        if(top < 0) {
            throw new StackEmptyException();
        }
        else if(top >= array.length-1) throw new StackFullException();

        return array[top];
    }

    public T pop(){
        if(top < 0){
            throw new StackEmptyException();
        }
        T element = array[top];
        array[top] = null;
        return element;

    }
    public String list(){
        String list="";

        for(int i=0; i< array.length; i++){
            if(array[i] !=null) list += array[i];
            if(i < top){
                list += ";";
            }
        }
        return list;
    }


}