import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class App {

  public static void main(String[] args) {
    // Timer     = 	A facility for threads to schedule tasks
    //				      for future execution in a background thread

    // TimerTask = 	A task that can be scheduled for one-time
    //				      or repeated execution by a Timer

    Timer timer = new Timer();

    TimerTask task = new TimerTask() {
      int counter = 10;

      @Override
      public void run() {
        if (counter > 0) {
          System.out.println(counter + " seconds");
          counter--;
        } else {
          System.out.println("happy new year");
          timer.cancel();
        }
      }
    };

    Calendar date = Calendar.getInstance();
    date.set(Calendar.YEAR, 2020);
    date.set(Calendar.MONTH, Calendar.JUNE);
    date.set(Calendar.DAY_OF_MONTH, 20);
    date.set(Calendar.HOUR_OF_DAY, 0);
    date.set(Calendar.MINUTE, 0);
    date.set(Calendar.SECOND, 0);
    date.set(Calendar.MILLISECOND, 0);

    System.out.println(date.getTime());

    // timer.schedule(task, 2000); // ms delay
    // timer.schedule(task, date.getTime());
    timer.scheduleAtFixedRate(task, 500, 1000);
  }
}
