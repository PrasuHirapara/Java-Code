package OOPs.AnnonymousInnerClass;

public class Main{
    public static void main(String[] args) {
//        Show demo = new Demo();
//        demo.show();

        // Class in another class.
        Show obj = () -> System.out.println("Anonymous inner class.");

        obj.show();

    }
}
