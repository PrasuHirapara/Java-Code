package OOPs.Abstraction;
/*
    Hiding implementation details from hte user.Only the highlighted services will be provided.
    Achieved by Abstract classes and Interfaces.
    Showing only useful service not the details of it.
*/
public abstract class Vehicle {
    protected String make;
    protected String model;
    protected int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public abstract void start();

    public abstract void stop();
}