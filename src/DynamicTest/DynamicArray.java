package DynamicTest;

public class DynamicArray {
    int size; // size not size=0
    int capacity=10;
    Object[] array;

    //Overloaded Constructor
    public DynamicArray() {
        this.array = new Object[capacity]; // array[0]..array[9]
    }
    public DynamicArray(int capacity){
        this.capacity=capacity;
        this.array=new Object[capacity];

    }

    public void add(Object data){
        if(size >=capacity){
            grow(); // to expand the size of our array
        }
        array[size] =data;
        size++; // increase size by 1

    }

    public void insert(int index, Object data)
    {
        if(size >=capacity){
            grow(); // to expand the size of our array
        }
        else{
        // Shift element that are filled in to the right to make room for the insertion
       for(int i = size; i > index; i--) {
           array[i]  = array[i - 1];
       }
       array[index] = data; // array[-1] =
       size++;
        }
    }

    public void delete(Object data)
    {
        for(int i = 0; i < size; i++) { // 0,1,2,3
            if(array[i] == data) {
                for(int j = 0; j < (size - i - 1); j++){ // 0,1,2
                    array[i + j] = array[i + j + 1];
                }

                array[size - 1] = null;
                size--;
                if(size <=(int) (capacity/3)) {
                    shrink();
                }
                break;
            }
        }

    }

    public int search(Object data)
    {
        for(int i=0; i< size; i++) {
            if(array[i] == data) {
                return i;
            }
        }

        return -1; // we do not find the value
    }

    //Expand the size of our Array
    private void grow(){
        int newCapacity = (int)(capacity*2);
        Object[] newArray = new Object[newCapacity];

        for(int i=0; i < size; i++) {
            newArray[i] = array[i];
        }
        capacity = newCapacity; // 10 = 20
        array = newArray;     //
    }


    private void shrink()
    {
        int newCapacity = (int)(capacity/2);
        Object[] newArray = new Object[newCapacity];

        for(int i=0; i < size; i++) {
            newArray[i] = array[i];
        }
        capacity = newCapacity; // 10 = 20
        array = newArray;
    }

    public boolean isEmpty() {
        return size ==0; //
    }

 // toString() = special method that all objects inherit;
//              that returns a string that "textually represents" an object.
//                can be used both implicitly and explicitly.

    public String toString(){

        String string = "";
        for(int i =0; i < capacity; i++) {
            string +=array[i] + ", ";
        }
        if(string != "") {
            string = "[" + string.substring(0, string.length()-2) + "]";

        }
        else {
            string = "[]";
        }
        return string;
    }
}

