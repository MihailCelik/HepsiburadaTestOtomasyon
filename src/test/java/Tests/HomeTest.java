package Tests;

import PageModel.HomeModel;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;

public class HomeTest {

    HomeModel homeModel = new HomeModel();

    @Step("<key> sayfası açılır")
    public void userVisitSite(String key){
        homeModel.userVisitSite(key);
    }

    @Step("Hepsiburada sayfasının açıldığı görülür")
    public void chekIfOpenPage(){
        Assert.assertTrue(homeModel.chekIfOpenPage());
    }

    @Step("Giriş Yap veya üye ol butonuna tıklanılır")
    public void clickAccount(){
        homeModel.clickAccount();
    }

    @Step("Üye ol yazısına tıklanılır")
    public void clickRegister(){
        homeModel.clickRegister();
    }
}
