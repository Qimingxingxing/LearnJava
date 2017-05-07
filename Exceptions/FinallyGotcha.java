package LearnJava.Exceptions;

/**
 * Created by qimingzhang on 2017/5/7.
 */
public class FinallyGotcha {
    public static void main(String[] args) {
        FinallyGotcha gotcha = new FinallyGotcha();
        int result = gotcha.finallyGotcha();
        System.out.println(result);
    }

    private int finallyGotcha() {
        try {
            if(true){
                throw new RuntimeException();
            }
            return 1;
        }catch (RuntimeException e){
            return 2;
        }
        finally {
            return 3;
        }
    }
}
