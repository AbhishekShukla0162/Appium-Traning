package testng.frameworktestng2;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annot2 {
	
	@BeforeSuite
	public void FirstExecute()
	{
		System.out.println("I am the First");
	}

	@AfterSuite
	public void LastExecute()
	{
		System.out.println("I am the last ");
	}
	
	@Test
	public void RunningFile()
	{
		System.out.println("I am a  first running file from second package ");
	}

	@Test
	public void RunningFile2()
	{
		System.out.println("I am a  second running file from second package ");
	}
	
}
