package OOPs.LambdaFunction;

// Only works in Interface, and it should, must follow @FunctionalInterface
public class Main {
    public static void main(String[] args) {
//        Sum obj = new Sum() {
//            @Override
//            public int sum(int a, int b) {
//                return a+b;
//            }
//        };

        Sum sum = (i,j) -> i+j;
        System.out.println(sum.sum(45,45));
    }
}
