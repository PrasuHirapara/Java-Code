package OOPs.AbstractClass;
public class Son extends Parent{
    public Son(int age) {
        super(age);
    }

    // In inheritance, you can make Shape class abstract.
    @Override
    public void carrer(String name) {
        System.out.println("I want to be "+name);
    }

    @Override
    public void partner(String name, int age) {
        System.out.println("I want to marry "+name+" and she is of age "+age);
    }
}
