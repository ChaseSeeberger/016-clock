import java.util.Timer;
import java.util.TimerTask;

public class DigitalClock1 extends MyTime implements NewInterface {
    
        /**
         * A full class has fully written methods with complete code.
         * <p>
         * An interface class has no fully written methods with just names, no code.
         * <p>
         * An abstract class has both fully written methods, and methods with just names. Abstract classes can only implement one other class.
         * 
         * 
         */
    23
	public static void main(String[] args) {
		final DigitalClock1 dc1 = new DigitalClock1();
		Timer clock = new Timer();
		TimerTask tt = new TimerTask() {
			@Override
			public void run() {
				dc1.display();
			}
		};
		dc1.display();
		clock.scheduleAtFixedRate(tt, 1000, 1000);

	}

	
	
	@Override
	public void display() {
		String dt = MyTime.getDate();
		String tm = MyTime.getTime();
		String time = dt+ " - " + tm;
		System.out.println(time);
	}

	@Override
	public void first() {
		throw new UnsupportedOperationException();
		
	}

	@Override
	public String second(int x) {
		return null;
	}
	
}
