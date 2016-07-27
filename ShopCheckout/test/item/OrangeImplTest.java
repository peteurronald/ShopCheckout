/**
 * Shop Checkout System. 
 */
package item;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.math.BigDecimal;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * An Orange test.
 * 
 * @author Peter
 *
 */
public class OrangeImplTest {

	private AbstractItem orange;

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
		orange = new OrangeImpl();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		orange = null;
	}


	/**
	 * Test orange name.
	 */
	@Test
	public void testOrangeName() {
		assertEquals("Orange", orange.getName());
	}
	
	/**
	 * Test orange price.
	 */
	@Test
	public void testOrangePrice() {
		assertEquals(new BigDecimal(0.25), orange.getPrice());
	}

}
