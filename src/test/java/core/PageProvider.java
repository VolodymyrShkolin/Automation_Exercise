package core;

import org.openqa.selenium.WebDriver;
import pageObjects.*;

public final class PageProvider {
    WebDriver driver;

    public PageProvider(WebDriver driver){
        this.driver = driver;
    }

    private LoginPage loginPage;
    private MainPage mainPage;
    private ProductsPage productsPage;
    private CartPage cartPage;
    private CheckoutPage checkoutPage;
    private PaymentPage paymentPage;
    private OrderConfirmationPage orderConfirmationPage;
    private ProductPage productPage;


    public LoginPage loginPage(){
        if(loginPage == null){
            loginPage = new LoginPage(driver);
        }
        return loginPage;
    }

    public ProductPage productPage(){
        if(productPage == null){
            productPage = new ProductPage(driver);
        }
        return productPage;
    }

    public MainPage mainPage(){
        if(mainPage == null){
            mainPage = new MainPage(driver);
        }
        return mainPage;
    }

    public ProductsPage productsPage(){
        if(productsPage == null){
            productsPage = new ProductsPage(driver);
        }
        return productsPage;
    }

    public CartPage cartPage(){
        if(cartPage == null){
            cartPage = new CartPage(driver);
        }
        return cartPage;
    }

    public CheckoutPage checkoutPage(){
        if(checkoutPage == null){
            checkoutPage = new CheckoutPage(driver);
        }
        return checkoutPage;
    }

    public PaymentPage paymentPage(){
        if(paymentPage == null){
            paymentPage = new PaymentPage(driver);
        }
        return paymentPage;
    }

    public OrderConfirmationPage orderConfirmationPage(){
        if(orderConfirmationPage == null){
            orderConfirmationPage = new OrderConfirmationPage(driver);
        }
        return orderConfirmationPage;
    }
}
