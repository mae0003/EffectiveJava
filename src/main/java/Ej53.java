import java.lang.reflect.Method;

public class Ej53 {
	private Object hoge;

	public Ej53(Object hoge) {
		this.hoge = hoge;
	}

	public String startWith() {

		Class<?> c = this.hoge.getClass();
		for (Method m : c.getMethods()) {
			System.out.println(m.getName());
		}

		return "owari";
	}
}
