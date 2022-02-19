package tests.day20;

import org.testng.annotations.Test;

public class C03_ReusableRunner {



    @Test
    public void test(){
        String path = "src/test/java/resources/ulkeler.xlsx";
        String expectedData = "Azerbaycan";
        String actualData = ReusableMethodsExcel.hucreGetir(path,"Sayfa1",11,2).toString();
    }
}
