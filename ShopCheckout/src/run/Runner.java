/**
 * Shop Checkout System. 
 */
package run;

import item.AppleImpl;
import item.OrangeImpl;

import java.util.Scanner;

import checkout.Cart;
import checkout.CartImpl;
import checkout.CheckoutService;
import checkout.CheckoutServiceImpl;

/**
 * The Class Runner.
 */
class Runner {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String [] args){
		new Runner().menu();
	}
	
    /**
     * Menu.
     */
    public void menu() {
        Scanner scanner = new Scanner(System.in);
        int index;
        Cart cart = new CartImpl();
        CheckoutService checkoutService = new CheckoutServiceImpl();
        
        while (true) {
            System.out.println("\nCart Options\n");
            System.out.println("(1) - add an apple");
            System.out.println("(2) - add an orange");
            System.out.println("(3) - finish");

            System.out.print("Please enter your selection:\t");
            int selection = scanner.nextInt();

            if (selection == 1) {
                System.out.print("An apple has been added to your cart:\t");
                cart.put(new AppleImpl());
                index = scanner.nextInt();

            }
            else if (selection == 2) {
            	System.out.print("An orange has been added to your cart:\t");
            	cart.put(new OrangeImpl());
                index = scanner.nextInt();
            }
            else if (selection == 3) {
                break;
            }
        }
        System.out.print("Total cost of your items=" + checkoutService.getTotalCost(cart) + ":\t");
        
    }
}
