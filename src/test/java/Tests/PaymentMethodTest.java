package Tests;

import PageModel.PaymentMethodModel;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;

public class PaymentMethodTest {

    PaymentMethodModel paymentMethodModel = new PaymentMethodModel();

    @Step("Ödeme sayfasının açıldığı görülür")
    public void chekIfPaymentMethod(){
        Assert.assertEquals("Odeme yontemleri sayfasi acilmadi", "Ödeme yöntemleri", paymentMethodModel.chekIfPaymentMethod());
    }

    @Step("Banka / Kredi Kartı alanına tıklanılır")
    public void clickDebitCreditCard(){
        paymentMethodModel.clickDebitCreditCard();
    }

    @Step("Kart numarası alanına <key> yazılır")
    public void setTextCarNumber(String carNumber){
        paymentMethodModel.setTextCarNumber(carNumber);
    }

    @Step("Kart üzerindeki isim alanına <key> yazılır")
    public void setTextHolderName(String holderName){
        paymentMethodModel.setTextHolderName(holderName);
    }

    @Step("Son kullama tarihi alanına <key> yazılır")
    public void setTextExpireDate(String expireDate){
        paymentMethodModel.setTextExpireDate(expireDate);
    }

    @Step("Güvenlik kodu alanına <key> yazılır")
    public void setTextPlaceHolder(String placeHolder){
        paymentMethodModel.setTextPlaceHolder(placeHolder);
    }

    @Step("Ödeme yöntemleri sayfasındaki Devam et butonuna tıklanılır")
    public void clickContinue(){
        paymentMethodModel.clickContinue();
    }
}
