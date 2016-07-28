/**
 * 
 */
package offer;

import static org.junit.Assert.*;
import item.AppleImpl;
import item.OrangeImpl;

import java.math.BigDecimal;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import checkout.Cart;
import checkout.CartImpl;

/**
 * @author Peter
 *
 */
public class BuyOneGetOneFreeOfferTest {

	private static final String APPLE = "Apple";

	/** The cart. */
	private Cart cart;
	
	/** The offer. */
	private Offer offer;
	
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
		offer = new BuyOneGetOneFreeOfferImpl();
		cart = new CartImpl();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		offer = null;
		cart = null;
	}

	
	
	/**
	 * Test apple bogof 3.
	 */
	@Test
	public void testAppleBogof3() {
		createAppleCart(3);
		Cart offerCart = offer.execute(cart, APPLE);
		assertEquals(offerCart.countItemsLike("Apple"), 2);
	}
	
	/**
	 * Test apple bogof 5 plus orange.
	 */
	@Test
	public void testAppleBogofMixed() {
		createAppleMixedCart();
		Cart offerCart = offer.execute(cart, APPLE);
		assertEquals(offerCart.countItemsLike("Apple"), 2);
	}
	
	/**
	 * Creates the mixed cart.
	 */
	private void createAppleMixedCart() {
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
