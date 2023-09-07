package listeners;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGListenersDemo2 {
 
	@Parameters({"browsername"})
	@Test
	public void Test4(@Optional String name) 
	{

	System.out.println("Iam Inside Test4 " +name);	
	//throw new SkipException("This Test is Skipped");
	}
	@Test
	public void Test5() 	 
	{
		System.out.println("Iam Inside Test5 " );	
		
		
	}
	@Test
	public void Test6()
	{
		System.out.println("Iam Inside Test6 " );	
	}
	
}
