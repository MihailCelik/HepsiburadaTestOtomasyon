package PageModel;

import org.openqa.selenium.By;

public class PaymentMethodModel extends BaseModel {

    public static By tdPaymentMethod = By.xpath("/html/body/div/div/div/div[1]/div/div/div/div/div/div/div/div[1]/div[1]/h2");
    public static By radDebitCreditCard = By.xpath("/html/body/div/div/div/div[1]/div/div/div/div/div/div/div/div[1]/div[1]/div/div[1]/div/div[1]/div[1]/label/input");
    public static By txtCarNumber = By.xpath("/html/body/div/div/div/div[1]/div/div/div/div/div/div/div/div[1]/div[1]/div/div[1]/div/div[2]/div/div[1]/form/div[1]/div[1]/div/div/div/input");
    public static By txtHolderName = By.xpath("/html/body/div/div/div/div[1]/div/div/div/div/div/div/div/div[1]/div[1]/div/div[1]/div/div[2]/div/div[1]/form/div[1]/div[2]/div/div/div/input");
    public static By txtExpireDate = By.xpath("/html/body/div/div/div/div[1]/div/div/div/div/div/div/div/div[1]/div[1]/div/div[1]/div/div[2]/div/div[1]/form/div[1]/div[3]/div/div[1]/div/input");
    public static By txtPlaceHolder = By.xpath("/html/body/div/div/div/div[1]/div/div/div/div/div/div/div/div[1]/div[1]/div/div[1]/div/div[2]/div/div[1]/form/div[1]/div[3]/div/div[2]/div/input");
    public static By btnContinues = By.xpath("//*[@class='hb-AxirP kDeRtS s1yof4nre7x sardesPaymentPage-SidebarContent-button_next_step']");

    public String chekIfPaymentMethod() {
        return getText(tdPaymentMethod);
    }

    public void clickDebitCreditCard() {
        clickElement(radDebitCreditCard);
    }

    public void setTextCarNumber(String carNumber) {
        sendKeys(txtCarNumber,carNumber);
    }

    public void setTextHolderName(String holderName) {
        sendKeys(txtHolderName,holderName);
    }

    public void setTextExpireDate(String expireDate) {
        sendKeys(txtExpireDate,expireDate);
    }

    public void setTextPlaceHolder(String placeHolder) {
        sendKeys(txtPlaceHolder,placeHolder);
    }

    public void clickContinue() {
        clickElement(btnContinues);
    }
}
