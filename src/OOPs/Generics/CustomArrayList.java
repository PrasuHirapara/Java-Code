package OOPs.Generics;

import java.util.Arrays;

public class CustomArrayList<T> {
    private Object[] data;
    private static final int DEFAULT_SIZE = 10;
    private int size = 0; // Working as index also.

    public CustomArrayList(){
        this.data = new Object[DEFAULT_SIZE];
    }
    public void add(T num){
        if(this.isFull()){
            resize();
        }
        data[size++] = num;
    }
    public T remove(){
        T removed = (T)data[--size];

        return removed;
    }
    public T get(int index){
        return (T)data[index];
    }
    public int size(){
        return size;
    }
    public void set(int index,T value){
        data[index] = value;
    }

    private boolean isFull() {
        return DEFAULT_SIZE == size;
    }
    private void resize() {
        Object[] temp = new Object[DEFAULT_SIZE*2];

        // Copy hte items in new array.
        for(int i=0; i<data.length; i++){
            temp[i] = data[i];
        }
        data = temp;
    }
    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }
}
