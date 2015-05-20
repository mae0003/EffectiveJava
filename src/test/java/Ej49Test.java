import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class Ej49Test {

	@Test
	public void testComp_１のほうが大きい() {
		Ej49 sut = new Ej49();
		int expected = 1;
		int actual = sut.comp(49, 20);

		assertThat(actual, is(expected));
	}

	@Test
	public void testComp_同値New() {
		Ej49 sut = new Ej49();
		int expected = 0;
		int actual = sut.comp(new Integer(49), new Integer(49));
		assertThat(actual, is(expected));
	}

	@Test
	public void testComp_同値() {
		Ej49 sut = new Ej49();
		int expected = 0;
		int actual = sut.comp(49, 49);

		assertThat(actual, is(expected));
	}

	@Test
	public void testComp_222() {
		Ej49 ej49 = new Ej49();
		ej49.aaa();
	}

}
