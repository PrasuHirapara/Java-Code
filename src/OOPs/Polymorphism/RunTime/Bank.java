package OOPs.Polymorphism.RunTime;
/*
    Also known as Dynamic Polymorphism.
    Happens at Inheritance.
    Achieved by Method Overriding : When both parent and child class has same name and all have same parameter, return type and access modifier.
             You can inherit but can't override static method.
    Which method to call is determined by Object at Run time.
*/
public class Bank {
    // We can use " final " keyword to stop Overriding.
    public void interstRate(){
        System.out.println("You are on Bank class");
    }
    public void deposite(int money){
        System.out.println("Which bank ?");
    }
}
