
class Time {
	
	private int hour;
	private int minute;
	private int second;
	
	public void setHour(int hour) {
		if(isNotValidHour(hour)) {
			return;
		}
		this.hour = hour;
	}

	private boolean isNotValidHour(int hour){
		return hour < 0 || hour > 23;
		}
	
	public int getHour() {
		return hour;
	}
	
	public void setMinute(int minute) {
		if(minute < 0 || minute > 60) {
			return;
		}
		
		this.minute = minute;
	}
	
	public void setSecont(int second) {
		if(second < 0 || second > 60) {
			return;
		}
		
		this.second = second;
		
		
	}
}


public class TimeTest {

	public static void main(String[] args) {

		Time t = new Time();
		t.setHour(11);
		System.out.println(t.getHour());
		t.setHour(100); // 유효한 값이 아니기 때문에 값이 바뀌지 않고 그대로 나옴
		System.out.println(t.getHour());
		
		
	}
}
	
