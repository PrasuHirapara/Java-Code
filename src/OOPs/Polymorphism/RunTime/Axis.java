package OOPs.Polymorphism.RunTime;

public class Axis extends Bank {
    @Override
    public void interstRate(){
        System.out.println("Interest Rate of Axis = 7.5%");
    }
    public void deposite(int money){
        System.out.println(money+" has been Deposited");
    }
}
