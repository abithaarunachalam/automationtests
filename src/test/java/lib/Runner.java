package lib;


import cucumber.api.java.eo.Se;
import org.junit.Assert;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.SessionId;
//import test.java.data.TestData;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;


public class Runner {

    public static WebDriver driver;
    public static Configuration conf;
    public static String envNISP;
    private Util util;

    //BrowserStack variables
    private DesiredCapabilities capabilities;

    public Runner() {
        util = new Util();
        //conf = new Configuration();
    }

    public void setup() {
    	 String chromePath = System.getProperty("user.dir") +"\\src\\test\\java\\resources\\config\\drivers\\";
    	 System.setProperty("webdriver.chrome.driver", chromePath+"chromedriver238.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://google.com.au");
    }
//        
//         if(conf.getProperty("browser").equals("Chrome")){
//            //ExecutionLogger.root_logger.info("started");
//             String chromeVersion=conf.getProperty("ChromeVersion");
//             String chromePath = System.getProperty("user.dir") +"\\src\\test\\java\\resources\\config\\drivers\\";
//             switch(chromeVersion){
//                 case "65":
//                 case "66":
//                 case "67":
//                 case "69":
//                 case "70":
//                 case "73":
//                     System.setProperty("webdriver.chrome.driver", chromePath+"chromedriver238.exe");
//                     break;
//                 case "71":
//                     System.setProperty("webdriver.chrome.driver", chromePath+"chromedriver70.exe");
//                     break;
//                 case "72":
//                     System.setProperty("webdriver.chrome.driver", chromePath+"chromedriver.exe");
//                     break;
//                 default:
//                     System.setProperty("webdriver.chrome.driver", chromePath+"chromedriver229.exe");
//
//             }
//            HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
//            chromePrefs.put("download.prompt_for_download", true);
//            chromePrefs.put("pdfjs.enabled", true);
//            chromePrefs.put("plugins.plugins_enabled", new String[]{ "Chrome PDF Viewer"});
//
//            ChromeOptions ops = new ChromeOptions();
//            ops.setExperimentalOption("prefs", chromePrefs);
//            capabilities = DesiredCapabilities.chrome();
//
//            ops.addArguments("--disable-notifications");
//            ops.addArguments("--disable-component-cloud-policy");
//            ops.addArguments("--incognito");
//             if(conf.getProperty("ChromeVersion").equalsIgnoreCase("72")) {
//                 ops.addArguments("--touch-events=enabled");
//             }
//             capabilities.setCapability(ChromeOptions.CAPABILITY, ops);
//            capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
//            capabilities.setCapability(CapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION, true);
//             driver = new ChromeDriver(capabilities);
//            driver.manage().window().maximize();
//         } else if(conf.getProperty("browser").equals("Firefox")) {
//            driver = new FirefoxDriver();
//            driver.manage().window().maximize();
//         }
//         // Specify environment for other config properties to use
//      //   envNISP = conf.getProperty("Env");
//        // TestData.setEnvProperty(envNISP);
//      //   TestData.setEmailProvider(conf.getProperty(conf.getProperty("EmailProvider")));
//    }
//

    public void cleanup() {
        driver.quit();
       // ExecutionLogger.root_logger.info(" Closed the browser. Finishing Test.");
       // EmailReports e = new EmailReports();
       // e.emailReports();
    }   

}


