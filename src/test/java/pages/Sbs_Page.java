package pages;

import org.openqa.selenium.By;

import lib.Configuration;
import lib.Runner;
import lib.Util;
import lib.WebDriverHelper;

public class Sbs_Page extends Runner {
	
//    private static final By ECHELON_USERNAME = By.xpath("//input[@name='user_username']");
//    private static final By ECHELON_PASSWORD = By.xpath("//input[@name='user_password']");
//    private static final By ECHELON_LOGIN = By.xpath("//button[@id='register-submit-btn']");
    private static final By Play_Button = By.xpath("//*[@id='mod-video-player_module-1']/div/div[6]/div/a");
    private static final By Playpause_Button = By.xpath("//button[@aria-label='Play']");
    private static final By time_Span = By.xpath("//*[@id=\"mod-video-player_module-1\"]/div/div[3]/nav/div[2]/span[1]");
    private static final By video_player = By.xpath("//*[@id='video-1631640131748']");
    
	private Util util;
    private WebDriverHelper webDriverHelper;
    private Configuration conf;
	
    public Sbs_Page() {
        util = new Util();
        webDriverHelper = new WebDriverHelper();
        conf = new Configuration();        
    }
        
    public void launchsbs() {    	
            driver.get(conf.getProperty("sbs_URL"));       
    }   
    
    public void playvideo() { 
    	
    	webDriverHelper.click(Play_Button);  
    	webDriverHelper.hardWait(5);
    	webDriverHelper.focusElement(video_player);   
    	webDriverHelper.click(Playpause_Button);    	
    	webDriverHelper.hardWait(10);
    	webDriverHelper.focusElement(video_player);  
    	webDriverHelper.click(Playpause_Button);    	
    	webDriverHelper.hardWait(10);
    	webDriverHelper.focusElement(video_player);  
    	webDriverHelper.click(Playpause_Button);  
    	webDriverHelper.hardWait(110);
    	webDriverHelper.focusElement(video_player);  
    	webDriverHelper.click(Playpause_Button);   
    	webDriverHelper.hardWait(10);
    }
}
