package OOPs.AnnonymousInnerClass;

//class Demo implements Show{
//    @Override
//    public void show() {
//        System.out.println("Anonymous inner class.");
//    }
//}

public class Main{
    public static void main(String[] args) {
//        Show demo = new Demo();
//        demo.show();

        // Class in another class.
        Show obj = new Show(){
            public void show(){
                System.out.println("Anonymous inner class.");
            }
        };

    }
}
