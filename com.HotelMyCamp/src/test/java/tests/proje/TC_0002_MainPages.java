package tests.proje;

import org.apache.hc.core5.reactor.Command;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class TC_0002_MainPages extends TestBaseRapor {

    HomePage homePage = new HomePage();

    SoftAssert softAssert = new SoftAssert();
    Actions actions = new Actions(Driver.getDriver());
    ReusableMethods reusableMethods = new ReusableMethods();

    @BeforeClass
    public void beforeMethodLoginHotel() {
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
    }

    @Test(priority = 1)
    public void mainPageHMCPwordVisibilityTest() {
        extentTest = extentReports.createTest("mainPageHMCPwordTest", "US_0001>>TC_0002" );
        extentTest.info("Visibility of elements on the main page");
        softAssert.assertTrue(homePage.mainPageHotelMyCampPageWord.isDisplayed());
    }

    @Test(priority = 2)
    public void mainPageHMCPHomeVisibilityTest() {
        extentTest = extentReports.createTest("mainPageHMCPHomeTest", "US_0001>>TC_0002" );
        extentTest.info("Visibility of elements on the main page");
        softAssert.assertTrue(homePage.mainPageHomeButton.isDisplayed());
    }

    @Test(priority = 3)
    public void mainPageHMCPRoomVisibilityTest() {
        extentTest = extentReports.createTest("mainPageHMCPRoomTest", "US_0001>>TC_0002" );
        extentTest.info("Visibility of elements on the main page");
        softAssert.assertTrue(homePage.mainPageRoomsButton.isDisplayed());
    }

    @Test(priority = 4)
    public void mainPageHMCPRestaurantVisibilityTest() {
        extentTest = extentReports.createTest("mainPageHMCPRestaurantTest", "US_0001>>TC_0002" );
        extentTest.info("Visibility of elements on the main page");
        softAssert.assertTrue(homePage.mainPageRestaurantButton.isDisplayed());
    }

    @Test(priority = 5)
    public void mainPageHMCPAboutestVisibilityTest() {
        extentTest = extentReports.createTest("mainPageHMCPAboutest", "US_0001>>TC_0002" );
        extentTest.info("Visibility of elements on the main page");
        softAssert.assertTrue(homePage.mainPageAboutButton.isDisplayed());
    }

    @Test(priority = 6)
    public void mainPageHMCPBlogVisibilityTest() {
        extentTest = extentReports.createTest("mainPageHMCPBlogTest", "US_0001>>TC_0002" );
        extentTest.info("Visibility of elements on the main page");
        softAssert.assertTrue(homePage.mainPageBlogButton.isDisplayed());
    }

    @Test(priority = 7)
    public void mainPageHMCPContactVisibilityTest() {
        extentTest = extentReports.createTest("mainPageHMCPContactTest", "US_0001>>TC_0002" );
        extentTest.info("Visibility of elements on the main page");
        softAssert.assertTrue(homePage.mainPageContactButton.isDisplayed());
    }

    @Test(priority = 8)
    public void mainPageHMCPLoginVisibilityTest() {
        extentTest = extentReports.createTest("mainPageHMCPLoginTest", "US_0001>>TC_0002" );
        extentTest.info("Visibility of elements on the main page");
        softAssert.assertTrue(homePage.mainPageLoginButton.isDisplayed());
    }

    @Test(priority = 9)
    public void mainPageHMCPWelComeToHMCPVisibilityTest() {
        extentTest = extentReports.createTest("mainPageHMCPWelComeToHMCPTest", "US_0001>>TC_0002" );
        extentTest.info("Visibility of elements on the main page");
        softAssert.assertTrue(homePage.mainPageWelComeToWord.isDisplayed());
    }

    @Test(priority = 10)
    public void mainPageHMCPEnjoyALuxuryExperienceToWordVisibilityTest() {
        extentTest = extentReports.createTest("mainPageHMCPEnjoyALuxuryExperienceToWordTest", "US_0001>>TC_0002" );
        extentTest.info("Visibility of elements on the main page");
        softAssert.assertTrue(homePage.mainPageEnjoyALuxuryExperienceToWord.isDisplayed());
    }

    @Test(priority = 11)
    public void mainPageCheckInDateVisibilityTest() {
        extentTest = extentReports.createTest("mainPageCheckInDateVisibilityTest", "US_0001>>TC_0002" );
        extentTest.info("Visibility of elements on the main page");
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        softAssert.assertTrue(homePage.mainPageCEHCKINDATEWord.isDisplayed());
    }
    @Test(priority = 12)
    public void mainPageHMCPCheciOutDateVisibilityTest() {
        extentTest = extentReports.createTest("mainPageHMCPCheciOutDateVisibilityTest", "US_0001>>TC_0002" );
        extentTest.info("Visibility of elements on the main page");
        softAssert.assertTrue(homePage.mainPageCEHCKOUTDATEWord.isDisplayed());
    }
    @Test(priority = 13)
    public void mainPageRoomVisibilityTest() {
        extentTest = extentReports.createTest("mainPageRoomVisibilityTest", "US_0001>>TC_0002" );
        extentTest.info("Visibility of elements on the main page");
        softAssert.assertTrue(homePage.mainPageROOMTYPEWord.isDisplayed());
    }
    @Test(priority = 14)
    public void mainPageCustomerVisibilityTest() {
        extentTest = extentReports.createTest("mainPageCustomerVisibilityTest", "US_0001>>TC_0002" );
        extentTest.info("Visibility of elements on the main page");
        softAssert.assertTrue(homePage.mainPageCUSTOMERWord.isDisplayed());
    }
    @Test(priority = 15)
    public void mainPageCheckAvailabilityVisibilityTest() {
        extentTest = extentReports.createTest("mainPageCheckAvailabilityVisibilityTest", "US_0001>>TC_0002" );
        extentTest.info("Visibility of elements on the main page");
        softAssert.assertTrue(homePage.mainPageCheckAvailabilityWord.isDisplayed());

    }

    @Test(priority = 16)
    public void mainPageInformationTextVisibilityTest() {
        extentTest = extentReports.createTest("mainPageInformationTextVisibilityTest", "US_0001>>TC_0002" );
        extentTest.info("Visibility of elements on the main page");
        softAssert.assertTrue(homePage.mainPageInformationTextVisibility.isDisplayed());
    }
    @Test(priority = 17)
    public void mainPageFacebookImgVisibilityTest() {
        extentTest = extentReports.createTest("mainPageFacebookImgVisibilityTest", "US_0001>>TC_0002" );
        extentTest.info("Visibility of elements on the main page");
        softAssert.assertTrue(homePage.mainPageFacebookImageVisibility.isDisplayed());
    }

    @Test(priority = 18)
    public void mainPageGoogleImgVisibilityTest() {
        extentTest = extentReports.createTest("mainPageGoogleImgVisibilityTest", "US_0001>>TC_0002" );
        extentTest.info("Visibility of elements on the main page");
        softAssert.assertTrue(homePage.mainPageGoogleImageVisibility.isDisplayed());
    }
    @Test(priority = 19)
    public void mainPageInstegramImgTest() {
        extentTest = extentReports.createTest("mainPageInstegramImgTest", "US_0001>>TC_0002" );
        extentTest.info("Visibility of elements on the main page");
        softAssert.assertTrue(homePage.mainPageInstegramImageVisibility.isDisplayed());
    }
    @Test(priority = 20)
    public void mainPageInformationTextVisibilityTest() {
        extentTest = extentReports.createTest("mainPageCheckAvailabilityVisibilityTest", "US_0001>>TC_0002" );
        extentTest.info("Visibility of elements on the main page");
        softAssert.assertTrue(homePage.mainPageCheckAvailabilityWord.isDisplayed());
    }
    @Test(priority = 21)
    public void mainPageInformationTextVisibilityTest() {
        extentTest = extentReports.createTest("mainPageCheckAvailabilityVisibilityTest", "US_0001>>TC_0002" );
        extentTest.info("Visibility of elements on the main page");
        softAssert.assertTrue(homePage.mainPageCheckAvailabilityWord.isDisplayed());
    }
    @Test(priority = 22)
    public void mainPageInformationTextVisibilityTest() {
        extentTest = extentReports.createTest("mainPageCheckAvailabilityVisibilityTest", "US_0001>>TC_0002" );
        extentTest.info("Visibility of elements on the main page");
        softAssert.assertTrue(homePage.mainPageCheckAvailabilityWord.isDisplayed());
    }
    @Test(priority = 23)
    public void mainPageInformationTextVisibilityTest() {
        extentTest = extentReports.createTest("mainPageCheckAvailabilityVisibilityTest", "US_0001>>TC_0002" );
        extentTest.info("Visibility of elements on the main page");
        softAssert.assertTrue(homePage.mainPageCheckAvailabilityWord.isDisplayed());
    }
    @Test(priority = 24)
    public void mainPageInformationTextVisibilityTest() {
        extentTest = extentReports.createTest("mainPageCheckAvailabilityVisibilityTest", "US_0001>>TC_0002" );
        extentTest.info("Visibility of elements on the main page");
        softAssert.assertTrue(homePage.mainPageCheckAvailabilityWord.isDisplayed());
    }
    @Test(priority = 25)
    public void mainPageInformationTextVisibilityTest() {
        extentTest = extentReports.createTest("mainPageCheckAvailabilityVisibilityTest", "US_0001>>TC_0002" );
        extentTest.info("Visibility of elements on the main page");
        softAssert.assertTrue(homePage.mainPageCheckAvailabilityWord.isDisplayed());
    }
    @Test(priority = 26)
    public void mainPageInformationTextVisibilityTest() {
        extentTest = extentReports.createTest("mainPageCheckAvailabilityVisibilityTest", "US_0001>>TC_0002" );
        extentTest.info("Visibility of elements on the main page");
        softAssert.assertTrue(homePage.mainPageCheckAvailabilityWord.isDisplayed());
    }
    @Test(priority = 27)
    public void mainPageInformationTextVisibilityTest() {
        extentTest = extentReports.createTest("mainPageCheckAvailabilityVisibilityTest", "US_0001>>TC_0002" );
        extentTest.info("Visibility of elements on the main page");
        softAssert.assertTrue(homePage.mainPageCheckAvailabilityWord.isDisplayed());
    }
    @Test(priority = 28)
    public void mainPageInformationTextVisibilityTest() {
        extentTest = extentReports.createTest("mainPageCheckAvailabilityVisibilityTest", "US_0001>>TC_0002" );
        extentTest.info("Visibility of elements on the main page");
        softAssert.assertTrue(homePage.mainPageCheckAvailabilityWord.isDisplayed());
    }
    @Test(priority = 29)
    public void mainPageInformationTextVisibilityTest() {
        extentTest = extentReports.createTest("mainPageCheckAvailabilityVisibilityTest", "US_0001>>TC_0002" );
        extentTest.info("Visibility of elements on the main page");
        softAssert.assertTrue(homePage.mainPageCheckAvailabilityWord.isDisplayed());
    }@Test(priority = 30)
    public void mainPageInformationTextVisibilityTest() {
        extentTest = extentReports.createTest("mainPageCheckAvailabilityVisibilityTest", "US_0001>>TC_0002" );
        extentTest.info("Visibility of elements on the main page");
        softAssert.assertTrue(homePage.mainPageCheckAvailabilityWord.isDisplayed());
    }
    @Test(priority = 31)
    public void mainPageInformationTextVisibilityTest() {
        extentTest = extentReports.createTest("mainPageCheckAvailabilityVisibilityTest", "US_0001>>TC_0002" );
        extentTest.info("Visibility of elements on the main page");
        softAssert.assertTrue(homePage.mainPageCheckAvailabilityWord.isDisplayed());
    }
    @Test(priority = 32)
    public void mainPageInformationTextVisibilityTest() {
        extentTest = extentReports.createTest("mainPageCheckAvailabilityVisibilityTest", "US_0001>>TC_0002" );
        extentTest.info("Visibility of elements on the main page");
        softAssert.assertTrue(homePage.mainPageCheckAvailabilityWord.isDisplayed());
    }
    @Test(priority = 33)
    public void mainPageInformationTextVisibilityTest() {
        extentTest = extentReports.createTest("mainPageCheckAvailabilityVisibilityTest", "US_0001>>TC_0002" );
        extentTest.info("Visibility of elements on the main page");
        softAssert.assertTrue(homePage.mainPageCheckAvailabilityWord.isDisplayed());
    }
    @Test(priority = 34)
    public void mainPageInformationTextVisibilityTest() {
        extentTest = extentReports.createTest("mainPageCheckAvailabilityVisibilityTest", "US_0001>>TC_0002" );
        extentTest.info("Visibility of elements on the main page");
        softAssert.assertTrue(homePage.mainPageCheckAvailabilityWord.isDisplayed());
    }
    @Test(priority = 35)
    public void mainPageInformationTextVisibilityTest() {
        extentTest = extentReports.createTest("mainPageCheckAvailabilityVisibilityTest", "US_0001>>TC_0002" );
        extentTest.info("Visibility of elements on the main page");
        softAssert.assertTrue(homePage.mainPageCheckAvailabilityWord.isDisplayed());
    }




}
