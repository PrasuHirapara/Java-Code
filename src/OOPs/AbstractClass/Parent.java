package OOPs.AbstractClass;
/*
    Abstract method tells what to do not how to do.
    Child classes provides body.
    Methods must be overwritten in child class.
    If a single method is declared as abstract class must contain " abstract " keyword.
    You can not directly make object of Abstract class, you have to Override methods first.
    You can not directly make constructor of Abstract class
*/
public abstract class Parent {
    int age;

    public Parent(int age){
        this.age = age;
    }
    abstract public void carrier(String name);
    abstract public void partner(String name,int age);
}
