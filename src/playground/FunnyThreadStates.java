package playground;

public class FunnyThreadStates {

    static {
        System.out.println("Defining Thread");
        Thread t = new Thread(()->{
            System.out.println("Greet");
        });
        System.out.println("Strating Thread");
        t.start();
        System.out.println("Waiting on Thread");
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args) {
        System.out.println("Inside main");
    }
}
