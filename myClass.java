package multithread;

public class myClass extends Thread {
    public void run(){
    System.out.println("MyClass running");
    myClass t1 = new myClass ();
    t1.start();
  }
}
