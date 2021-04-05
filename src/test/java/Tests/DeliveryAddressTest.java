package Tests;

import PageModel.DeliveryAddressModel;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;

public class DeliveryAddressTest {

    DeliveryAddressModel deliveryAddressModel = new DeliveryAddressModel();

    @Step("Teslimat adresi sayfasının açıldığı görülür")
    public void chekIfDeliveryAddress(){
        Assert.assertEquals("Teslimat adresi sayfasi acilmadi", "Teslimat adresi", deliveryAddressModel.chekIfDeliveryAddress());
    }

    @Step("Yeni adres ekle alanına tıklanılır")
    public void clickAddressLink(){
        deliveryAddressModel.clickAddressLink();
    }

    @Step("Adres ekle alanının açıldığı görülür")
    public void chekIfAddressAdd(){
        Assert.assertEquals("Teslimat adresi sayfasi acilmadi", "Adres ekle", deliveryAddressModel.chekIfAddressAdd());
    }

    @Step("Ad alanına <key> yazılır")
    public void setTextFirstName(String firstName){
        deliveryAddressModel.setTextFirstName(firstName);
    }

    @Step("Soyad alanına <key> yazılır")
    public void setTextLastName(String lastName){
        deliveryAddressModel.setTextLastName(lastName);
    }

    @Step("Telefon alanına <key> yazılır")
    public void setTextMobilePhones(String mobilePhones){
        deliveryAddressModel.setTextMobilePhones(mobilePhones);
    }

    @Step("Şehir alanından <key> seçilir")
    public void SelectedCity(String city){
        deliveryAddressModel.SelectedCity(city);
    }

    @Step("İlçe alanından <key> seçilir")
    public void SelectedTown(String town){
        deliveryAddressModel.SelectedTown(town);
    }

    @Step("Mahalle alanından <key> seçilir")
    public void SelectedNeighborhood(String neighborhood){
        deliveryAddressModel.SelectedNeighborhood(neighborhood);
    }

    @Step("Adres alanına <key> yazılır")
    public void setTextOpenAddress(String address){
        deliveryAddressModel.setTextOpenAddress(address);
    }

    @Step("Bu adrese bir ad verin alanına <key> yazılır")
    public void setTextAddressName(String addressName){
        deliveryAddressModel.setTextAddressName(addressName);
    }

    @Step("Adresi kaydet butonuna tıklanılır")
    public void clickSaveAddress(){
        deliveryAddressModel.clickSaveAddress();
    }

    @Step("Teslimat adresi alanına adresimin kaydedildiği görülür")
    public void chekIfAttachedAddress(){
        Assert.assertEquals("Teslimat adresi sayfasi acilmadi", "Evim", deliveryAddressModel.chekIfAttachedAddress());
    }

    @Step("Devam et butonuna tıklanılır")
    public void clickContinue(){
        deliveryAddressModel.clickContinue();
    }
}
