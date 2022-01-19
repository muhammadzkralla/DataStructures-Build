public class Stack {
    private int maxSize, top;
    private char[] StackArray;

    public Stack(int max){
        maxSize = max;
        StackArray = new char[max];
        top = -1;
    }

    // increment top first before assigning its value
    public void push(char j){
        StackArray[++top] = j;
    }

    // return the value first then decrement top
    public char pop(){
        return StackArray[top--];
    }

    // get the value at the top without decrementing the stack
    public char peek(){
        return StackArray[top];
    }

    // check the stack if it was empty
    public boolean isEmpty(){
        return (top == -1);
    }

    // check if it was full
    public boolean isFull(){
        return (top == maxSize-1);
    }
}