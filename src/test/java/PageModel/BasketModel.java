package PageModel;

import org.openqa.selenium.By;

public class BasketModel extends BaseModel {
    public static By btnAddToCart = By.id("addToCart");
    public static By tdSalesFrontCash = By.xpath("/html/body/div[5]/div/div/div/div/div/div/div/div/div[1]/div[1]/div/span");
    public static By btnGoToChart = By.xpath("/html/body/div[5]/div/div/div/div/div/div/div/div/div[1]/div[2]/button[1]");
    public static By currentPrice = By.id("offering-price");
    public static By tdBasketHeader = By.xpath("//*[@class='basket_headerTop_15H0U']");
    public static By tdBasketItemCount = By.xpath("//*[@class='basket_itemCount_54lDX']");
    public static By productPrice = By.xpath("/html/body/div/div/div/div[2]/div/div[2]/section/section/ul/li/div/div/div[2]/div[4]/div[1]/div/div");
    public static By btnCompleteTheExchange = By.id("continue_step_btn");

    public String productPrices;
    public void clickAddToCart(){
        productPrices = getText(currentPrice);
        clickElement(btnAddToCart);
    }

    public String chekIfProductCart(){
        return getText(tdSalesFrontCash);
    }

    public void clickGoToCart(){
        clickElement(btnGoToChart);
    }

    public String chekIfBasketHeader() {
        return getText(tdBasketHeader);
    }

    public String chekIfBasketItemCount() {
        return getText(tdBasketItemCount);
    }

    public String chekIfProductPrice() {
        return getText(productPrice);
    }

    public void clickCompleteTheExchange(){
        clickElement(btnCompleteTheExchange);
    }
}
