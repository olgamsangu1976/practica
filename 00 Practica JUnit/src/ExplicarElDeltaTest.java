import static org.junit.Assert.*;

import org.junit.Test;

public class ExplicarElDeltaTest {

	@Test
	public void testDameValor() {
		ExplicarElDelta instancia = new ExplicarElDelta();
		double dameValor = instancia.dameValor();
		if(dameValor>=1&&dameValor<2)
			System.out.println("correcto");
		else
			System.out.println("falso");
		//En junit se hace asi
		assertEquals(1.5, instancia.dameValor(),0.5);
		//El ultimo parametro se llama delta y es un +-intervalo
		//lo que digo aqui es que el valor que puede salir es 1.5+-0.5, es decir entre 1 y 2
	}

}
