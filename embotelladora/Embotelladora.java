import java.security.InvalidParameterException;

public class Embotelladora {
	// Parámetros:	pequenas: número de botellas en almacén de 1L
 	//				grandes : número de botellas en almacén de 5L
	//				total: número total de litros que hay que embotellar

	// Devuelve: número de botellas pequeñas necesarias para embotellar
	//           el total de líquido, teniendo en cuenta que hay que
	// 			 minimizar el número de botellas pequeñas: primero se
	//			 rellenan las grandes

	// Eleva la excepción NoSolution si no es posible embotellar todo el
	// líquido

	public static int calculaBotellasPequenas(int pequeñas, int grandes, int total) throws NoSolution {
		if(pequeñas < 0 || grandes < 0 || total < 0){
			throw new InvalidParameterException("Invalid Parameter");
		}
		while(total >= 5 && grandes > 0){
			total -= 5;
			grandes--;
		}
		if(total > pequeñas){
			throw new NoSolution();
		}else{
			return total;
		}
	}
}
