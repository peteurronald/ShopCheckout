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

	/** The Constant APPLE. */
	private static final String APPLE = "Apple";
	private static final String ORANGE = "Orange";

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
	
	/* (non-Javadoc)
	 * @see checkout.CheckoutService#getAppleBogofTotalCost(checkout.Cart)
	 */
	@Override
	public BigDecimal getAppleBogofTotalCost(Cart cart) {
		Cart bogofAppleCart = getBogofAppleCart(cart);
		BigDecimal totalCost = getTotalCost(bogofAppleCart);
		return totalCost;
	}
	
	
	/* (non-Javadoc)
	 * @see checkout.CheckoutService#getBogofForApples(checkout.Cart)
	 */
	@Override
	public Cart getBogofAppleCart(Cart cart) {
		
		List<AbstractItem> items = cart.getItems();
		Cart newCart = new CartImpl();
		int countApples = 0;
		
		for (AbstractItem item : items) {
			
			boolean isEvenNumberApples = countApples%2 == 0;
			boolean isApple = item.getName().equalsIgnoreCase(APPLE);
			
			if(isApple) {
				if(isEvenNumberApples) {
					newCart.put(item);
				}
				countApples++;
			} else {
				newCart.put(item);
			}
			
			
		}
		return newCart;
	}

	/* (non-Javadoc)
	 * @see checkout.CheckoutService#get3for2OrangeCart(checkout.Cart)
	 */
	@Override
	public Cart get3for2OrangeCart(Cart cart) {
		List<AbstractItem> items = cart.getItems();
		Cart newCart = new CartImpl();
		int countOrange = 0;
		
		for (AbstractItem item : items) {
			
			boolean isOrange = item.getName().equalsIgnoreCase(ORANGE);
			
			if(isOrange) {
				countOrange++;
				if(countOrange < 3) {
					newCart.put(item);
				} else {
					countOrange = 0;
				}
			} else {
				newCart.put(item);
			}
			
			
		}
		return newCart;
	}

	/* (non-Javadoc)
	 * @see checkout.CheckoutService#get3for2OrangeTotalCost(checkout.Cart)
	 */
	@Override
	public BigDecimal get3for2OrangeTotalCost(Cart cart) {
		Cart orange3for2Cart = get3for2OrangeCart(cart);
		BigDecimal totalCost = getTotalCost(orange3for2Cart);
		return totalCost;
	}

	
	
}
