package OOPs.Polymorphism.RunTime;

public class IDFC extends Bank {
    @Override
    public void interstRate(){
        System.out.println("Interest Rate of IDFC = 10.0%");
    }
    public void deposite(int money){
        System.out.println(money+" has been Deposited");
    }
}
