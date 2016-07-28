/**
 * Shop Checkout System. 
 */
package offer;

import item.AbstractItem;

import java.util.List;

import checkout.Cart;
import checkout.CartImpl;


/**
 * Applies the buy one get one free offer strategy to a cart.
 * 
 * @author Peter
 *
 */
public class BuyOneGetOneFreeOfferImpl implements Offer{

	
	/* (non-Javadoc)
	 * @see offer.Offer#execute(checkout.Cart, java.lang.String)
	 */
	@Override
	public Cart execute(Cart cart, String itemId) {
		List<AbstractItem> items = cart.getItems();
		Cart newCart = new CartImpl();
		int count = 0;
		
		for (AbstractItem item : items) {
			
			boolean isEvenNumberItem = count%2 == 0;
			boolean isItem = item.getName().equalsIgnoreCase(itemId);
			
			if(isItem) {
				if(isEvenNumberItem) {
					newCart.put(item);
				}
				count++;
			} else {
				newCart.put(item);
			}
			
			
		}
		return newCart;
	}
	
}
