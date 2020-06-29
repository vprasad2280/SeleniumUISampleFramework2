package SampleFramework.SampleFramework;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * 
 * @author VenkatPrasad
 *
 */

public class ShippingKartPage  {

	WebDriver driver;
	public final static Logger log = Logger.getLogger(HomePage.class.getName());

	/**
	 * Below section is to store all the Contact page web elements objects 
	 * using page factory approach
	 */

	@FindBy(id="reachoutforproduct")
	public  WebElement drp_reachoutforproduct;

	@FindBy(xpath=".//select[@id='reachoutforproduct']/option")
	public  List<WebElement> drp_reachoutforproduct_Items;

	@FindBy(id="compInqServ")
	public WebElement drp_ComplaintInquirySerivce;
	@FindBy(xpath=".//select[@id='compInqServ']/option")
	public List<WebElement> drp_ComplaintInquirySerivce_Items;

	@FindBy(id="need")
	public WebElement drp_selectProduct;
	@FindBy(xpath=".//select[@id='need']/option")
	public List<WebElement> drp_selectProduct_Items;

	@FindBy(id="product")
	public WebElement drp_selectSubProduct;
	@FindBy(xpath=".//select[@id='product']/option")
	public List<WebElement> drp_selectSubProduct_Items;

	@FindBy(id="emirate")
	public WebElement drp_selectEmirates;
	@FindBy(xpath=".//select[@id='emirate']/option")
	public List<WebElement> drp_selectEmirates_Items;

	@FindBy(id="branch")
	public WebElement drp_selectBranch;
	@FindBy(xpath=".//select[@id='branch']/option")
	public List<WebElement> drp_selectBranch_Items;

	@FindBy(id="prefLang")
	public WebElement drp_PreferedLanguage;
	@FindBy(xpath=".//select[@id='prefLang']/option")
	public List<WebElement> drp_PreferedLanguage_Items;

	@FindBy(id="curStatus")
	public WebElement drp_selectCustomer;

	@FindBy(xpath=".//select[@id='curStatus']/option")
	public List<WebElement> drp_selectCustomer_Items;

	@FindBy(xpath=".//select[contains(@ ng-model,required)]")
	public List<WebElement> drp_Fields;

	@FindBy(id="firstName")
	public WebElement txt_firstName;

	@FindBy(id="lastName")
	public WebElement txt_lastName;

	@FindBy(id="email")
	public WebElement txt_email;

	@FindBy(id="mobile")
	public WebElement txt_mobile;

	@FindBy(xpath=".//select[@id='mob1']/option")
	public List<WebElement> txt_mobilecode;

	@FindBy(id="comments")
	public WebElement txtArea_comments;

	@FindBy(id="btnSubmit")
	public WebElement btn_Submit;

	/**
	 * Below is a constructor to initialize page factory element
	 * @param driver
	 */

	public ShippingKartPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/**  
	 * Below method will display number of items in "I am looking to--" drop down
	 * and select on user specified value from it
	 * @param dropdownValue
	 */

	public void Contactform_Field_Iamlookingto_dropdown (String dropdownValue)
	{
		drp_reachoutforproduct.click();
		System.out.println(" Number of dropdown options available in <I am looking to...> drop down are below : "+drp_reachoutforproduct_Items.size());
		for (int i=0;i<drp_reachoutforproduct_Items.size();i++)
		{
			System.out.println(drp_reachoutforproduct_Items.get(i).getText());
			if(drp_reachoutforproduct_Items.get(i).getText().equalsIgnoreCase(dropdownValue))
			{ 
				drp_reachoutforproduct_Items.get(i).click();	
			}
		}

	}

	/**  
	 * Below method will display number of items in "Complaint/Inquiry/Service" drop down
	 * and select on user specified value from it
	 * @param dropdownValue
	 */

