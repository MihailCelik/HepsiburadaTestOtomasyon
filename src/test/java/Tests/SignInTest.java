package Tests;

import PageModel.SignInModel;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;

public class SignInTest {

    SignInModel signInModel = new SignInModel();

    @Step("Üye ol ekranının açıldığı görülür")
    public void chekIfRegisterPage(){
        Assert.assertTrue(signInModel.chekIfRegisterPage());
    }

    @Step("Adı alanına <key> yazılır")
    public void setTextName(String name){
        signInModel.setTextName(name);
    }

    @Step("Soyadı alanına <key> yazılır")
    public void setTextSurname(String surname){
        signInModel.setTextSurname(surname);
    }

    @Step("E-posta adresi alanına rastgele bir e-posta yazılır")
    public void setTextEmail(){
        signInModel.setTextEmail();
    }

    @Step("Şifre alanına <key> yazılır")
    public void setTexPassword(String password){
        signInModel.setTexPassword(password);
    }

    @Step("Üye ol butonuna tıklanılır")
    public void clickSignUpSubmit(){
        signInModel.clickSignUpSubmit();
    }
}
