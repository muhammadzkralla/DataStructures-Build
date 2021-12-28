public class Array {
    private int count;
    private int[] items;

    public Array(int length){
        items = new int[length];
    }

    public void insert(int number){
        // this code handels the length of the array and extend it
        if(items.length == count){
            int[] newItems = new int[count * 2];
            
            // copying all the items in the old array to the new bigger one
            for(int i = 0; i < count; i++){
                newItems[i] = items[i];
            }
            items = newItems;
        }

        items[count] = number;
        count ++;
    }

    public void reomveAt(int index){
        // handels items if out of range
        if(index < 0 || index >= count){
            throw new IllegalArgumentException();
        }

        // shifting all the items after deletion
        for(int i = index ;i < count ; i++){
        items[i] = items[i+1];
        
        }
        count--;
    }

    public int indexOf(int number){
        for(int i = 0; i < count; i++){
            if(items[i] == number){
                return i;
            }
        }
        return -1;
    }

    public void print(){
        for(int i = 0; i < count; i++){
            System.out.println(items[i]);
        }
    }
    // selection sort
    public void sort(){
        int out, in, min;
        for(out = 0; out<count; out++){
            min = out;
            for(in  = out + 1; in <count;in++ ){
                if(items[in] < items[out]){
                    min = in;
                    swap(out,min);
                }
            }
        }

    }


    private void swap(int one,int two){
        int temp = items[one];
        items[one] = items[two];
        items[two] = temp;
    }
}
