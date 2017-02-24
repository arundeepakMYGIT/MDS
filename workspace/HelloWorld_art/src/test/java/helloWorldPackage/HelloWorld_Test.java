package helloWorldPackage;

import java.awt.List;
import java.util.StringTokenizer;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HelloWorld_Test {
	
	private List actions;
	
	@Test
	public void testOne()
	{
		String className = this.getClass().getName();
		System.out.println("Classname is: " +className);
		
		int a = 3, c;
		c = a / 0;
		
		System.out.println("Result to print: " +c);
		
		Assert.assertEquals("helloWorldPackage.HelloWorld_Test", this.getClass().getName());
	}
	
	
	public void HelloWorld_Test(String startingActions) {
	StringTokenizer tokenizer = new StringTokenizer(startingActions);
	while (tokenizer.hasMoreTokens()) {
	actions.add(tokenizer.nextToken());
	}
	}
}
