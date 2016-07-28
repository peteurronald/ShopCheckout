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
import org.junit.Ignore;
import org.junit.Test;



// TODO: Auto-generated Javadoc
/**
 * CheckoutService test.
 * 
 * @author Peter
 *
 */
public class CheckoutServiceImplTest {

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
	 * Test cart multi items.
	 */
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
	
	/**
	 * Test bogof apples.
	 */
	@Test
	@Ignore
	public void testBogofApples() {
		cart.put(new AppleImpl());
		cart.put(new AppleImpl());
		cart.put(new OrangeImpl());
		cart.put(new AppleImpl());
		BigDecimal totalCost = checkoutService.getAppleBogofTotalCost(cart);
	    BigDecimal expectedCost = new BigDecimal("1.20");
	    assertEquals(totalCost.compareTo(expectedCost), 0);
	}
	
	/**
	 * Test apple bogof 3.
	 */
	@Test
	public void testAppleBogof3() {
		createAppleCart(3);
		Cart amendedCart = checkoutService.getBogofAppleCart(cart);
		assertEquals(amendedCart.countItemsLike("Apple"), 2);
	}
	
	/**
	 * Test apple bogof 5 plus orange.
	 */
	@Test
	public void testAppleBogofMixed() {
		createMixedCart();
		Cart amendedCart = checkoutService.getBogofAppleCart(cart);
		assertEquals(amendedCart.countItemsLike("Apple"), 2);
	}

	/**
	 * Creates the mixed cart.
	 */
	private void createMixedCart() {
		cart.put(new AppleImpl());
		cart.put(new AppleImpl());
		cart.put(new OrangeImpl());
		cart.put(new AppleImpl());
		cart.put(new AppleImpl());
		cart.put(new OrangeImpl());
	}
	
	
	/**
	 * Creates the apple cart.
	 *
	 * @param apples the apples
	 */
	private void createAppleCart(int apples) {
		for (int i = 0; i < apples; i++) {
			cart.put(new AppleImpl());
		}
		
	}
	
}
