package threads;
import static java.lang.Thread.sleep;

public class ThreadInc implements Runnable {

    Storage res;

    public ThreadInc (Storage res)
    {
        this.res = res;
    }

    @Override
    public void run() {
       synchronized (res) {
           for (;;) {
               if (res.getResUnits() < res.maxRes()) {
                   res.inc();
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

//            if(res.getResUnits() < res.maxRes()) {
//                res.inc();
//            } else {
//                t
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//            System.out.println(res.getDescription());
//        }
//    }

}
