package week01;


import week01.Time;

public class Time {
	private int sec, min, hrs;
	public Time() {
		long millis = System.currentTimeMillis();
		long totalSec = millis / 1000;
		this.setSec((int) (totalSec % 60));
		long totalMin = totalSec / 60;
		this.setMin((int) (totalMin % 60));
		long totalHrs = totalMin / 60;
		this.setHrs((int) (totalHrs % 24));
	}
	public int getSec() {
		return sec;
	}
	public void setSec(int sec) {
		this.sec = sec;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public int getHrs() {
		return hrs;
	}
	public void setHrs(int hrs) {
		this.hrs = hrs;
	}

	@Override
	public String toString() {
	    long millis = System.currentTimeMillis();
	    long totalSec = millis / 1000;
	    int sec = (int) (totalSec % 60);
	    long totalMin = totalSec / 60;
	    int min = (int) (totalMin % 60);
	    long totalHrs = totalMin / 60;
	    int hrs = (int) (totalHrs % 24);
	    return hrs + ":" + min + ":" + sec;
	}


	public static void main(String[] args) throws InterruptedException {
	    Time time = new Time();
	    System.out.println(time.toString());

	    Time[] times = new Time[5];
	    for (int i = 0; i < times.length; i++) {
	        times[i] = new Time();
	        System.out.println(times[i]);
	        if (i < times.length - 1) {
	            Thread.sleep(5000); // 休眠 5 秒
	        }
	    }
	}

}
