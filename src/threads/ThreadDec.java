package threads;

public class ThreadDec implements Runnable{
    Storage res;

    public ThreadDec (Storage res)
    {
        this.res = res;
    }

    @Override
    public void run() {
        synchronized (res) {
            for (;;) {
                if (res.getResUnits() > res.minRes()) {
                    res.dec();
                } else {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(res.getDescription());
            }
        }
    }
}
