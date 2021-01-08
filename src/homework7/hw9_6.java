package homework7;

import java.util.Random;

public class hw9_6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StopWatch watch = new StopWatch();
		int []arr = new int[100000];
		init(arr);
		watch.start();
		for (int st = 0; st < 100000; ++st) {
			int minn = arr[st], id = st;
			for (int i = st + 1; i < 100000; ++i) {
				if (arr[i] < minn) {
					minn = arr[i];
					id = i;
				}
			}
			arr[id] = arr[st];
			arr[st] = minn;
		}
		watch.stop();
		System.out.println(watch.getElapsedTIme());
	}
	
	public static void init(int []arr) {
		Random random = new Random();
		for (int i = 0; i < 100000; ++i) {
			arr[i] = random.nextInt();
		}
	}
	
	public static class StopWatch{
		private long startTime = 0;
		private long endTime = 0;
		
		public StopWatch() {
			this.startTime = System.currentTimeMillis();
		}
		
		public void start() {
			this.startTime = System.currentTimeMillis();
		}
		
		public void stop() {
			this.endTime = System.currentTimeMillis();
		}
		
		public long getElapsedTIme() {
			return this.endTime - this.startTime;
		}
	}
}
