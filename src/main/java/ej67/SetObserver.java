package ej67;

public interface SetObserver<E> {
	// オブザ―バブルなセットへ要素が追加されたときに呼び出される
	void added(ObservableSet<E> observableSet, E element);
}
