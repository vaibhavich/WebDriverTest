import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class methodConcept
{

	public static void main(String[] args) throws InterruptedException, AWTException, IOException
	{
				
				WebDriver driver = new FirefoxDriver();
				driver.get("http://only-testing-blog.blogspot.in/2014/01/textbox.html");
				
				
				WebElement chk_box = driver.findElement(By.xpath("//*[@id='check3']"));
				System.out.println(chk_box.isSelected());


				if(chk_box.isSelected()){
					System.out.println("Check box is already checked");
				}else{
					chk_box.click();
				}
				
				methodConcept obj = new methodConcept();
				obj.selectCheckBox(chk_box);
////to avoid rewriting of isSelected() for each chk box for verifying that chk box is already selected or not
////we make a new method selectCheckBox in which we write isSelected() method perform action directly by object
				
				
				
				
				selectCheckBox(chk_box);
				selectCheckBox(chk_box);
				if(chk_box.isSelected()){
					System.out.println("Check box is already checked");
				}else{
					chk_box.click();
				}
				
				System.out.println(chk_box.isDisplayed());
				System.out.println(chk_box.isEnabled());
				
				
	
			
			
			public void selectCheckBox(WebElement checkbox)
			{
				if(checkbox.isSelected()){
					System.out.println("checkbox is already selected");
				}else{
					checkbox.click();
				}
			
			}
	}		

}
