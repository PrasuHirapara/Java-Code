package OOPs.Interfaces;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        car.acceleration();
        car.brake();
        car.start();
        car.stop();

        MediaPlayer carMedia = new Car();// Engine will run as it is overridden.
        carMedia.start();// To solve this use another class and override methos there.
        carMedia.stop();
    }
}
