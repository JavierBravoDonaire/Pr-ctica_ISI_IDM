import java.security.InvalidParameterException;

public class Bisiestos {
	// Devuelve true si año es bisiesto, false en caso contrario
	// Eleva la excepción InvalidParameter si año no es un parámetro válido
	
	public static boolean esBisiesto(int año) throws InvalidParameterException {
	    if(año < 0)
            throw new InvalidParameterException("Invalid Parameter");
		
		if((año % 4 == 0) && ((año % 100 != 0) || (año % 400 == 0)))
	        return true;
        else
	        return false;
	}
}
