package pom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOut {
	@FindBy(xpath="//button[text()='Go to checkout']") WebElement checkoutButton;
	@FindBy(xpath="//button[@id='signin-btn']") WebElement singInButton;
	@FindBy(xpath="//button[@id='gxo-btn']") WebElement guestButton;
	@FindBy(xpath="//tr[@data-test-id='SUB_TOTAL']") WebElement subTotal;
	@FindBy(xpath="//tr[@data-test-id='SHIPPING']") WebElement shipping;
	@FindBy(xpath="//tr[@data-test-id='TOTAL']") WebElement totalAmount;

}
