import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;


public class BaseSetup {

    WebDriver driver;

    @BeforeClass
    public void setup() throws MalformedURLException {

//        DesiredCapabilities dc = new DesiredCapabilities();
//        dc.setCapability("appium:automationName","espresso");
//        dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
//        dc.setCapability(MobileCapabilityType.APP,"/Users/ula/Downloads/Calculator.apk");
//        dc.setCapability("appium:noSign","true");
//        dc.setCapability("appium:forceEspressoRebuild",true);
//
////      driver = new AndroidDriver<MobileElement>("",dc.ge);
//        AppiumDriverLocalService builder = AppiumDriverLocalService.buildService(new AppiumServiceBuilder().withIPAddress("127.0.0.1")
//                .withLogFile(new File("myAppium_log.log"))
//                .withArgument(GeneralServerFlag.BASEPATH,"/wd/hub/"));
//
//        builder.clearOutPutStreams();
//        String appiumServiceUrl = builder.getUrl().toString();
//        if(!builder.isRunning()){
//            builder.start();
//        }
//
//        System.out.println("----------------------------------------------------------------");
//
//        builder.start();
//
//        System.out.println( builder.isRunning());
//
//        driver = new AndroidDriver(builder.getUrl(),dc);

    }

    private AndroidDriver getDriver(String automationName) throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "Android Emulator");
        capabilities.setCapability("automationName", automationName);
        capabilities.setCapability("app", "/Users/ula/Downloads/app-debug.apk");
        capabilities.setCapability("noSign", "true");
        return new AndroidDriver(new URL("http://localhost:5552/wd/hub"), capabilities);
    }


    @Test
    public void initimethod() throws MalformedURLException {

        AndroidDriver driver1 = getDriver("Espresso");
        driver1.getTitle();

    }

    public boolean isDisplayed(By locator){
        try{
           return  driver.findElement(locator).isDisplayed();
        }catch (Exception e) {
            return false;
        }

    }

    @AfterClass
    public  void tear(){
        driver.quit();
    }


}
