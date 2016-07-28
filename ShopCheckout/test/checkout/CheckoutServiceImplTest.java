/**
 * Shop Checkout System. 
 */
package checkout;

import static org.junit.Assert.assertEquals;
import item.AppleImpl;
import item.OrangeImpl;

import java.math.BigDecimal;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;



// TODO: Auto-generated Javadoc
/**
 * CheckoutService test.
 * 
 * @author Peter
 *
 */
public class CheckoutServiceImplTest {

	/** The Constant APPLE. */
	private static final String APPLE = "Apple";
	
	/** The Constant ORANGE. */
	private static final String ORANGE = "Orange";
	
	/** The checkout service. */
	private CheckoutService checkoutService;
	
	/** The cart. */
	private Cart cart;

	/**
	 * Sets the up before class.
	 *
	 * @throws Exception the exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * Tear down after class.
	 *
	 * @throws Exception the exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * Sets the up.
	 *
	 * @throws Exception the exception
	 */
	@Before
	public void setUp() throws Exception {
		cart = new CartImpl();
		checkoutService = new CheckoutServiceImpl();
	}

	/**
	 * Tear down.
	 *
	 * @throws Exception the exception
	 */
	@After
	public void tearDown() throws Exception {
		cart = null;
		checkoutService = null;
	}

	/**
	 * Test empty cart.
	 */
	@Test
	public void testEmptyCart() {
		assertEquals(checkoutService.getTotalCost(new CartImpl()),new BigDecimal("0.00"));
	}

	/**
	 * Test cart item.
	 */
	@Test
	public void testCartItem() {
		cart.put(new AppleImpl());
		BigDecimal totalCost = checkoutService.getTotalCost(cart);
	    BigDecimal expectedCost = new BigDecimal("0.60");
	    assertEquals(totalCost.compareTo(expectedCost), 0);
	}
	
	
	/**
	 * Test total cost buy one get one free.
	 */
	@Test
	public void testTotalCostBuyOneGetOneFree() {
		createMixedCart();
		BigDecimal totalCost = checkoutService.getTotalCostBuyOneGetOneFree(cart, APPLE);
	    BigDecimal expectedCost = new BigDecimal("2.70");
	    assertEquals(totalCost.compareTo(expectedCost), 0);
	}
	
	/**
	 * Test total cost three for two.
	 */
	@Test
	public void testTotalCostThreeForTwo() {
		createMixedCart();
		BigDecimal totalCost = checkoutService.getTotalCostThreeForTwo(cart,ORANGE);
	    BigDecimal expectedCost = new BigDecimal("3.40");
	    assertEquals(totalCost.compareTo(expectedCost), 0);
	}
	
	
	/**
	 * Creates the mixed cart.
	 */
	private void createMixedCart() {
		cart.put(new AppleImpl());
		cart.put(new OrangeImpl());
		cart.put(new OrangeImpl());
		cart.put(new AppleImpl());
		cart.put(new OrangeImpl());
		cart.put(new OrangeImpl());
		cart.put(new AppleImpl());
		cart.put(new OrangeImpl());
		cart.put(new AppleImpl());
		cart.put(new OrangeImpl());
	}
	
	
	
	
	
}
