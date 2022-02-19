package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HMCPage {

    public HMCPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@href='/Account/Logon']")
    public WebElement mainPageLoginLinki;

    @FindBy(id = "UserName")
    public WebElement usernameTextBox;

    @FindBy(id = "Password")
    public WebElement passwordTextBox;

    @FindBy(id = "btnSubmit")
    public WebElement loginButonu;

    //******************    Main Page>>>Log In>>>ADD USER Pages Webelements***********************
    // https://www.hotelmycamp.com/ main page log in click button
    @FindBy(xpath = "//a[@href='/Account/Logon']")
    public WebElement mainPageLogin;
    // mainpage>>logIn admin page userid box
    @FindBy(xpath = "//input[@id='UserName']")
    public WebElement userNameBox;
    // mainpage>>logIn admin page password box
    @FindBy(xpath = "//input[@id='Password']")
    public WebElement passwordBox;
    // mainpage>>logIn admin page save click button
    @FindBy(xpath = "//input[@id='btnSubmit']")
    public WebElement userLogIn;
    // mainpage>>logIn>>ADD USER  click button for adding new user management
    @FindBy(xpath = "//a[@class='btn btn-circle btn-default']")
    public WebElement addUserElement;
    // mainpage>>LogIN>>AddUser>>usernamebox
    @FindBy(xpath = "//input[@placeholder='UserName']")
    public WebElement addusernamebox;
    // mainpage>>LogIN>>AddUser>>usernamebox>>save
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveclickbutton;
    // mainpage>>LogIN>>AddUser>>passwordbox>>save
    @FindBy(xpath = "//input[@id='txtPassword']")
    public WebElement addUserpasswordbox;

    // mainpage>>LogIN>>AddUser>>emailbox
    @FindBy(xpath = "//input[@id='Email']")
    public WebElement addUseremailbox;


    // mainpage>>LogIN>>AddUser>>FullName
    @FindBy(xpath = "//input[@placeholder='Full Name']")
    public WebElement addUserFullNamebox;


    // mainpage>>LogIN>>AddUser>>PhoneNo
    @FindBy(xpath = "//input[@placeholder='PhoneNo']")
    public WebElement addUserPhoneNobox;

    // mainpage>>LogIN>>AddUser>>SocialSecurityNumber
    @FindBy(xpath = "//input[@placeholder='Social Security Number']")
    public WebElement addUserSocialSecurityNumberbox;

    // mainpage>>LogIN>>AddUser>>DrivingLicense
    @FindBy(xpath = "//input[@placeholder='Driving License']")
    public WebElement addUserDrivingLicensebox;

    // mainpage>>LogIN>>AddUser>>Country
    @FindBy(xpath = "//select[@id='IDCountry']")
    public WebElement addUserCountrybox;

    // mainpage>>LogIN>>AddUser>>State
    @FindBy(xpath = "//select[@id='IDState']")
    public WebElement addUserStatebox;

    // mainpage>>LogIN>>AddUser>>Address
    @FindBy(xpath = "//input[@placeholder='Address']")
    public WebElement addUserAddressbox;

    // mainpage>>LogIN>>AddUser>>DateofBirth
    @FindBy(xpath = "//input[@placeholder='Date of Birth']")
    public WebElement addUserDateofBirthbox;

    // mainpage>>LogIN>>AddUser>>DateofBirth button
    @FindBy(xpath = " (//button[@class='btn default'])[2]")
    public WebElement addUserDateofBirthbutton;


    // mainpage>>LogIN>>AddUser>>WorkingSector
    @FindBy(xpath = "//input[@placeholder='WorkingSector']")
    public WebElement addUserWorkingSectorbox;

    // mainpage>>LogIN>>AddUser>>Role
    @FindBy(xpath = "//select[@id='IDRole']")
    public WebElement addUserRolebox;

    // mainpage>>LogIN>>AddUser>>Approved
    @FindBy(xpath = "//div[@class='radio-list']")
    public WebElement addUserApprovedbox;

