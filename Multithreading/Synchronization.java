package Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Synchronization {


	    Integer sum=new Integer(0);

	     Synchronization(){
	         ExecutorService e=Executors.newFixedThreadPool(1000);
	         for(int i=0;i<1000;i++){
	             e.execute(new Sum());
	         }
	         e.shutdown();

	         while(!e.isTerminated()){

	         }
	         System.out.println(sum);
	     }
	    public static void main(String[]args){
	        new Synchronization();
	    }

	     class Sum implements Runnable{


	        @Override
	        public void run() {

	            m();

	        }
	       public synchronized void m(){
	             sum=sum+1;
	         }
	     }

	}


