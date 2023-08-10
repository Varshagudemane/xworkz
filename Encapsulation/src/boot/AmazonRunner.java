package boot;

import app.Amazon;

public class AmazonRunner {
	public static void main(String[] args) {
		Amazon myAmazonAccount = new Amazon();

		myAmazonAccount.setAccountName("varsha");
		myAmazonAccount.setEmail("varsha@gmail.com");
		myAmazonAccount.setShippingAddress("123 Main, Bangalore");
		myAmazonAccount.setPaymentMethod("Credit Card");
		myAmazonAccount.setOrderHistory("Order 1, Order 2");
		myAmazonAccount.setWishlist("Product A, Product B");
		myAmazonAccount.setPrimeMembership("Active");
		myAmazonAccount.setCartItemCount(5);
		myAmazonAccount.setLoyaltyPoints(100);
		myAmazonAccount.setGiftCardBalance(50);
		myAmazonAccount.setAccountBalance(1000.50);
		myAmazonAccount.setVerified(true);
		myAmazonAccount.setSubscribed(true);
		myAmazonAccount.setLastLogin("2023-08-10 15:30");

		System.out.println("Account Name: " + myAmazonAccount.getAccountName());
		System.out.println("Email: " + myAmazonAccount.getEmail());
		System.out.println("Shipping Address: " + myAmazonAccount.getShippingAddress());
		System.out.println("Payment Method: " + myAmazonAccount.getPaymentMethod());
		System.out.println("Order History: " + myAmazonAccount.getOrderHistory());
		System.out.println("Wishlist: " + myAmazonAccount.getWishlist());
		System.out.println("Prime Membership: " + myAmazonAccount.getPrimeMembership());
		System.out.println("Cart Item Count: " + myAmazonAccount.getCartItemCount());
		System.out.println("Loyalty Points: " + myAmazonAccount.getLoyaltyPoints());
		System.out.println("Gift Card Balance: " + myAmazonAccount.getGiftCardBalance());
		System.out.println("Account Balance: " + myAmazonAccount.getAccountBalance());
		System.out.println("Verified: " + myAmazonAccount.isVerified());
		System.out.println("Subscribed: " + myAmazonAccount.isSubscribed());
		System.out.println("Last Login: " + myAmazonAccount.getLastLogin());
	}

}
 

	


	
 

	
 
	
 
	

 
