package lab8.increment;

public class Interference {
    public static int v = 0;
    public static void main(String[] args) throws Exception{
        System.out.println("before:" + v);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                v++;
            }
        };
        for(int i=0;i<50000;i++){
            (new Thread(runnable)).start();
        }

        Thread.sleep(1000);
        System.out.println("after:"+v);
    }
}
