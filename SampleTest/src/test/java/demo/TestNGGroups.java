package demo;

import org.testng.annotations.Test;

public class TestNGGroups { 
	
	@Test(groups= {"sanity","smoke"})
	public void Test1()
	{
		System.out.println("Entered into Test1");
	}
	
    @Test(groups= {"sanity","regression"})
	public void Test2()
	{
		System.out.println("Entered into Test2");
	}

	
    @Test
	public void Test3()
	{
		System.out.println("Entered into Test3");
	}

	
    @Test(groups= {"smoke" , "regression"})
	public void Test4()
	{
		System.out.println("Entered into Test4");
	}


}
