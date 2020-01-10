
public class Bisiesto {
	/**
	 * Calcula si un ajjjjo es bisiesto o no
	 * @param anno a calcula
	 * @return true si es bisiesto o false si no lo es
	 */
	public String esBisiesto(int anno){
		if(!(anno%400==0)){
			if (!(anno%100==0)){
				if(anno%4==0)
					return "Si";
				else 
					return "No";
			}
			else return "Si";
		}
		else return  "No";
	}
}
