package resources.steps.sbs;

import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import java.data.TestData;
import lib.Runner;
import lib.Util;
import pages.Sbs_Page;



public class Sbs_NavigationSteps extends Runner  {
	
	private Sbs_Page Sbs_page;
	private lib.Runner runner;
	private lib.Util util;

	public Sbs_NavigationSteps()
	{
		runner = new Runner();
		util = new Util();
		
	}
	
    @Given("^I start the web browser$")
    public void i_start_the_web_browser() throws Throwable {   	
       
        runner.setup();
        util.clickBrowserMaximizeButton();
        //throw new PendingException();
    } 
    
	@When("^I open sbs and launch URL$")
    public void i_open_sbs() {
        Sbs_page = new Sbs_Page();
        Sbs_page.launchsbs();       
    }
	
	@When("^I Play the Video$")
    public void i_play_the_video() {
        Sbs_page = new Sbs_Page();
        Sbs_page.playvideo();       
    }
	
    @Then("^I close sbs the Browser$")
    public void i_close_the_web_browser() throws Throwable {    	

        runner.cleanup();
        //throw new PendingException();
    }
	
}
