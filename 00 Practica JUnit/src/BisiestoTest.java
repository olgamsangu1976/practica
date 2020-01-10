import static org.junit.Assert.*;

import org.junit.Test;

public class BisiestoTest {

	@Test
	public void testEsBisiesto() {
		Bisiesto instancia=new Bisiesto();
		int[] annosSI={1968,2000},annosNO={1999,1800,1900},annosFuera={12};
		for (int i = 0; i < annosSI.length; i++) {
			assertEquals("SI", instancia.esBisiesto(annosSI[i]));
		}
		for (int i = 0; i < annosNO.length; i++) {
			assertEquals("NO", instancia.esBisiesto(annosNO[i]));
		}
		for (int i = 0; i < annosFuera.length; i++) {
			assertEquals("Fuera de rango", instancia.esBisiesto(annosFuera[i]));
		}
	}
	@Test
	public void testToMuLoco(){
		Bisiesto instancia=new Bisiesto();
		int[][] entradas={{1968,2000},{1999,1800,1900},{12}};
		String resultados[]={"SI","NO","Fuera de rango"};
		for (int i = 0; i < entradas.length; i++) {
			for (int j = 0; j < entradas[i].length; j++) {
				assertEquals(resultados[i], instancia.esBisiesto(entradas[i][j]));
			}
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
