package OOPs.MultiTasking;
/*
        When two or more parts of same programme runs concurrently.
        Each part of such programme is called Thread.
        Types :
            A) Process based : When two or more programmes run concurrently.
                               Ex. Running Web and VS Code.
            B) Thread based : When two or more threads run concurrently.
        Thread Priorities : It is an integer which determines how that thread should be treated with respect other.
                            Higher priority thread doesn't run faster.Instead, it is used to decide when to switch from one thread to another and this is also known as context switch.

*/

public class Main {
    public static void main(String[] args){

        Example ex = new Example();
        Example2 ex2 = new Example2();

        ex.start();
       // ex2.run();
    }
}

class Example extends Thread{
    @Override
    public void run(){
        for(int i=1; i<10; i++){
            System.out.println(i);


        }
    }
}

class Example2 implements Runnable {

    @Override
    public void run(){
        for(int i=11; i<20; i++){
            System.out.println(i);

        }
    }

}
