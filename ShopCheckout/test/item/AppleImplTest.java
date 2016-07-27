/**
 * Shop Checkout System. 
 */
package item;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * An Apple test.
 * 
 * @author Peter
 *
 */
public class AppleImplTest {

	/** The apple. */
	private AbstractItem apple;

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
		apple = new AppleImpl();
	}

	/**
	 * Tear down.
	 *
	 * @throws Exception the exception
	 */
	@After
	public void tearDown() throws Exception {
		apple = null;
	}
	
	/**
	 * Test apple name.
	 */
	@Test
	public void testAppleName() {
		assertEquals("Apple", apple.getName());
	}
	
	/**
	 * Test apple price.
	 */
	@Test
	public void testApplePrice() {
		assertEquals(new BigDecimal(0.60), apple.getPrice());
	}

}
