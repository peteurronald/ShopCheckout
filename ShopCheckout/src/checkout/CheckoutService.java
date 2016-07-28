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
	 * Gets the total cost buy one get one free.
	 *
	 * @param cart the cart
	 * @param itemId the item id
	 * @return the total cost buy one get one free
	 */
	public BigDecimal getTotalCostBuyOneGetOneFree(Cart cart, String itemId);
	


	
	/**
	 * Gets the total cost three for two.
	 *
	 * @param cart the cart
	 * @param itemId the item id
	 * @return the total cost three for two
	 */
	public BigDecimal getTotalCostThreeForTwo(Cart cart, String itemId);
	
}
