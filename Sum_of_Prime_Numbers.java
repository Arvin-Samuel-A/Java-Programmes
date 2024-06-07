import java.util.Scanner;
import java.util.Vector;
import java.util.concurrent.locks.ReentrantLock;


class Prime_Numbers implements Runnable{

    private long Number1, Number2;
    private long Total = 0;

    private ReentrantLock Mutex = new ReentrantLock();

    Prime_Numbers(long Num1, long Num2){

        Number1=Num1;
        Number2=Num2;

    }

    @Override
    public void run(){

        for (long x = Number1; x < Number2; x++){

            if (x % 2 != 0)
            {

                boolean Found = true;

                long Var = (long) (Math.sqrt((double)x) + 1);

                for (long y = 3; y < Var; y += 2)
                {

                    if (x % y == 0)
                    {

                        Found = false;
                        break;

                    }

                }

                if (Found)
                {

                    Total = Total + x;

                }

            }

        }

        Mutex.lock();
        Sum_of_Prime_Numbers.Sum = Sum_of_Prime_Numbers.Sum + Total;
        Mutex.unlock();

    }

}


public class Sum_of_Prime_Numbers {

    static long Sum = 2;

    public static void main(String[] args){

        long Terms;

        Scanner Input = new Scanner(System.in);

        System.out.println("We are Going to Calculate the Sum of Prime Numbers Till the User entered Limit!!!\n");

        System.out.print("Enter the Limit : ");
        Terms = Input.nextLong();
        System.out.println();

        Threading(Terms);

        System.out.println("The Sum of Prime Numbers till " + Terms + " is : " + Sum);

        Input.close();
        
    }

    static void Threading(long Terms){

        double Var = Terms - 2;

        Vector<Thread> Threads = new Vector<>(12);

        Var = Var / 12;

        for (int x = 0; x < 12; x++){

            Prime_Numbers Obj = new Prime_Numbers((long)(Var * x + 3), (long)(Var * (x+1) + 3));

            Thread Th = new Thread(Obj);

            Threads.add(Th);

        }

        for (Thread x : Threads){

            x.start();

            try {

                x.join();

            }

            catch (InterruptedException e) {

                throw new RuntimeException(e);

            }

        }

    }

}