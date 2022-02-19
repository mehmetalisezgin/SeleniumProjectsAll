package runners;

// runner classi feature daki testleri goruplayarak buradan calisitoryoruz
// raporlama da runner classindan yapiliyor
// runner olmadan da feature lar calisir ama burada toplu olarka calisitiliyor

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target\\cucumber-reports.html"},// raporlama
   features = "src/test/resources/features",
        //featureslarimiz neredesyse onun path i alinir
        glue = "stepdefinitions",
        tags = "@hmce2e" , // testlerimize verdigimiz task lar verilecek ornegin smoke test end to end gibi basinda bu tag in yazili oldugu butun testler calisacak
        dryRun = false
)


public class Runner{

}