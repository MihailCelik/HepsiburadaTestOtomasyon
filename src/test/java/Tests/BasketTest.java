package Tests;

import PageModel.BasketModel;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;

public class BasketTest {

    BasketModel basketModel = new BasketModel();

    @Step("Sepete ekle butonuna tıklanılır")
    public void clickAddToCart(){
        basketModel.clickAddToCart();
    }

    @Step("<key> mesajı görülür")
    public void chekIfProductCart(String key){
        Assert.assertEquals("Ürün sepete eklenemedi",key, basketModel.chekIfProductCart());
    }

    @Step("Sepete git butonuna tıklanılır")
    public void clickGoToCart(){
        basketModel.clickGoToCart();
    }

    @Step("Sepet sayfasının açıldığı görülür")
    public void chekIfBasketHeader(){
        Assert.assertEquals("Sepetim sayfasi acilmadi", "Sepetim", basketModel.chekIfBasketHeader());
    }

    @Step("Sepet te <key> mesajı görülür")
    public void chekIfBasketItemCount(String key){
        Assert.assertEquals("Sepet bos veya birden fazla urun icermektedir", key, basketModel.chekIfBasketItemCount());
    }

    @Step("Ödenecek tutarın doğru olduğu kontrol edilir")
    public void chekIfProductPrice(){
        Assert.assertEquals("Odeme tutarlari uyusmamaktadir",basketModel.productPrices,basketModel.chekIfProductPrice());
    }

    @Step("Alışverişi tamamla butonuna tıklanılır")
    public void clickCompleteTheExchange(){
        basketModel.clickCompleteTheExchange();
    }
}
