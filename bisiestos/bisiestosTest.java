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

   @Test public void arrayBisiesto()
   {
	   int año[] = {0,4,8,12,16,20,24,1904,1912,1972,2004,1964,1968};
	   for(int i = 0; i < año.length; i++){
		   assertEquals("Array Años Bisiesto:", true, Bisiestos.esBisiesto(año[i]));
	   }
   }

   @Test public void arrayNoBisiesto()
   {
	   int año[] = {1,1003,2983,777,13,100001};
	   for(int i = 0; i < año.length; i++){
		   assertEquals("Array Años No Bisiesto:", false, Bisiestos.esBisiesto(año[i]));
	   }
   }

   @Test public void arrayWithFailure()
   {
	   int año[] = {0,4,8,12,16,20,1,24,1904,1912,1972,2004,1964,1968};
	   for(int i = 0; i < año.length; i++){
		   assertEquals("Array Años Bisiesto con año no bisiesto:", false, Bisiestos.esBisiesto(año[i]));
	   }
   }
}
