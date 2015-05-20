import java.util.Comparator;

public class Ej49 {
	Comparator<Integer> comp = new Comparator<Integer>() {
		@Override
		public int compare(Integer o1, Integer o2) {
			return o1 < o2 ? -1 : (o1 == o2) ? 0 : 1;
		}
	};

	public int comp(Integer o1, Integer o2) {
		return this.comp.compare(o1, o2);
	}

	static Integer i = 42;

	public void aaa() {
		if (i == 42)
			System.out.println("おめでとう");
	}
}
