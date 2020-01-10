import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class FigurasTest {

	@Ignore
	public void testSumaEnteros() {
		fail("Not yet implemented");
	}

	@Test
	public void testAreaCirculo() {
		assertEquals(56.54, Figura.areaCirculo(3),.01);
		assertEquals(-1, Figura.areaCirculo(-2),1);
	}

	@Test
	public void testEsPar() {
		assertTrue(Figura.esPar(2));
		assertFalse(Figura.esPar(1));
		assertTrue( Figura.esPar(0));
	}

	@Test
	public void testElevarNumero() {
		assertEquals(4, Figura.elevarNumero(2, 2));
		assertEquals(4, Figura.elevarNumero(-2, 2));
		assertEquals(25, Figura.elevarNumero(5, 2));
	}

}