//*******************  MAIN PAGE>>> lOG IN  Webelements correct-incorrect words **************************

    // MainPage>>LogIn Username or Password is incorrect
    @FindBy(xpath = "//div[@class='validation-summary-errors']")
    public WebElement usernamepasswordincorrect;

    // MainPage>>LogIn Username or Password is correct
    @FindBy(xpath = "//span[text()='ListOfUsers']")
    public WebElement usernamepasswordcorrect;


    //******************  Main Page>>>Log In>>>ADD USER Pages Webelements IN CORRECT WORDS *******************

    @FindBy(xpath = "//span[@for='UserName']")
    public WebElement addUserUserNameIncorrect;


    // Email inccorrect word
    @FindBy(xpath = "//span[@for='Email']")
    public WebElement addUserEmailIncorrect;

    // Password inccorrect word
    @FindBy(xpath = "//span[@for='txtPassword']")
    public WebElement addUserPassWordIncorrect;

    // Spcial securoty incorretc word
    @FindBy(xpath = "//span[@for='SSN']")
    public WebElement addUserSSNIncorrect;

    // Phone box incorrect word
    @FindBy(xpath = "//span[@for='PhoneNo']")
    public WebElement userPhoneIncorrect;

    //admin/userAdmin/Create/FullName/
    @FindBy(xpath = "//span[@for='NameSurname']")
    public WebElement userFullNameincorrect;

    //admin/userAdmin/Create/Country/
    @FindBy(xpath = "//span[@for='IDCountry']")
    public WebElement adduserCountryincorrect;

    // DrivingLicense incorretc word
    @FindBy(xpath = "//span[@for='DrivingLicense']")
    public WebElement addDrivingLicenseIncorrect;

    // Address incorrect word
    @FindBy(xpath = "//span[@for='Address']")
    public WebElement addAdressIncorrect;

    // Date of birth incorrect word
    @FindBy(xpath = "//span[@for='BirthDate']")
    public WebElement addBirthDateIncorrect;


    //****************************Hotel Management>>>Hotel List>>>ADD HOTEL Webelements******************************
    // mainpage>>LogIN>>HotelManagement
    @FindBy(xpath = "//span[.='Hotel Management']")
    public WebElement hotelmanagementLink;
    // mainpage>>LogIN>>HotelManagement>>hotelList
    @FindBy(xpath = "//a[text()='Hotel List']")
    public WebElement hotellist;
    // mainpage>>LogIN>>HotelManagement>>hotelList>>addHotel
    @FindBy(xpath = "//span[@class='hidden-480']")
    public WebElement addHotel;
    // mainpage>>LogIN>>HotelManagement>>hotelList>>addHotel>>codebox
    @FindBy(xpath = "(//input[@class='form-control form-filter input-sm'])[1]")
    public WebElement addHotelCodeBox;

    // mainpage>>LogIN>>HotelManagement>>hotelList>>addHotel>name
    @FindBy(xpath = "//input[@placeholder='Name']")
    public WebElement addHotelNameBox;

    // mainpage>>LogIN>>HotelManagement>>hotelList>>addHotel>adress
    @FindBy(xpath = " //input[@placeholder='Address']")
    public WebElement addHotelAddressBox;


    // mainpage>>LogIN>>HotelManagement>>hotelList>>addHotel>Phone
    @FindBy(xpath = "//input[@placeholder='Phone']")
    public WebElement addHotelPhoneBox;

    // mainpage>>LogIN>>HotelManagement>>hotelList>>addHotel>Email
    @FindBy(xpath = "//input[@placeholder='Email']")
    public WebElement addHotelEmailBox;


    // mainpage>>LogIN>>HotelManagement>>hotelList>>addHotel>IDgroup
    @FindBy(xpath = "//select[@id='IDGroup']")
    public WebElement addHotelDropdown;

    // mainpage>>LogIN>>HotelManagement>>hotelList>>addHotel>Save
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement addHotelSavebutton;

    // mainpage>>LogIN>>HotelManagement>>hotelList>>addHotel>Save successfuly word
    @FindBy(xpath = "//div[@class='bootbox-body']")
    public WebElement addHotelSaveSuccesWord;

    // mainpage>>LogIN>> the list of columns
    @FindBy(xpath = "//tbody//tr")
    public List<WebElement> columnList;


    @FindBy(xpath = "//span[text()='ListOfUsers']")
    public WebElement basariliGirisYaziElementi;

    @FindBy(xpath = "//div[@class='validation-summary-errors']")
    public WebElement girisYapilamadiYaziElementi;



    @FindBy(xpath = "(//div[@class='section-title'])[2]")
    public WebElement webUniversityLoginButton;

    @FindBy(xpath = "//input[@id='text']")
    public WebElement webUniversityUserNameButton;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement webUniversityPasswordButton;


}
