package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.HMCMethods;
import pages.HMCPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class HMCStepDefinition extends TestBaseRapor {

  Actions actions = new Actions(Driver.getDriver());
  HMCPage hmcPage =new HMCPage();
  HMCMethods hmcMethods = new HMCMethods();

    @Given("kullanici hmc sayfasina gider")
    public void kullanici_hmc_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));

    }
    @Given("login linkine tiklar")
    public void login_linkine_tiklar() {
       hmcPage.mainPageLoginLinki.click();
    }
    @Then("kullanici username olarak {string} girer")
    public void kullanici_username_olarak_girer(String username) {
      hmcPage.usernameTextBox.sendKeys(ConfigReader.getProperty(username));
    }
    @Then("kullanici password olarak {string} girer")
    public void kullanici_password_olarak_girer(String password) {
    hmcPage.passwordTextBox.sendKeys(ConfigReader.getProperty(password));
    }
    @Then("kullanici login butonuna tiklar")
    public void kullanici_login_butonuna_tiklar() {
      hmcPage.loginButonu.click();

    }

  @Given("the user clicks the add user button")
  public void the_user_clicks_the_add_user_button() {
    hmcPage.addUserElement.click();
  }
  @Then("the user writes {string} as a username")
  public void the_user_writes_as_a_username(String userName) {
  //  extentTest = extentReports.createTest("userNameNegativeTest", "User Name Negative Test Scenerio Has Been Created");
  //  extentTest.info("Onur Hoca Oturur Oturur Kod Yazar Icad Cikarir");
    hmcPage.addusernamebox.sendKeys(userName);

    actions.sendKeys(Keys.END).perform();
    hmcMethods.wait(2);
    hmcMethods.tumSayfaScreenshot();
    hmcPage.addusernamebox.clear();

  }
  @Then("The user clicks the save button")
  public void the_user_clicks_the_save_button() {
    hmcPage.saveclickbutton.click();
  }
  @Then("The user tests the negativeusername box")
  public void the_user_tests_the_negativeusername_box() {
    Assert.assertTrue(hmcPage.addUserUserNameIncorrect.isDisplayed());
  }




}
