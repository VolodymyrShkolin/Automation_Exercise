package core.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import static constants.Folders.downloadsFolder;

public final class WebDriverFactory {

    private WebDriverFactory(){}

    public static WebDriver createDriver(BrowserType browser){
        return switch (browser) {
            case CHROME ->  createChromeDriver();
            case FIREFOX ->  throw new UnsupportedOperationException("Firefox not implemented yet");
            case OPERA ->  throw new UnsupportedOperationException("Opera not implemented yet");
        };
    }


    public static WebDriver createChromeDriver(){
        ChromeOptions options = createChromeOptions();

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(45));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
        driver.manage().window().maximize();

        return driver;
    }



    private static ChromeOptions createChromeOptions(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-infobars");
        options.addArguments("--disable-notifications");
        options.addArguments("--start-maximized");

        Map<String, Object> prefs = new HashMap<>();

        prefs.put("download.default_directory", downloadsFolder);
        prefs.put("download.prompt_for_download", false);
        prefs.put("download.directory_upgrade", true);
        options.setExperimentalOption("prefs", prefs);

        if(isHeadless()){
            options.addArguments("--headless=new");
            options.addArguments("--window-size=1920,1080");
        }

        return options;
    }

    private static boolean isHeadless(){
        return  Boolean.parseBoolean(System.getProperty("headless", "false"));
    }
}
