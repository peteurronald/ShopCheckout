/**
 * Shop Checkout System. 
 */
package checkout;

import item.AbstractItem;

import java.util.List;

/**
 * Represents a shopping cart.
 * 
 * @author Peter
 *
 */
public interface Cart {
	
	/**
	 * Put.
	 *
	 * @param item the item
	 */
	public void put(AbstractItem item);
	
	/**
	 * Gets the items.
	 *
	 * @return the items
	 */
	public List<AbstractItem> getItems();
	
	/**
	 * Count items like.
	 *
	 * @param name the name
	 * @return the int
	 */
	public int countItemsLike(String name);
}
