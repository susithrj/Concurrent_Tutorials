package lecture5;

class SimpleThread extends Thread {

    public SimpleThread(String str) {
        super(str);             // ``Thread( String )''
    }                           // constructor


    public void run()          // ``body'' of the thread
    {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + ": " + i);

            try {
                sleep((int) (Math.random() * 1000));
            } catch (InterruptedException e) {
            }

        }

        System.out.println(getName() + ": TERMINATING");

    }
}
