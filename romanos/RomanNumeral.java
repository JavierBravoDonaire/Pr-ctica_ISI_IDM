import java.security.InvalidParameterException;

public class RomanNumeral {
	// Parámetro: s es un número romano
	// Devuelve : el número s en base 10
	// Eleva la excepción InvalidParameter si s no es un número romano

	public static int calculoRecursivo (String s){
		if (s.isEmpty()) return 0;
		if (s.startsWith("M"))  return 1000 + calculoRecursivo(s.substring(1));
        else if (s.startsWith("CM")) return 900  + calculoRecursivo(s.substring(2));
        else if (s.startsWith("D"))  return 500  + calculoRecursivo(s.substring(1));
        else if (s.startsWith("CD")) return 400  + calculoRecursivo(s.substring(2));
        else if (s.startsWith("C"))  return 100  + calculoRecursivo(s.substring(1));
        else if (s.startsWith("XC")) return 90   + calculoRecursivo(s.substring(2));
        else if (s.startsWith("L"))  return 50   + calculoRecursivo(s.substring(1));
        else if (s.startsWith("XL")) return 40   + calculoRecursivo(s.substring(2));
        else if (s.startsWith("X"))  return 10   + calculoRecursivo(s.substring(1));
        else if (s.startsWith("IX")) return 9    + calculoRecursivo(s.substring(2));
        else if (s.startsWith("V"))  return 5    + calculoRecursivo(s.substring(1));
        else if (s.startsWith("IV")) return 4    + calculoRecursivo(s.substring(2));
        else if (s.startsWith("I"))  return 1    + calculoRecursivo(s.substring(1));
        throw new InvalidParameterException("No es un número romano");
	}

	public static int convierte (String s) throws InvalidParameterException{
		if (s.contains("IIII") || s.contains("XXXX") || s.contains("CCCC")
	    		|| s.contains("MMMM") || s.contains("VV") || s.contains("LL")
	    		|| s.contains("DD") || s.contains("VL") || s.contains("VIV")
	    		|| s.contains("XXM") || s.contains("CXM") || s.contains("XID")
			|| s.contains("LC")){
					throw new InvalidParameterException("No es un número romano");
		}
		return calculoRecursivo(s);
	}
}
