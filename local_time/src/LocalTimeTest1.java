import java.time.Clock;
import java.time.LocalTime;
import java.time.ZoneId;

public class LocalTimeTest1 {

	public static void main(String[] args) {
		// 1. Get Local Time present 
		LocalTime time= LocalTime.now();
		System.out.println(time);
		
		// 2. Get Minutes,Seconds,Nano, Hours
		System.out.println(time.getMinute());
		System.out.println(time.getHour());
		System.out.println(time.getNano());
	
		// 3. Add hours to the current time
		LocalTime timeplusHour=time.plusHours(2);
		System.out.println(timeplusHour);
		// similary for seconds, minutes and hours
		time.plusSeconds(20);
		time.plusMinutes(20);
		time.plusNanos(20);

		// 4. Add  
		Clock clock=Clock.systemDefaultZone();
		System.out.println(clock);
		Clock clockDefault=Clock.systemUTC();
		System.out.println(clockDefault);
		System.out.println(Clock.system(ZoneId.of("America/New_York")));
		
		
		
		System.out.println(time.isBefore(LocalTime.MIDNIGHT));
		
	}

}
