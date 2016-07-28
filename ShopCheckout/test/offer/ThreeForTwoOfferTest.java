/**
 * 
 */
package offer;

import static org.junit.Assert.*;
import item.OrangeImpl;

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
public class ThreeForTwoOfferTest {

	private static final String ORANGE = "Orange";

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
		offer = new ThreeForTwoOfferImpl();
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
	 * Test 3 for 2 orange.
	 */
	@Test
	public void test3for2Oranges() {
		createOrangeCart(6);
		Cart offerCart = offer.execute(cart, ORANGE);
		assertEquals(offerCart.countItemsLike("Orange"), 4);
	}

	
	
	/**
	 * Creates the orange cart.
	 *
	 * @param oranges the oranges
	 */
	private void createOrangeCart(int oranges) {
		for (int i = 0; i < oranges; i++) {
			cart.put(new OrangeImpl());
		}
	}

}
