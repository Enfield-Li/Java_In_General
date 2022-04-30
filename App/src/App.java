public class App {

  public static void main(String[] args) throws InterruptedException {
    // System.out.println(Thread.activeCount());
    // Thread.currentThread().setPriority(10); // set highest priority
    // System.out.println(Thread.currentThread().getPriority()); // 1 ~ 10

    // System.out.println(Thread.currentThread().isAlive());

    // for (int i = 1; i <= 3; i++) {
    //   System.out.println(i);
    //   Thread.sleep(1000);
    // }
    // System.out.println("done");

    MyThread thread2 = new MyThread();
    thread2.setDaemon(true);
    thread2.start();
    // thread2.setPriority(3);

    // thread2.setName("second thread");
    // System.out.println(thread2.isAlive());
    // System.out.println(thread2.getName());
    // System.out.println(thread2.getPriority()); // inherit priority that creates it
    System.out.println("thread2 is deamon: " + thread2.isDaemon());

    System.out.println(Thread.activeCount());
  }
}
/*
        thread =	
    A thread of execution in a program (kind of like a virtual CPU)
    The JVM allows an application to have multiple threads running concurrently
    Each thread can execute parts of you code in parallel with the main thread
    Each thread has a priority.
    Threads with higher priority are executed in preference compared to threads with a lower priority
    
        The Java Virtual Machine continues to execute threads until either of the following occurs
        1. The exit method of class Runtime has been called
        2. All user threads have died
      
    When a JVM starts up, there is a thread which calls the main method
    This thread is called “main”
        
    Daemon thread is a low priority thread that runs in background to perform tasks such as garbage collection 
    JVM terminates itself when all user threads (non-daemon threads) finish their execution
    */
