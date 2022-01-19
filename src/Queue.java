import java.util.Arrays;

public class Queue {
    private int[] items;
    private int rear;
    private int front;
    private int count;
    
    //assign the size of the queue
    public Queue(int capacity){
        items = new int[capacity];
    }

    //add an item to the queue
    public void enqueue(int item){

        //if the queue is full
        if(count == items.length){
        throw new IllegalStateException();
        }
        items[rear] = item;
        //make the array circular by shifting the indices
        rear = (rear + 1) % items.length;
        count++;
    }

    //remove an item from the queue
    public int dequeue(){
        int item = items[front];
        items[front] = 0;
        //make the queue circular by shifting the indices
        front = (front + 1) % items.length;
        count--;
        return item;
    } 

    @Override
    public String toString(){
        return Arrays.toString(items);
    }
    
}
