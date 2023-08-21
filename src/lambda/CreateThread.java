package lambda;

public class CreateThread {
    public static void main(String[] args) {
        Runnable runnable=()->{
            for (int i=0;i<20;i++) {
                System.out.println("thread of i is:"+i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                  e.printStackTrace();
                }
            }
        };
        Thread thread=new Thread(runnable);
        thread.setName("Hasan Thread");
        thread.start();

        Runnable runnable1=()->{
            for (int i=0;i<10;i++){
                System.out.println(i*3);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread thread1=new Thread(runnable1);
        thread1.setName("Raza");
        thread1.start();
    }
}
