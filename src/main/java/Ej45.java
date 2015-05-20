import java.util.ArrayList;
import java.util.List;

public class Ej45 {
	private List<String> aaa = new ArrayList<>();

	public void do1(Boolean isFine) {
		if (isFine == null)
			throw new NullPointerException("isFine is null.");
	}
}
