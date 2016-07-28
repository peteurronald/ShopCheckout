/**
 * Shop Checkout System. 
 */
package offer;

import checkout.Cart;

/**
 * The Interface Offer.
 */
public interface Offer {

	/**
	 * Execute.
	 *
	 * @param cart the cart
	 * @param itemId the item id
	 * @return the cart
	 */
	public Cart execute(Cart cart, String itemId);
}
