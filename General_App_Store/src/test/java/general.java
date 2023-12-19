import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
//import io.appium.java_client.AppiumBy;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;


public class general {
 AppiumDriver driver;
 @Test
public void setup() throws MalformedURLException, InterruptedException {
    DesiredCapabilities cap = new DesiredCapabilities();
    cap.setCapability("platformName" ,"Android");
    cap.setCapability("deviceName","sdk_gphone64_x86_64");
    cap.setCapability("automationName","UiAutomator2");
    cap.setCapability("app","C:/Users/Dell/Desktop/General-Store.apk");

 driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"),cap);

     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

   driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

   driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(text(\"Bangladesh\"));"));
     Thread.sleep(1000);
     driver.findElement(By.xpath("//android.widget.TextView[@text='Bangladesh']")).click();

     Thread.sleep(1000);
   driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Labonno");
    Thread.sleep(1000);
   driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
     Thread.sleep(1000);
   driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
     Thread.sleep(1000);

   driver.findElements(By.xpath("//android.widget.TextView[@resource-id='com.androidsample.generalstore:id/productAddCart']")).get(1).click();
     Thread.sleep(1000);
     driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
     Thread.sleep(1000);
     driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();
     Thread.sleep(1000);
 }

}



