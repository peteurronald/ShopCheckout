/**
 * Shop Checkout System. 
 */
package checkout;

import java.math.BigDecimal;

// TODO: Auto-generated Javadoc
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
	
	/**
	 * Gets the apple bogof total cost.
	 *
	 * @param cart the cart
	 * @return the apple bogof total cost
	 */
	public BigDecimal getAppleBogofTotalCost(Cart cart);
	
	
	/**
	 * Gets the bogof for apples.
	 *
	 * @param cart the cart
	 * @return the bogof for apples
	 */
	public Cart getBogofAppleCart(Cart cart);

	/**
	 * Gets the 3 for 2 orange cart.
	 *
	 * @param cart the cart
	 * @return the 3 for 2 orange cart
	 */
	public Cart get3for2OrangeCart(Cart cart);

	/**
	 * Gets the 3 for 2 orange total cost.
	 *
	 * @param cart the cart
	 * @return the 3 for 2 orange total cost
	 */
	public BigDecimal get3for2OrangeTotalCost(Cart cart);
	
}
