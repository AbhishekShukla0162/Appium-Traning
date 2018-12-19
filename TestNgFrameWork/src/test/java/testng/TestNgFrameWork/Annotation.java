package testng.TestNgFrameWork;

import org.testng.annotation.AfterMethod;
import org.testng.annotation.AfterTest;
import org.testng.annotation.BeforeMethod;
import org.testng.annotation.BeforeTest;
import org.testng.annotation.Test;

public class Annotation {
	
	@BeforeMethod
	public void  UserId()
	{
		System.out.println("UserId Generation");
	}
	
	@AfterMethod
	public void Approved()
	{
		System.out.println("Approved the request");
	}
	
	@BeforeTest 
	public void WorkOn()
	{
		System.out.println(" Start Working on booing the ticket");
	}
	
	@AfterTest
	public void WorkDone()
	{
		System.out.println("the work of booking ticket is compleated  now ");
	}
	
		@Test
		public void A_PrintName()
		{
			System.out.println("hii this is abhishek shukla ");
		}
		
		@Test
		public void B_BrowserOpen()
		{
			System.out.println("Open the browsre");
		}
		
		@Test
		public void C_Booking()
		{
			System.out.println("booking the ticket");
		}
		
		
		
		
}


