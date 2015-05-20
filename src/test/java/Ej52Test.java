import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.List;
import java.util.Vector;

import org.junit.Test;

public class Ej52Test {

	@Test
	public void testGetNameOfStartWithM() {
		List<String> list = new Vector<>();
		list.add("Maeda");
		list.add("Sato");
		list.add("Mori");

		Ej52 sut = new Ej52(list);
		List<String> m = sut.getNameOfStartWithM();

		assertThat(m.get(0), is("Maeda"));
		assertThat(m.get(1), is("Mori"));
	}
}
