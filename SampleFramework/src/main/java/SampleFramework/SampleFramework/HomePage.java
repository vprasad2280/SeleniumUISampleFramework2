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



public class HomePage {
	
	WebDriver driver;
	public final static Logger log = Logger.getLogger(HomePage.class.getName());
	
	
	/**
	 * Below section is to store all the Home page web elements objects 
	 * using page factory approach
	 */
	 
	@FindBy(xpath="//a[@class='btn buy']")
	public WebElement btnBuy;
	
	@FindBy(xpath="//td[@class='input']")
	public List<WebElement> txtFields_customerDetails;
	
	@FindBy(xpath="//div[@class='cart-checkout']")
	public WebElement btnCart_Checkout;
	
	@FindBy(xpath="//a[@class='button-main-content']")
	public WebElement btnContinue;
	
	@FindBy(xpath="//td[@class='input']")
	public List<WebElement> lst_paymentOptions;
	
	
	

	/**
	 * Below is a constructor to initialize page factory element
	 * @param driver
	 */
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/**
	 * Below method will display navigational links displayed on home page - 9
	 */
	/*public void NavigationMenuLinks()
	{
		
		System.out.println(" --------- Navigation menu links displayed on home Page are shown below -----");
		for(int i=0;i<NavigationMenuLinks.size();i++)
		{
			String str=NavigationMenuLinks.get(i).getText();
			System.out.println(str);
		}
	}*/
	
	/**
	 * Below method will click navigational link displayed on home page
	 * @param link
	 */
	public void SelectnClickNavigationMenuLinks(String link)
	{ 
		
		for(int i=0;i<txtFields_customerDetails.size();i++)
		{
			if(txtFields_customerDetails.get(i).getText().equalsIgnoreCase(link))
		 {
				txtFields_customerDetails.get(i).click();
			log.info("Clicked on "+txtFields_customerDetails.get(i).getText());
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
		
		System.out.println("Number of tool links are :"+lst_paymentOptions.size());
		System.out.println(" --------- Master Tool Tips Displayed On The Home Page Are Shown Below -----");
		for(int i=0;i<lst_paymentOptions.size();i++)
		{
		 String txttooltip=	lst_paymentOptions.get(i).getText();
		 System.out.println(txttooltip);
		 if(lst_paymentOptions.get(i).getText().equalsIgnoreCase(tooltip))
		 {
			 lst_paymentOptions.get(i).click();
			 
			 break;
		 }
		}	
		
	}
	}
