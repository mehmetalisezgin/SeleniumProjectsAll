package tests.day19;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.HMCWebTablePage;
import pages.HotelMyCampPage;
import utilities.Driver;

public class C01_WebTableDinamikLocate {

    // 3 test methodu olusturalim


    HMCWebTablePage hmcWebTablePage;
    HotelMyCampPage hotelMyCampPage;
    @Test
    public void satirYazdirTest() {
        // 1. method satir numarasi verdigimide bana o satirdaki datalari yazdirsin
        // 2. satiri yazdir>>   //tbody//tr[2]
        // 7. satiri yazdir>>   //tbody//tr[7]
        hotelMyCampPage =new HotelMyCampPage();
        hotelMyCampPage.girisYap();
        hmcWebTablePage= new HMCWebTablePage();
        WebElement ucuncusatirElement = hmcWebTablePage.satirgetir(3) ;
        System.out.println(ucuncusatirElement.getText());
        Driver.closeDriver();
    }


    @Test
    public void hucreBilgisiGetirTest() {

        hotelMyCampPage =new HotelMyCampPage();
        hotelMyCampPage.girisYap();
        hmcWebTablePage= new HMCWebTablePage();
        // 2. satirin 4. datasi  >>>  //tbody//tr[2]//td[4]
        // 4.satirin 5.datasi >>> //tbody//tr[4]//td[5]
       String hucrebilgisi=  hmcWebTablePage.hucreWebelementGetir(3,4) ;
        System.out.println(hucrebilgisi);


    }


    @Test
    public void sutunBilgisiYazdirTest() {
        // 3 method da sutun numarasi verdigimde bana tum sutunu yazdirsin
        hotelMyCampPage =new HotelMyCampPage();
        hotelMyCampPage.girisYap();
        hmcWebTablePage= new HMCWebTablePage();

        hmcWebTablePage.sutunYazdir(4);
        Driver.closeDriver();

    }



}
