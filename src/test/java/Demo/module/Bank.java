package Demo.module;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Bank extends BrowserIni{
	ExtentReports extent;
	ExtentTest Log;
	@Test
	public void setUrl() throws IOException
	{
		extent=new ExtentReports("C:\\Users\\rajesh\\workspace\\module\\extent\\report.html",true);
		Log=extent.startTest("Browser URL setting");
	driver=setBrowser();
	driver.get("https://www.facebook.com/login/");
	Log.log(LogStatus.PASS, "Url opened successful");
	extent.endTest(Log);
	extent.flush();
	}
	@Test(priority=2)
	public void Email() throws IOException
	{
     driver.findElement(By.xpath("//input[@name='email']")).sendKeys("rajesh");
	}
	

}