	public void Contactform_ComplaintInquirySerivce_dropdown(String dropdownValue)
	{

		drp_ComplaintInquirySerivce.click();

		System.out.println(" Number of options available in <ComplaintInquirySerivce> dropdown are below : "+drp_ComplaintInquirySerivce_Items.size());
		for (int i=0;i<drp_ComplaintInquirySerivce_Items.size();i++)
		{
			System.out.println(drp_ComplaintInquirySerivce_Items.get(i).getText());
			if(drp_ComplaintInquirySerivce_Items.get(i).getText().equalsIgnoreCase(dropdownValue))
			{  
				drp_ComplaintInquirySerivce_Items.get(i).click();	
				break;
			}
		}

	}



	public boolean Contactform_SelectProduct_dropdownValidation(String dropdownValue)
	{
		//homepageObj.ClickMasterToolTips("contact");
		boolean val=drp_selectProduct.isSelected();
		System.out.println("value is :"+val);

		if(val=false)
		{
			boolean empty=drp_selectSubProduct_Items.isEmpty();
			System.out.println("sub value is :"+empty);
			System.out.println("User has to select "+drp_selectProduct.getText()+"product first to select "+drp_selectSubProduct.getText()+"sub product from dropdown");
			return empty;
		}


		return val;
	}

	/**  
	 * Below method will display number of items in "SelectProduct" drop down
	 * and select on user specified value from it
	 * @param dropdownValue
	 */

	public void Contactform_SelectProduct_dropdownItems(String dropdownValue)
	{

		drp_selectProduct.click();

		System.out.println(" Number of options available in <SelectProduct> dropdown are below : "+drp_selectProduct_Items.size());
		for (int i=0;i<drp_selectProduct_Items.size();i++)
		{
			System.out.println(drp_selectProduct_Items.get(i).getText());
			if(drp_selectProduct_Items.get(i).getText().equalsIgnoreCase(dropdownValue))
			{  
				drp_selectProduct_Items.get(i).click();	
				break;
			}
		}

	}


	/**  
	 * Below method will display number of items in "Select SubProduct" drop down
	 * and select on user specified value from it
	 * @param dropdownValue
	 */
	public void Contactform_SelectSubProduct_dropdown(String dropdownValue)

	{
		drp_selectSubProduct.click();

		System.out.println(" Number of options available in <SelectSubProduct> dropdown are below : "+drp_selectSubProduct_Items.size());
		for (int i=0;i<drp_selectSubProduct_Items.size();i++)
		{
			System.out.println(drp_selectSubProduct_Items.get(i).getText());
			if(drp_selectSubProduct_Items.get(i).getText().equalsIgnoreCase(dropdownValue))
			{  
				drp_selectSubProduct_Items.get(i).click();	
				break;
			}
		}

	}


	/**  
	 * Below method will display number of items in "Select Emirates" drop down
	 * and select on user specified value from it
	 * @param dropdownValue
	 */
	public void Contactform_SelectEmirates_dropdown(String dropdownValue)
	{
		drp_selectEmirates.click();

		System.out.println(" Number of options available in <SelectEmirates> dropdown are below : "+drp_selectEmirates_Items.size());
		for (int i=0;i<drp_selectEmirates_Items.size();i++)
		{
			System.out.println(drp_selectEmirates_Items.get(i).getText());
			if(drp_selectEmirates_Items.get(i).getText().equalsIgnoreCase(dropdownValue))
			{  
				drp_selectEmirates_Items.get(i).click();	
				break;
			}
		}

	}

	/**  
	 * Below method will display number of items in "Select Branch" drop down
	 * and select user specified value from it
	 * @param dropdownValue
	 */

	public void Contactform_SelectBranch_dropdown(String dropdownValue)
	{

		drp_selectBranch.click();

		System.out.println(" Number of options available in <SelectBranch> dropdown are below : "+drp_selectBranch_Items.size());
		for (int i=0;i<drp_selectBranch_Items.size();i++)
		{
			System.out.println(drp_selectBranch_Items.get(i).getText());
			if(drp_selectBranch_Items.get(i).getText().equalsIgnoreCase(dropdownValue))
			{  
				drp_selectBranch_Items.get(i).click();	
				break;
			}
		}

	}

