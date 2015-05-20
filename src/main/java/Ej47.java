import java.util.Random;

public class Ej47 {
	private Random rnd = new Random();

	int random(int n) {
		return Math.abs(rnd.nextInt(1000));
	}

	public void do1() {
		int n = 10;
		int low = 0;
		for (int i = 0; i < 1000000; i++) {
			int s = random(n);
			if (s < n / 2)
				low++;
			System.out.println(s);
		}
	}

}
