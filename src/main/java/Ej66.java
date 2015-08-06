import java.util.concurrent.TimeUnit;

public class Ej66 {
	private static boolean stopRequested;

	public static synchronized boolean isStopRequested() {
		return stopRequested;
	}

	public static synchronized void setStopRequested(boolean stopRequested) {
		Ej66.stopRequested = stopRequested;
	}

	public static void main(String[] args) throws InterruptedException {
		Thread backgroundThread = new Thread(() -> {
			int i = 0;
			while (!stopRequested) {
				i++;
				// if (i % 1000000 == 0)
				// System.out.print("*");
			}
		});

		backgroundThread.start();

		TimeUnit.SECONDS.sleep(2);
		stopRequested = true;
		// setStopRequested(true);
	}
}
