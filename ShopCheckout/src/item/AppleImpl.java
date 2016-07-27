/**
 * Shop Checkout System. 
 */
package item;

import java.math.BigDecimal;

/**
 * Implements an Apple item.
 * 
 * @author Peter
 *
 */
public class AppleImpl extends AbstractItem {
	
	/**
	 * Instantiates a new apple impl.
	 */
	public AppleImpl() {
		super("Apple", new BigDecimal(0.60));
	}

}
