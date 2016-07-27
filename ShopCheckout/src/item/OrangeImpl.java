/**
 * Shop Checkout System. 
 */
package item;

import java.math.BigDecimal;

/**
 * Implements an Orange item.
 * 
 * @author Peter
 *
 */
public class OrangeImpl extends AbstractItem {
	
	/**
	 * Instantiates a new orange.
	 */
	public OrangeImpl() {
		super("Orange", new BigDecimal(0.25));
	}

}
