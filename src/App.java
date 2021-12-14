public class App {
    public static void main(String[] args) {
        // declare a new Array Object and pass an initial index of 3 items
        Array numbers = new Array(3);

        // insert some integers 
        numbers.insert(6);
        numbers.insert(5);
        numbers.insert(3);

        // here we add numbers out of the index of the array but it's ok, it's handeld
        numbers.insert(2);
        numbers.insert(11);

        //choose the methods you want to test here :
    }
}
