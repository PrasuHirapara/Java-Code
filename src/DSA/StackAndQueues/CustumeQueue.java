package DSA.StackAndQueues;

public class CustumeQueue {

    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    private int end = -1;

    public boolean insert(int val){
        if(isFull()){
            return false;
        }
        data[end++] = val;

        return true;
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty.");
        }
        int removed = data[0];

        for(int i=1; i<end; i++){
            data[i-1] = data[i];
        }
        end--;

        return removed;
    }

    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty.");
        }

        return data[0];
    }

    public void display(){
        for(int i=0; i<end; i++){
            System.out.print(data[i]+"->");
        }
        System.out.println("End");
    }
    public boolean isFull(){
        return end == data.length-1;
    }

    public boolean isEmpty(){
        return end == -1;
    }
}
