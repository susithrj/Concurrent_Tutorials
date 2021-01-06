package runnable;

public class MainClass {
private  RunnableExample runnableExample;


    public static void main(String[] args) {
RunnableExample runnableExample = new RunnableExample("runnableA");
    Thread runnablethread = new Thread(runnableExample);
    runnablethread.start();
    }
}
