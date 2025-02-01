public class SingletonTest {
    public static void main(String[] args) {
        SingletonTask task = new SingletonTask();

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.setName("t1-Thread");
        t2.setName("t2-Thread");

        t1.start();
        t2.start();
    }
}

class Singleton {
    private static Singleton instance;
    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

class SingletonTask implements Runnable {
    @Override
    public void run() {
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName() + Singleton.getInstance());
    }
}