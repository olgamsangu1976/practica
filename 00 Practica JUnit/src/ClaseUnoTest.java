import static org.junit.Assert.*;

import org.junit.Test;

public class ClaseUnoTest {

	@Test
	public void testSumar() {
		int a=6,b=5,resultado=11;
		ClaseUno claseUno=new ClaseUno();
//		if(claseUno.sumar(a, b)==11)
//			System.out.println("prueba valida");
//		else
//			System.out.println("Error");
		//esto sustityue a  lo anterior
		assertEquals(claseUno.sumar(a, b), resultado);
	}

	@Test
	public void testRestar() {
		int a=6,b=5,resultado=1;
		ClaseUno claseUno=new ClaseUno();
		assertEquals(claseUno.restar(a, b), resultado);
	}

}
