package OOPs.AbstractClass;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(21);

        son.carrer("Doctor");
        son.partner("Radha",20);

        Parent p = new Parent(23) {
            @Override
            public void carrer(String name) {
                System.out.println(name);
            }

            @Override
            public void partner(String name, int age) {
                System.out.println(name+" "+ age);
            }
        };
    }
}
