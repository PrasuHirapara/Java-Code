package OOPs.ExceptionHandling;
/*
    Error : Lack / missing of resources.
            Non-recoverable.
    Exception :  Stops the flow of programme.
                 If at compile time : Checked Exception.ex. File not found
                 If at run time : Unchecked Exception.ex. Divide by zero.
    Throwable Class : Handles the exception.
    Try - catch block catches exception  and helps in continuing program.
*/
public class Main {
    public static void main(String[] args) {
        int a = 2, b = 0;

        try{
          //  int c = a/b; // Try to find Exception.
            divide(a,b);
        }catch(Exception e){
            System.out.println(e.getMessage()); // If exception found throw Exception.
        }finally {
            System.out.println("This always execute"); // This always execute
        }
    }
    private static int divide(int a ,int b) throws ArithmeticException{
        if(b == 0){
            throw new ArithmeticException("Do not divide by zero.");
        }

        return a/b;
    }
}
