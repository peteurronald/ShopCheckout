/**
 * Shop Checkout System. 
 */
package checkout;

import java.math.BigDecimal;

/**
 * Represents a checkout service.
 * 
 * @author Peter
 *
 */
public interface CheckoutService {
	
	/**
	 * Total cost.
	 *
	 * @param cart the cart
	 * @return the big decimal
	 */
	public BigDecimal getTotalCost(Cart cart);
	
}
