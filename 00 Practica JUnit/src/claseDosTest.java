import static org.junit.Assert.*;

import org.junit.Test;

public class claseDosTest {

	@Test
	public void testEsCierto() {
		claseDos claseDos=new claseDos();
		
		System.out.println("llego aqui");
		assertEquals(claseDos.esCierto(), true);
		//un fallo interrumpe la ejecucion de la prueba
		//Para boolean hay algo más epecifico
		
		System.out.println("y aqui");
		assertTrue(claseDos.esCierto());
		
		
	}

	@Test
	public void testEsFalso() {
		claseDos claseDos=new claseDos();
		assertEquals(claseDos.esFalso(), false);
	}

}
