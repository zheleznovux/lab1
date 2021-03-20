import threads.*;

public class Lab2 {

    public static void main(String args[]) {

        Storage res = new Storage();
        System.out.println(res.getDescription());

        Thread threadInc = new Thread(new ThreadInc(res));
        threadInc.setName("Thread incrementor");
        threadInc.start();

        Thread threadDec = new Thread(new ThreadDec(res));
        threadDec.setName("Thread decrementor");
        threadDec.start();
    }

}