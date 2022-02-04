import java.util.NoSuchElementException;

public class LinkedList {

    public class Node {

    private int value;
    private Node next;

    public Node(int i){
        value = i;
    }

    }   

    private Node first;
    private Node last;
    private int size;

    //addFirst
    public void addFirst(int item){
        var node = new Node(item);
        node.value = item;

        if (isEmpty()){
            first = last = node;
        } else {
            node.next = first;
            first = node;
        }

        size++;
    }
    //addLast
    public void addLast(int item){
        Node node = new Node(item);
        node.value = item;

        if(isEmpty()){
            first = last = node;
        }else{
            last.next = node;
            last = node;
        }

        size++;
    }
    //deleteFirst
    public void removeFirst(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }

        if(first == last){
            first = last = null;
        } else {
            var tmp = first.next;
            first.next = null;
            first = tmp;
        }
        
        size--;
    }
    //deleteLast
    public void removeLast(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }

        if(first == last){
            first = last = null;
        } else {
            var previous = getPrevious(last);
            last = previous;
            last.next = null;
        }
        
        size--;
    }
    //indexOf
    public int indexOf(int item){
        int index = 0;
        Node current = first;
        while(current != null){
            if(current.value == item){ 
                return index; 
            }else{
            current = current.next;
            index++;
            }
        }

        return -1;
    }
    //contains
    public boolean contains(int item){
        Node current = first;
        while(current != null){
            if(current.value == item){
                return true;
            } else {
                current = current.next;
            }
        }
        return false;
    }

    //size 
    public int size(){
        return size;
    }

    public int getLast(){
        return last.value;
    }

    public int getFirst(){
        return first.value;
    }

    private boolean isEmpty(){
        return first == null;
    }

    private Node getPrevious(Node node){
        var current = first;
        while(current != null){
            if(current.next == last){
                return current;
            } else {
                current = current.next;
            }
        }
        return null;
    }

}
