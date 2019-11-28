import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
import java.security.*;

public class RomanosTest
{
   @Test (expected = InvalidParameterException.class)
   public void testForInvalidParameter1()
   {
        String n = "IIII";
        RomanNumeral.convierte(n);
   }

   @Test (expected = InvalidParameterException.class)
   public void testForInvalidParameter2()
   {
        String n = "XXXX";
        RomanNumeral.convierte(n);
   }

   @Test (expected = InvalidParameterException.class)
   public void testForInvalidParameter3()
   {
        String n = "ILC";
        RomanNumeral.convierte(n);
   }

   @Test public void test1()
   {
		String n = "XV";
        assertEquals("test 1:", 15, RomanNumeral.convierte(n));
   }

   @Test public void test2()
   {
		String n = "C";
        assertEquals("test 2:", 100, RomanNumeral.convierte(n));
   }

   @Test public void test3()
   {
		String n = "DCCXXIX";
        assertEquals("test 3:", 729, RomanNumeral.convierte(n));
   }

    @Test public void test4()
   {
		String n = "MDCCXXII";
        assertEquals("test 4:", 1722, RomanNumeral.convierte(n));
   }
}
