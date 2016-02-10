package ej67;

import java.util.HashSet;

public class Ej67 {

	public static void main(String[] args) {

		ObservableSet<Integer> set = new ObservableSet<>(new HashSet<Integer>());

		set.addObserver(new SetObserver<Integer>() {
			@Override
			public void added(ObservableSet<Integer> s, Integer e) {
				System.out.println("追加された数字は ->" + e);
				if (e == 23)
					s.removeObserver(this);
			}
		});

		for (int i = 0; i < 100; i++) {
			set.add(i);
		}
	}
}
