package Tests;

import PageModel.ProductModel;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;

public class ProductTest {
    ProductModel productModel = new ProductModel();

    @Step("Hesabımın açıldığı görülür")
    public void chekIfCreateAccount(){
        Assert.assertEquals("Odeme yontemleri sayfasi acilmadi", "Test Otomasyon",productModel.chekIfCreateAccount());
    }

    @Step("Ürün, kategori veya marka ara çubuğuna tıklanılır")
    public void clickSearchBoxOld(){
        productModel.clickSearchBoxOld();
    }

    @Step("<key> yazılır")
    public void setTexProductName(String productName){
        productModel.setTexProductName(productName);
    }

    @Step("Ara butonuna tıklanılır")
    public void clickSearch(){
        productModel.clickSearch();
    }

    @Step("Listelenen ürünler arasından rastgele ürün seçilir")
    public void selectRandomProduct(){
        productModel.selectRandomProduct();
    }

    @Step("Seçilen ürün detayları sayfasının geldiği görülür")
    public void chekIfProductDetail(){
        productModel.chekIfProductDetail();
    }
}
