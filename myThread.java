package multithread;

public class myThread implements Runnable {
	
		String Name;
		Thread T;
	    myThread String;
	    myThread(java.lang.String threadname) {
		    Name = threadname; 
		    T = new Thread(this, Name);
		System.out.println("New thread: " + T);
		T.start();
}


		public void run() {
		 try {
		     for(int i = 5; i > 0; i--) {
		     System.out.println(Name + ": " + i);
		      Thread.sleep(1000);
		}
		}catch (InterruptedException e) {
		     System.out.println(Name + "Interrupted");
		}
		     System.out.println(Name + " exiting.");
		}
		}
