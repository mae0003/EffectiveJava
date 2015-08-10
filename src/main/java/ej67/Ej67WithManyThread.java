package ej67;

import java.util.HashSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ej67WithManyThread {

	public static void main(String[] args) {

		ObservableSet<Integer> set = new ObservableSet<Integer>(new HashSet<Integer>());

		// Observer that uses a background thread needlessly
		set.addObserver(new SetObserver<Integer>() {
			public void added(final ObservableSet<Integer> s, Integer e) {
				System.out.println(e);

				if (e == 23) {
					ExecutorService executor = Executors.newSingleThreadExecutor();
					final SetObserver<Integer> observer = this;
					try {
						System.out.println("削除開始");
						executor.submit(() -> s.removeObserver(observer)).get();
						System.out.println("削除完了");
					} catch (Exception ex) {
						throw new AssertionError(ex.getCause());
					} finally {
						executor.shutdown();
					}
				}
			}
		});

		for (int i = 0; i < 100; i++)
			set.add(i);
	}
}