	/**  
	 * Below method will display number of items in "Select Preferred Language" drop down
	 * and select user specified value from it
	 * @param dropdownValue
	 */
	public void Contactform_SelectPrefLanguage_dropdown(String dropdownValue)
	{
		drp_PreferedLanguage.click();

		System.out.println(" Number of options available in <SelectPrefLanguage> dropdown are below : "+drp_PreferedLanguage_Items.size());

		for (int i=0;i<drp_PreferedLanguage_Items.size();i++)
		{
			System.out.println(drp_PreferedLanguage_Items.get(i).getText());
			if(drp_PreferedLanguage_Items.get(i).getText().equalsIgnoreCase(dropdownValue))
			{  
				drp_PreferedLanguage_Items.get(i).click();	
				break;
			}
		}

	}

	/**  
	 * Below method will display number of items in "Select Customer" drop down
	 * and select user specified value from it
	 * @param dropdownValue
	 */
	public void Contactform_SelectCustomer_dropdown(String dropdownValue)
	{

		drp_selectCustomer.click();

		System.out.println(" Number of options available in <SelectCustomer> dropdown are below : "+drp_selectCustomer_Items.size());
		for (int i=0;i<drp_selectCustomer_Items.size();i++)
		{
			System.out.println(drp_selectCustomer_Items.get(i).getText());
			if(drp_selectCustomer_Items.get(i).getText().equalsIgnoreCase(dropdownValue))
			{  
				drp_selectCustomer_Items.get(i).click();	
				break;
			}
		}

	}

	/**
	 * Below method will enter value to the text field called "First Name"
	 * @param firstname
	 */

	public void Txt_EnterFirstName(String firstname)
	{   txt_firstName.clear();
		txt_firstName.sendKeys(firstname);
	}

	/**
	 * Below method will enter value to the text field called "Last Name"
	 * @param lastname
	 */
	public void Txt_EnterLatstName(String lastname)
	{   txt_lastName.clear();
		txt_lastName.sendKeys(lastname);
	}

	/**
	 * Below method will enter value to the text field called "Email"
	 * @param email
	 */
	public void Txt_EnterEmail(String email)
	{   txt_email.clear();
		txt_email.sendKeys(email);
	}

	/**
	 * Below method will enter value to the text field called "Mobile Number"
	 * and validate for 7 digits number .If mobile number is less or greater than 7 digits throws in line error 
	 * and is mobile number is exact 7 digits then display valid mobile number
	 * @param mobNum
	 */
	public void Txt_EnterMobileNum(String mobNum)
	{   txt_mobile.clear();
		txt_mobile.sendKeys(mobNum);
		String Errormessage=driver.findElement(By.xpath(".// *[@id='mobile']//following::span[1]")).getText();

		if(mobNum.length()>7)
		{   

			System.out.println(Errormessage);
		}
		else if(mobNum.length()<7)
		{   

			System.out.println(Errormessage);
		}

		else 
		{
			System.out.println("Entered Mobile number " +mobNum+" is valid");
		}
	}

	/**  
	 * Below method will display number of items in "country/city code" drop down
	 * and select user specified value from it
	 * @param dropdownValue
	 */

	public void Txt_EnterMobilecode(String mobcode)
	{
		drp_reachoutforproduct.click();
		System.out.println(" Number of dropdown options available in <Mobile Code> drop down are below : "+txt_mobilecode.size());
		for (int i=0;i<txt_mobilecode.size();i++)
		{
			System.out.println(txt_mobilecode.get(i).getText());
			if(txt_mobilecode.get(i).getText().equalsIgnoreCase(mobcode))
			{ 
				txt_mobilecode.get(i).click();	
			}
		}

	}

	/**
	 * Below method will enter value to the text field called "Comments Area"
	 * @param areaComments
	 */

	public void Txt_EnterComments(String areaComments)
	{   txtArea_comments.click();
		txtArea_comments.sendKeys(areaComments);
	}


}


