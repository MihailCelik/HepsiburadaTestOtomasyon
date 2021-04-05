package PageModel;

import org.openqa.selenium.By;
import  java.security.SecureRandom;

public class SignInModel extends BaseModel {

    public static By tdRegister = By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div/div/div[2]/div[1]/div[2]/div");
    public static By txtName = By.id("txtName");
    public static By txtSurname = By.id("txtSurname");
    public static By txtEmail = By.id("txtEmail");
    public static By txtPassword = By.id("txtNewPassEmail");
    public static By btnSignUpSubmit = By.id("btnSignUpSubmit");

    public String email;
    public String randomValue;
    public static final String values = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    public static SecureRandom random = new SecureRandom();
    String RandomValueProvider(int emailCount){
        StringBuilder randomValueMaker = new StringBuilder(emailCount);
        for(int i=0;i<emailCount;i++){
            randomValueMaker.append(values.charAt(random.nextInt(values.length())));
        }
        return randomValueMaker.toString();
    }

    public boolean chekIfRegisterPage() {
        clickElement(tdRegister);
        return displayed(tdRegister);
    }

    public void setTextName(String name){
        sendKeys(txtName,name);
    }

    public void setTextSurname(String surname){
        sendKeys(txtSurname,surname);
    }

    public void setTextEmail(){
        randomValue = RandomValueProvider(10);
        email = randomValue + "" + "@gmail.com";
        sendKeys(txtEmail,email); }

    public void setTexPassword(String password){
        sendKeys(txtPassword,password);
    }

    public void clickSignUpSubmit(){
        clickElement(btnSignUpSubmit);
    }
}
