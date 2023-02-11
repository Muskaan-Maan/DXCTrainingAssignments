import java.lang.Thread;
import java.lang.Runnable;

class Thread1 {

    public Thread1() {

        Runnable printA = new PrintChar('a', 100, 200);
        Runnable printB = new PrintChar('b', 100, 100);
        Runnable print100 = new PrintNum(100);

        Thread thread1 = new Thread(printA);
        Thread thread2 = new Thread(printB);
        Thread thread3 = new Thread(print100);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}


    class PrintChar implements Runnable {

        private char charToPrint;
        private int times;
        private int ms;

        public PrintChar(char c, int t, int ms) {

            charToPrint = c;
            times = t;
            this.ms = ms;
        }

        public void run() {
            try {
                Thread.sleep(50);
                System.out.print(charToPrint);
                Thread.sleep(ms);

                for (int i = 1; i < times; i++) {
                    System.out.print(charToPrint);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    class PrintNum implements Runnable {

        private int lastNum;

        public PrintNum(int n) {
            lastNum = n;
        }

        public void run() {
            try {
                System.out.print(" 1");
                Thread.sleep(100);

                for (int i = 2; i <= lastNum; i++) {
                    System.out.print(" " + i);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public class Threads123{


    public static void main(String[] args) {


        Thread1 t = new Thread1();
        System.out.println(t);
    }
}


