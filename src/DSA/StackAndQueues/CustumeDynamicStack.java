package DSA.StackAndQueues;

public class CustumeDynamicStack extends CustumeStack{

    public CustumeDynamicStack(){
        super();
    }

    public CustumeDynamicStack(int size){
        super();
    }

    @Override
    public boolean push(int val) throws Exception {
        if(this.isFull()){
            int[] temp = new int[data.length*2];

            for(int i=0; i<data.length; i++){
                temp[i] = data[i];
            }
            data = temp;
        }

        return super.push(val);
    }
}
