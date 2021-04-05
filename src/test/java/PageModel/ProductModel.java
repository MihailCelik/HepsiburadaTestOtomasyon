package PageModel;

import org.openqa.selenium.By;

public class ProductModel extends BaseModel {
    public static By tdMyAccount = By.xpath("//*[@class='sf-OldMyAccount-1k66b']");
    public static By searchBoxOld = By.xpath("/html/body/div[1]/div/div/div[3]/div/div/div/div/div/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[2]/input");
    public static By btnSearch = By.xpath("/html/body/div[1]/div/div/div[3]/div/div/div/div/div/div[2]/div[2]/div/div/div/div/div/div/div[2]");
    public static By productsList = By.xpath("/html/body/div[3]/main/div[2]/div/div/div/div/div[2]/section/div[1]/div[4]/div/div/div/div/ul/li[1]/div/a/div[2]");
    public static By productDetail = By.xpath("//*[@class='product-detail-module']");

    public String chekIfCreateAccount() {
        return getText(tdMyAccount);
    }

    public void clickSearchBoxOld(){
        clickElement(searchBoxOld);
    }

    public void setTexProductName(String productName){
        sendKeys(searchBoxOld,productName);
    }

    public void clickSearch(){
        clickElement(btnSearch);
    }

    public void selectRandomProduct(){
        clickElement(productsList);
    }

    public boolean chekIfProductDetail() {
        return displayed(productDetail);
    }
}
