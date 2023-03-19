package DSA.StackAndQueues;

public class CustumeStack {

    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    private int ptr = -1;

    public CustumeStack(){
        this(DEFAULT_SIZE);
    }
    public CustumeStack(int size){
        this.data = new int[size];
    }

    public boolean push(int val) throws Exception{
        if(isFull()){
            throw new Exception("Stack id Full.");
        }
        ptr++;
        data[ptr] = val;

        return true;
    }

    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is Empty.");
        }

        return data[ptr--];
    }

    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is Empty.");
        }

        return data[ptr];
    }

    public boolean isFull(){
        return ptr == data.length-1;
    }

    public boolean isEmpty(){
        return ptr == -1;
    }
}
