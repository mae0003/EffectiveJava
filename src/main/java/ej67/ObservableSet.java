package ej67;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/**
 * 要素が追加されたことを通知可能な Set のラッパークラス。
 * 
 * @param <E>
 *            要素の型
 */
public class ObservableSet<E> extends ForwardingSet<E> {

	/**
	 * コンストラクタ
	 * 
	 * @param set
	 */
	public ObservableSet(Set<E> set) {
		super(set);
	}

	// リスナーのリスト
	private final List<SetObserver<E>> observers = new ArrayList<SetObserver<E>>();

	// リスナーを登録します。
	public void addObserver(SetObserver<E> observer) {
		synchronized (observers) {
			observers.add(observer);
		}
	}

	// リスナーを登録解除します。
	public boolean removeObserver(SetObserver<E> observer) {
		synchronized (observers) {
			return observers.remove(observer);
		}
	}

	@Override
	public boolean add(E element) {
		boolean added = super.add(element);
		if (added)
			notifyElementAdded(element);
		return added;
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		boolean result = false;
		for (E element : c)
			result |= add(element); // calls notifyElementAdded
		return result;
	}

	// リスナーに登録を通知します。
	private void notifyElementAdded(E element) {
		synchronized (observers) {
			for (SetObserver<E> observer : observers)
				observer.added(this, element);
		}
	}

	// // リスナーに登録を通知します。
	// private void notifyElementAdded(E element) {
	// List<SetObserver<E>> snapshot = null;
	//
	// synchronized (observers) {
	// snapshot = new ArrayList<SetObserver<E>>(observers);
	// }
	//
	// for (SetObserver<E> observer : snapshot)
	// observer.added(this, element);
	// }

	// Thread-safe observable set with CopyOnWriteArrayList - Page 269
	//
	// private final List<SetObserver<E>> observers =
	// new CopyOnWriteArrayList<SetObserver<E>>();
	//
	// public void addObserver(SetObserver<E> observer) {
	// observers.add(observer);
	// }
	// public boolean removeObserver(SetObserver<E> observer) {
	// return observers.remove(observer);
	// }
	// private void notifyElementAdded(E element) {
	// for (SetObserver<E> observer : observers)
	// observer.added(this, element);
	// }
}
