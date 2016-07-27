/**
 * Shop Checkout System. 
 */
package checkout;

import item.AbstractItem;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Iterator;
import java.util.List;

/**
 * Implements a checkout service.
 * 
 * @author Peter
 *
 */
public class CheckoutServiceImpl implements CheckoutService{

	/* (non-Javadoc)
	 * @see checkout.CheckoutService#totalCost(checkout.Cart)
	 */
	@Override
	public BigDecimal getTotalCost(Cart cart) {
		BigDecimal totalCost = BigDecimal.ZERO;
		
		List<AbstractItem> items = cart.getItems();
		for (AbstractItem item : items) {
			totalCost = totalCost.add(item.getPrice());
		}
		totalCost = totalCost.setScale(2, RoundingMode.CEILING);
		return totalCost;
	}

}
