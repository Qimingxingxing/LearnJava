package MultiThread;

/**
 * Created by qimingzhang on 2017/4/26.
 */
public class HowToHandleInterruptedException {
    public static void main(String[] args) {
        try {
//            throw new InterruptedException();
            Thread myThread = new Thread(new Runnable() {
                @Override
                public void run() {
//                    should always ensure that thread exists

                }
            });
        }
        catch (InterruptedException ie){
            Thread.currentThread().interrupt();
            throw new  RuntimeException(ie);
        }
    }
}
=