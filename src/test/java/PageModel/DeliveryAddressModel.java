package PageModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import javax.swing.*;
import java.util.List;

public class DeliveryAddressModel extends BaseModel {

    public static By tdDeliveryAddress = By.xpath("/html/body/div/div/div/div[1]/div/div[1]/div[1]/div[1]/h2");
    public static By addressLink = By.xpath("//*[@class='new_address_link_1fEiD has_no_address_1uAWQ']");
    public static By tdAddressAdd = By.xpath("/html/body/div/div/div/div[1]/div/div[1]/div[2]/div/div[2]/div/h1");
    public static By txtFirstName = By.xpath("/html/body/div/div/div/div[1]/div/div[1]/div[2]/div/div[2]/div/form/fieldset[1]/div/div[1]/div/div[1]/div/input");
    public static By txtLastName = By.xpath("/html/body/div/div/div/div[1]/div/div[1]/div[2]/div/div[2]/div/form/fieldset[1]/div/div[1]/div/div[2]/div/input");
    public static By txtMobilePhones = By.xpath("/html/body/div/div/div/div[1]/div/div[1]/div[2]/div/div[2]/div/form/fieldset[1]/div/div[2]/div/div/div/div/div/input");
    public static By cboCity = By.xpath("/html/body/div/div/div/div[1]/div/div[1]/div[2]/div/div[2]/div/form/fieldset[2]/div/div[1]/div/div[1]/div/input");
    public static By txtAddress = By.className("css-1tci6j0");
    public static By cboTown = By.xpath("/html/body/div/div/div/div[1]/div/div[1]/div[2]/div/div[2]/div/form/fieldset[2]/div/div[1]/div/div[2]/div/input");
    public static By cboNeighborhood = By.xpath("/html/body/div/div/div/div[1]/div/div[1]/div[2]/div/div[2]/div/form/fieldset[2]/div/div[1]/div/div[3]/div/input");
    public static By txtOpenAddress = By.xpath("/html/body/div/div/div/div[1]/div/div[1]/div[2]/div/div[2]/div/form/fieldset[2]/div/div[2]/div/div[1]/div/textarea");
    public static By txtAddressName = By.xpath("/html/body/div/div/div/div[1]/div/div[1]/div[2]/div/div[2]/div/form/fieldset[2]/div/div[2]/div/div[2]/div/input");
    public static By btnSaveAddress = By.xpath("//*[@class='button_QwrsX min_padding_12wCn']");
    public static By attachedAddress = By.xpath("/html/body/div/div/div/div[1]/div/div[1]/div[1]/div[1]/div/div[1]/div/div[2]/div/div/h3");
    public static By btnContinue = By.id("continue_step_btn");

    JComboBox j ;
    public List<WebElement> address;

    public String chekIfDeliveryAddress() {
        return getText(tdDeliveryAddress);
    }

    public void clickAddressLink() { clickElement(addressLink); }

    public String chekIfAddressAdd() {
        return getText(tdAddressAdd);
    }

    public void setTextFirstName(String firstName){
        sendKeys(txtFirstName,firstName);
    }

    public void setTextLastName(String lastName){
        sendKeys(txtLastName,lastName);
    }

    public void setTextMobilePhones(String mobilePhones){
        sendKeys(txtMobilePhones,mobilePhones);
    }

    public void SelectedCity(String city){
        clickElement(cboCity);
        address = findElements(txtAddress);
        for (int i=0;i<address.size();i++){
           if (address.get(i).getText().equals(city))
           {
              j.setSelectedIndex(i);
           }
       }
    }

    public void SelectedTown(String town){
        clickElement(cboTown);
        address = findElements(txtAddress);
        for (int i=0;i<address.size();i++){
            if (address.get(i).getText().equals(town))
            {
                j.setSelectedIndex(i);
            }
        }
    }

    public void SelectedNeighborhood(String neighborhood){
        clickElement(cboNeighborhood);
        address = findElements(txtAddress);
        for (int i=0;i<address.size();i++){
            if (address.get(i).getText().equals(neighborhood))
            {
                j.setSelectedIndex(i);
            }
        }
    }

    public void setTextOpenAddress(String address){
        sendKeys(txtOpenAddress,address);
    }

    public void setTextAddressName(String addressName){
        sendKeys(txtAddressName,addressName);
    }

    public void clickSaveAddress(){
        clickElement(btnSaveAddress);
    }

    public String chekIfAttachedAddress() {
        return getText(attachedAddress);
    }

    public void clickContinue(){
        clickElement(btnContinue);
    }
}
