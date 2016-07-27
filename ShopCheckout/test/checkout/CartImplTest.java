/**
 * Shop Checkout System. 
 */
package checkout;

import static org.junit.Assert.assertEquals;
import item.AppleImpl;
import item.OrangeImpl;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * Cart test.
 * 
 * @author Peter
 *
 */
public class CartImplTest {

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
	}

	/**
	 * Tear down.
	 *
	 * @throws Exception the exception
	 */
	@After
	public void tearDown() throws Exception {
		cart = null;
	}
	
	/**
	 * Test cart is empty.
	 */
	@Test
	public void testCartIsEmpty() {
		assertEquals(cart.getItems().size(), 0);
	}

	/**
	 * Test cart has apple.
	 */
	@Test
	public void testCartHasApple() {
		cart.put(new AppleImpl());
		assertEquals(cart.getItems().size(), 1);
	}

	/**
	 * Test cart has orange.
	 */
	@Test
	public void testCartHasOrange() {
		cart.put(new OrangeImpl());
		assertEquals(cart.getItems().size(), 1);
	}
}
