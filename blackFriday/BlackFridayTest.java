import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
import java.security.*;

public class BlackFridayTest
{
	Calendar cal = Calendar.getInstance();
	int day = cal.get(Calendar.DAY_OF_MONTH);
	int month = cal.get(Calendar.MONTH) + 1;

	@Test (expected = InvalidParameterException.class)
	public void testForNegativePercent()
    {
		double originalPrice = 124.0;
		double percent = -100.0;

        DescuentoBlackFriday.precioFinal(originalPrice,percent);
    }

	@Test (expected = InvalidParameterException.class)
	public void testForNegativePrice()
    {
		double originalPrice = -124.0;
		double percent = 100.0;

        DescuentoBlackFriday.precioFinal(originalPrice,percent);
    }

	@Test (expected = InvalidParameterException.class)
	public void testFor200Percent()
    {
		double originalPrice = -124.0;
		double percent = 200.0;

        DescuentoBlackFriday.precioFinal(originalPrice,percent);
    }

	public void testFor0Percent()
	{
		double originalPrice = 124.0;
		double percent = 0.0;

		assertEquals("Zero percent:", 124.0,
						DescuentoBlackFriday.precioFinal(originalPrice,percent));
	}

	public void test100Percent()
	{
		double originalPrice = 36.21;
		double percent = 100.0;

		if(day == 29 && month == 11){
			assertEquals("100 percent:", 0.0,
							DescuentoBlackFriday.precioFinal(originalPrice,percent));
		}else{
			assertEquals("100 percent:", 36.21,
							DescuentoBlackFriday.precioFinal(originalPrice,percent));
		}
	}

	public void testFor50Percent()
	{
		double originalPrice = 200.5;
		double percent = 50.0;

		if(day == 29 && month == 11){
			assertEquals("50 percent:", 100.25,
							DescuentoBlackFriday.precioFinal(originalPrice,percent));
		}else{
			assertEquals("50 percent:", 200.5,
							DescuentoBlackFriday.precioFinal(originalPrice,percent));
		}
	}
}
