package OOPs.Inheritance;

public class FourAngle extends Shapes {
    // Child Class
    // Single level Inheritance
    public void area(int s){
        System.out.println("Area of Square is : "+ s*s);
    }
    public void area(int l, int b){
        System.out.println("Area of Rectangle is : "+ l*b);
    }
}
