/**
 * Shop Checkout System. 
 */
package offer;

import item.AbstractItem;

import java.util.List;

import checkout.Cart;
import checkout.CartImpl;

// TODO: Auto-generated Javadoc
/**
 * Applies the three for two offer strategy to a cart.
 * 
 * @author Peter
 *
 */
public class ThreeForTwoOfferImpl implements Offer{

	/* (non-Javadoc)
	 * @see offer.Offer#execute(checkout.Cart, java.lang.String)
	 */
	@Override
	public Cart execute(Cart cart, String itemId) {
		List<AbstractItem> items = cart.getItems();
		Cart newCart = new CartImpl();
		int count = 0;
		
		for (AbstractItem item : items) {
			
			boolean isItem = item.getName().equalsIgnoreCase(itemId);
			
			if(isItem) {
				count++;
				if(count < 3) {
					newCart.put(item);
				} else {
					count = 0;
				}
			} else {
				newCart.put(item);
			}
			
			
		}
		return newCart;
	}
}
