public class Reverser {
    private String input;
    private String output = " ";

    public Reverser(String in){
        input = in;
    }

    public String reverse(){
        // get the size of the word and pass it to the stack
        int stackSize = input.length();
        Stack stack = new Stack(stackSize);

        // iterate over each character and push it to the stack
        for(int i = 0; i < stackSize; i++){
            char ch = input.charAt(i);
            stack.push(ch);
        }
        // as the stack is not empty pop the top value
        while(!stack.isEmpty()){
            char ch = stack.pop();
            output = output + ch;
        }

        // return the reversed string to the user
        return output;
    }
    
}
