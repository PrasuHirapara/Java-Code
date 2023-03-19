package DSA.StackAndQueues;

public class CustumeDynamicQueue extends CustumeQueue{

    public CustumeDynamicQueue(){
        super();
    }

    public CustumeDynamicQueue(int size){
        super();
    }

    @Override
    public boolean insert(int val) {
        if(isFull()){
            int[] temp = new int[data.length*2];

            for(int i=0; i<data.length; i++){
                temp[i] = data[i];
            }
            data = temp;
        }

        return super.insert(val);
    }
}
