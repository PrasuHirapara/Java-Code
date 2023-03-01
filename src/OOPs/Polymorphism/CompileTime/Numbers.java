package OOPs.Polymorphism.CompileTime;
/*
    Also known as Static Polymorphism
    Achieved by Method Overloading : When class has multiple methods with same name but different parameter and return type.
             by Operator Overloading : Java doesn't support this.
    Which method to call is determined at compile time.
*/
public class Numbers {
    public void sum(int a, int b){
        System.out.println("sum = "+a+b);
    }
    public void sum(int a,int b,int c){
        System.out.println("sum = "+a+b+c);
    }
    public void mult(int a,int b){
        System.out.println("Product = "+a*b);
    }
    public void mult(int a,int b,int c){
        System.out.println("Product = "+a*b*c);
    }
}
