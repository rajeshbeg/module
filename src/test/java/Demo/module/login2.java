package Demo.module;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class login2 extends BrowserIni{
	@Test
	public void password()
	{
		 driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("rajesh");
	}

}
