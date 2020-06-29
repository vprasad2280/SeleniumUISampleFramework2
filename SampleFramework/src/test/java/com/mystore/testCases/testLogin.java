package com.mystore.testCases;
import java.io.IOException;

import  org.testng.annotations.*;


import com.test.uiAutomation.MasherqDigital.data.PropReadData;




public class testLogin extends TestBase {
	
	PropReadData readData;


	@BeforeClass
	public void setUp() throws IOException {
      init(); 
   
	}

	@Test(priority=7,description="This test case display tooltip links list and clicks contact page link ")
	
	public void verifyContactFormFields() {
		
		try {
			log.info("=======Starting Contact form  test========");
			
			/**
			 * Created page objects for homepage and contact page to access class members to form TC
			 */
			
			PropReadData readData=new PropReadData();
			
			//click on contact link 
			
			
			log.info("=======Finished Contact form  test========");
			getScreenShot("Contact form test========");
		} catch (Exception e) {
           getScreenShot("Contact form test========");
		}
		
		
	}
	
}
