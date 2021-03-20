package threads;

public class ThreadInc implements Runnable {

    Storage res;

    public ThreadInc (Storage res)
    {
        this.res = res;
    }

    @Override
    public void run() {
        for (;;){
            if(res.getResUnits() < res.maxRes()) {
                res.inc();
            } else {
                sleep(1000);
            }
            System.out.println(res.getDescription());
        }
    }

}
