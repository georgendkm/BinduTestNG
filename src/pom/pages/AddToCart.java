package pom.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCart {
	
	@FindBy(xpath="//button[text()='Go to checkout']") WebElement checkoutButton;
	@FindBy(xpath="//button[@id='signin-btn']") WebElement singInButton;
	@FindBy(xpath="//button[@id='gxo-btn']") WebElement guestButton;
	@FindBy(xpath="//div[@data-test-id='cart-bucket']")  List<WebElement> itemsInCart;
	@FindBy(xpath="//button[@data-test-id='cart-to-sfl']") List<WebElement> saveItLater;
	@FindBy(xpath="//a[text()='Remove']") List<WebElement> removeButton;
	
	public boolean checkoutButton() {
		return checkoutButton.isDisplayed();
		
	}
	public String verifyCartItems() {
		int rsize = itemsInCart.size();
		if(rsize > 0) {
			System.out.println("items added in cart");
		} else {
			System.out.println("added items not displayed");
			//return "Results not displayed";
		}
		return "";	
	}

}
