/**
 * Shop Checkout System. 
 */
package item;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * An abstract item for a shopping cart.
 * 
 * @author Peter
 *
 */
public abstract class AbstractItem {
	
	/** The name. */
	private String name = "";
	
	/** The price. */
	private BigDecimal price = new BigDecimal(BigInteger.ZERO);
	
	/**
	 * Instantiates a new abstract item.
	 *
	 * @param name the name
	 * @param price the price
	 */
	protected AbstractItem(String name, BigDecimal price) {
		super();
		this.name = name;
		this.price = price;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	protected String getName() {
		return name;
	}

	/**
	 * Gets the price.
	 *
	 * @return the price
	 */
	protected BigDecimal getPrice() {
		return price;
	}

}
