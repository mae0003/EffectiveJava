import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;

import org.junit.Test;

public class Ej48Test {

	@Test
	public void testCheck1_収まらない() {
		Ej48 sut = new Ej48();
		assertFalse(sut.check1(250F, 249.8F));
	}

	@Test
	public void testCheck1_収まり() {
		Ej48 sut = new Ej48();
		assertTrue(sut.check1(250F, 249.9F));
	}

	@Test
	public void testCheck2_収まらない() {
		Ej48 sut = new Ej48();
		assertFalse(sut.check2(new BigDecimal("250"), new BigDecimal("249.8")));
	}

	@Test
	public void testCheck2_収まり() {
		Ej48 sut = new Ej48();
		assertTrue(sut.check2(new BigDecimal("250"), new BigDecimal("249.9")));
	}

}
