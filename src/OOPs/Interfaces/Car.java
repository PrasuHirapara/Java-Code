package OOPs.Interfaces;
/*
    Now I can use multiple class at same time due to interfaces.
    Interface is not class, it contains abstract methods and variables are static and final so that user can not modifie it directly.
    It is used to work as multiple inheritance.
    It does not matter that two class has same method because it is being Overridden.
    Run time Polymorphism.
    Use " default " keyword in interface body to not override ar every Point.
    Nested interface can have any access modifier but top one can only have public and default interface.
*/
public class Car implements Engine, Break, MediaPlayer{

    @Override
    public void brake() {
        System.out.println("I brake like normal car");
    }

    @Override
    public void start() {
        System.out.println("I start engine like normal car");
    }

    @Override
    public void stop() {
        System.out.println("I stop engine like normal car");
    }

    @Override
    public void acceleration() {
        System.out.println("I accelerate like normal car");
    }
}
