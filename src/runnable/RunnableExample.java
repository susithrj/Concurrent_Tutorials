package runnable;

public class RunnableExample implements Runnable {
private String name;
    public RunnableExample(String name) {
    this.name = name;
    }


    @Override
    public void run() {
        System.out.println(name+" thread is running");
    }
}
