package OOPs.AbstractClass;

public class Daughter extends Parent{
    public Daughter(int age) {
        super(age);
    }

    @Override
    public void carrer(String name) {
        System.out.println("I want to be "+name);
    }

    @Override
    public void partner(String name, int age) {
        System.out.println("I want to marry "+name+" and he is of age "+age);
    }
}
