import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
import java.security.*;

public class EmbotelladoraTest
{
   @Test (expected = InvalidParameterException.class)
   public void testForInvalidParameter1()
   {
        int litros = -100;
        int bPeq = 3;
        int bGran = 4;
        Embotelladora.calculaBotellasPequenas(bPeq, bGran, litros);
   }

    @Test (expected = InvalidParameterException.class)
   public void testForInvalidParameter2()
   {
        int litros = 100;
        int bPeq = -6;
        int bGran = 4;
        Embotelladora.calculaBotellasPequenas(bPeq, bGran, litros);
   }

    @Test (expected = InvalidParameterException.class)
   public void testForInvalidParameter3()
   {
        int litros = 100;
        int bPeq = 3;
        int bGran = -4;
        Embotelladora.calculaBotellasPequenas(bPeq, bGran, litros);
   }

    // NoSolution: bPeq < litros - 5*bGran
    @Test (expected = NoSolution.class)
   public void testNoSolution()
   {
		int litros = 100;
        int bPeq = 3;
        int bGran = 4;
        Embotelladora.calculaBotellasPequenas(bPeq, bGran, litros);
   }

   // IgualCapacidad: bPeq = litros - 5*bGran
   @Test public void testIgualCapacidad()
   {
		int litros = 30;
        int bPeq = 5;
        int bGran = 5;
        assertEquals("igual Capacidad:", litros - 5*bGran,
                     Embotelladora.calculaBotellasPequenas(bPeq, bGran, litros));
   }

   // Mayor Capacidad: bPeq > litros - 5*bGran
   @Test public void testMayorCapacidad()
   {
		int litros = 30;
        int bPeq = 34;
        int bGran = 5;
        assertEquals("Mayor Capacidad:", litros - 5*bGran,
                     Embotelladora.calculaBotellasPequenas(bPeq, bGran, litros));
   }
}
