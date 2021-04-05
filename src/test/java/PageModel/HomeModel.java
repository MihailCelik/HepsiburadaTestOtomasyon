package PageModel;

import org.openqa.selenium.By;

public class HomeModel extends BaseModel {

    public static By tdOldHeader = By.className("sf-OldHeader-1NFKi");
    public static By btnAccount = By.id("myAccount");
    public static By btnRegister = By.id("register");

    public void userVisitSite(String url){
        webDriver.get(url);
    }

    public boolean chekIfOpenPage() {
        return displayed(tdOldHeader);
    }

    public void clickAccount(){
        clickElement(btnAccount);
    }

    public void clickRegister(){
        clickElement(btnRegister);
    }
}
