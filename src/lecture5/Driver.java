package lecture5;

public class Driver {

    public static void main(String[] args) {
        SimpleThread simpleThread = new SimpleThread("child");
        simpleThread.start();

    }
}
