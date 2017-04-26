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
                    while(!Thread.currentThread().isInterrupted()){
//                        Do something
                        try{
                            try {

                            }catch (InterruptedException ie){
//                                break; this is not a good habit
                            }
                        }catch (Exception e){
                            LOG.error(e.getMessage(),e);
                            continue;
                        }
//                        I'm doing something wrong here
                    }
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