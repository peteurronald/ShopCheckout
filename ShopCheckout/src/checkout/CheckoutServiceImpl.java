/**
 * Shop Checkout System. 
 */
package checkout;

import item.AbstractItem;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

import offer.BuyOneGetOneFreeOfferImpl;
import offer.Offer;
import offer.ThreeForTwoOfferImpl;

/**
 * Implements a checkout service.
 * 
 * @author Peter
 *
 */
public class CheckoutServiceImpl implements CheckoutService{

	private Offer offer;
	
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
	public BigDecimal getTotalCostBuyOneGetOneFree(Cart cart, String itemId) {
		offer = new BuyOneGetOneFreeOfferImpl();
		Cart offerCart = offer.execute(cart, itemId);
		BigDecimal totalCost = getTotalCost(offerCart);
		return totalCost;
	}
	
	@Override
	public BigDecimal getTotalCostThreeForTwo(Cart cart, String itemId) {
		offer = new ThreeForTwoOfferImpl();
		Cart offerCart = offer.execute(cart, itemId);
		BigDecimal totalCost = getTotalCost(offerCart);
		return totalCost;
	}
	
	
	
	
}
