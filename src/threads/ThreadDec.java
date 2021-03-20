package threads;

public class ThreadDec implements Runnable{
    Storage res;

    public ThreadDec (Storage res)
    {
        this.res = res;
    }

    public void run() {
        for (;;){
            if(res.getResUnits() > res.minRes()) {
                res.dec();
            }
            System.out.println(res.getDescription());
        }
    }
}
