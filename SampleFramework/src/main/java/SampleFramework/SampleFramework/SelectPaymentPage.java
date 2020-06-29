package SampleFramework.SampleFramework;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * 
 * @author VenkatPrasad
 *
 */



public class SelectPaymentPage {
	
	WebDriver driver;
	public final static Logger log = Logger.getLogger(SelectPaymentPage.class.getName());
	
	
	/**
	 * Below section is to store all the Home page web elements objects 
	 * using page factory approach
	 */
	 
	@FindBy(xpath=".//div[@class='leftLinks']/ul/li")
	public List<WebElement> NavigationMenuLinks;
	
	@FindBy(xpath=".//a[@class='masterTooltip']")
	public List<WebElement> tooltips;

	/**
	 * Below is a constructor to initialize page factory element
	 * @param driver
	 */
	public SelectPaymentPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/**
	 * Below method will display navigational links displayed on home page - 9
	 */
	public void NavigationMenuLinks()
	{
		
		System.out.println(" --------- Navigation menu links displayed on home Page are shown below -----");
		for(int i=0;i<NavigationMenuLinks.size();i++)
		{
			String str=NavigationMenuLinks.get(i).getText();
			System.out.println(str);
		}
	}
	
	/**
	 * Below method will click navigational link displayed on home page
	 * @param link
	 */
	public void SelectnClickNavigationMenuLinks(String link)
	{ 
		
		for(int i=0;i<NavigationMenuLinks.size();i++)
		{
			if(NavigationMenuLinks.get(i).getText().equalsIgnoreCase(link))
		 {
			NavigationMenuLinks.get(i).click();
			log.info("Clicked on "+NavigationMenuLinks.get(i).getText());
			break;
		 }		
		}
		}
	
	/**
	 * Below method will click tool tip link displayed on home page
	 * @param tooltip
	 */
	public void ClickMasterToolTips(String tooltip)
	{
		
		System.out.println("Number of tool links are :"+tooltips.size());
		System.out.println(" --------- Master Tool Tips Displayed On The Home Page Are Shown Below -----");
		for(int i=0;i<tooltips.size();i++)
		{
		 String txttooltip=	tooltips.get(i).getText();
		 System.out.println(txttooltip);
		 if(tooltips.get(i).getText().equalsIgnoreCase(tooltip))
		 {
			 tooltips.get(i).click();
			 
			 break;
		 }
		}	
		
	}
	}
