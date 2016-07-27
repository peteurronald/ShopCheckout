/**
 * Shop Checkout System. 
 */
package checkout;

import static org.junit.Assert.assertEquals;
import item.AppleImpl;
import item.OrangeImpl;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;



/**
 * CheckoutService test.
 * 
 * @author Peter
 *
 */
public class CheckoutServiceImplTest {

	private CheckoutService checkoutService;
	private Cart cart;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		cart = new CartImpl();
		checkoutService = new CheckoutServiceImpl();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		cart = null;
		checkoutService = null;
	}

	@Test
	public void testEmptyCart() {
		assertEquals(checkoutService.getTotalCost(new CartImpl()),new BigDecimal("0.00"));
	}

	@Test
	public void testCartItem() {
		cart.put(new AppleImpl());
		assertEquals(checkoutService.getTotalCost(cart),new BigDecimal(0.60));
	}
	
	@Test
	public void testCartMultiItems() {
		cart.put(new AppleImpl());
		cart.put(new AppleImpl());
		cart.put(new OrangeImpl());
		cart.put(new AppleImpl());
		BigDecimal totalCost = checkoutService.getTotalCost(cart);
	    BigDecimal expectedCost = new BigDecimal("2.05");
	    assertEquals(totalCost.compareTo(expectedCost), 0);
	}
	
}
