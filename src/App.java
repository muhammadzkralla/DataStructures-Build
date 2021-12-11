public class App {
    public static void main(String[] args) {
        // declare a new Array Object and pass an initial index of 3 items
        Array numbers = new Array(3);

        // insert some integers 
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);

        // here we add a number out of the index of the array but it's ok, it's handeld
        numbers.insert(40);

        // here we delete an item from the array and get rid of holes
        numbers.reomveAt(1);

        // here we search the index of a number 
        System.out.println(numbers.indexOf(30));
        numbers.print();
    }
}
