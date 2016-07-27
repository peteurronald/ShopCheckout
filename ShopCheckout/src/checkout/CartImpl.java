/**
 * Shop Checkout System. 
 */
package checkout;

import item.AbstractItem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * Implements a shopping cart.
 * 
 * @author Peter
 *
 */
public class CartImpl implements Cart{

	/** The items. */
	private List<AbstractItem> items = new ArrayList<AbstractItem>();
	
	/* (non-Javadoc)
	 * @see checkout.Cart#put(item.AbstractItem)
	 */
	@Override
	public void put(AbstractItem item) {
		items.add(item);
	}

	/* (non-Javadoc)
	 * @see checkout.Cart#getItems()
	 */
	@Override
	public List<AbstractItem> getItems() {
		return items;
	}

}
