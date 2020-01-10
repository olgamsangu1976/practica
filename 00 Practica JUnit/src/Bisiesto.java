
public class Bisiesto {
	/**
	 * Calcula si un a�o es bisiesto o no
	 * @param anno a calcula
	 * @return true si es bisiesto o false si no lo es
	 */
	public String esBisiesto(int anno){
		if(!(anno%400==0)){
			if (!(anno%100==0)){
				if(anno%4==0)
					return "SI";
				else 
					return "NO";
			}
			else return "NO";
		}
		else return  "SI";
	}
}
