package tests.proje;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HomePage {
    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //************************ hotelmycamp page Main Page Xpaths **********************************

    // mainPage HOTELMYCAMP  word       US01
    @FindBy(xpath = "//a[@class='navbar-brand']")
    public WebElement mainPageHotelMyCampPageWord;

    // mainPage>>Home button       US01
    @FindBy(xpath = "//li[@id='navHome']")
    public WebElement mainPageHomeButton;


    // mainPage>>Rooms button     US01
    @FindBy(xpath = "//li[@id='navRooms']")
    public WebElement mainPageRoomsButton;

    // mainPage>>Restaurant button     US01
    @FindBy(xpath = "//li[@id=' navRestaurant']")
    public WebElement mainPageRestaurantButton;

    // mainPage>>About button     US01
    @FindBy(xpath = "//li[@id=' navAbout']")
    public WebElement mainPageAboutButton;

    // mainPage>>Blog button     US01
    @FindBy(xpath = "//li[@id='navBlog']")
    public WebElement mainPageBlogButton;


    // mainPage>>Contact button
    @FindBy(xpath = "//li[@id='navContact']")
    public WebElement mainPageContactButton;


    // mainPage log in click button
    @FindBy(xpath = "//a[@href='/Account/Logon']")
    public WebElement mainPageLoginButton;
    // mainPage Wel come to hotelmycamp
    @FindBy(xpath = "(//h1[@class='mb-3'])[3]")
    public WebElement mainPageWelComeToWord;

    // mainPage Enjoy A Luxury Experience
    @FindBy(xpath = "(//h1[@class='mb-3'])[2]")
    public WebElement mainPageEnjoyALuxuryExperienceToWord;

    // mainPage CEHCK IN DATE word
    @FindBy(xpath = "(//div[@class='wrap'])[1]")
    public WebElement mainPageCEHCKINDATEWord;


    // mainPage CEHCK OUT DATE word
    @FindBy(xpath = "(//div[@class='wrap'])[2]")
    public WebElement mainPageCEHCKOUTDATEWord;

    // mainPage ROOM TYPE word
    @FindBy(xpath = "(//div[@class='wrap'])[3]")
    public WebElement mainPageROOMTYPEWord;

    // mainPage CUSTOMER word
    @FindBy(xpath = "(//div[@class='wrap'])[4]")
    public WebElement mainPageCUSTOMERWord;

    // mainPage Check Availability
    @FindBy(xpath = "//input[@type='submit']")
    public WebElement mainPageCheckAvailabilityWord;



    //mainPage InformationTextVisibility
    @FindBy(xpath = "(//h2[@class='mb-4'])[1]")
    public WebElement mainPageInformationTextVisibility;

    //mainPage under the information text facebook image
    @FindBy(xpath = "(//span[@class='icon-facebook'])[1]")
    public WebElement mainPageFacebookImageVisibility;

    //mainPage under the information text google image
    @FindBy(xpath = "(//span[@class='icon-google-plus'])[1]")
    public WebElement mainPageGoogleImageVisibility;

    //mainPage under the information text Instegram image
    @FindBy(xpath = "(//span[@class='icon-instagram'])[1]")
    public WebElement mainPageInstegramImageVisibility;

    //mainPage 25/7 Front Desk word
    @FindBy(xpath = "(//div[@class='media block-6 services py-4 d-block text-center'])[1]")
    public WebElement mainPageFrontDeskImageAndHeaderVisibility;



    //********************** Some Usefull Methods *****************************
    // Thread.sleep methods (sayfa gecislerinde beklemele ihtiyaci oldugunda kullanilanilir method)
    public void wait(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }//exception firlatmamasi icin try catch blogunun icine alindi

    public void allPagesScreenShot() {
        TakesScreenshot screenshot = (TakesScreenshot) Driver.getDriver();
        String date = new SimpleDateFormat("yyMMddhhmmss").format(new Date());
        File allPagesScreen = new File("target/screenshot/allPage" + date + ".jpeg");
    }


}
