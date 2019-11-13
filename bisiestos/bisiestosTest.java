import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
import java.security.*;

public class bisiestosTest
{
   @Test (expected = InvalidParameterException.class)
   public void testForInvalidParameter()
   {
        int año = -100;
        Bisiestos.esBisiesto(año);
   }
   
   @Test public void yearBisiesto()
   {
		int año = 2020;
        assertEquals("Año 2020:", true, Bisiestos.esBisiesto(año));
   }
   
   @Test public void yearNoBisiesto()
   {
		int año = 2019;
        assertEquals("Año 2019:", false, Bisiestos.esBisiesto(año));
   }
   
   @Test public void yearZero()
   {
		int año = 0;
        assertEquals("Año 0:", true, Bisiestos.esBisiesto(año));
   }
}
