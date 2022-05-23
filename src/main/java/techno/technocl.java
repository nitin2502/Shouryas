package techno;

import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class technocl {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\niting\\eclipse-workspace\\Shouryas\\Driver\\chromedriver.exe");
		 WebDriver driver=  new ChromeDriver();
         driver.get("http://trti.mahamining.com/home");
		  Thread.sleep(3000);

         Screenshot k= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);

     	ImageIO.write(k.getImage(), "png", new File("C:\\Users\\niting\\eclipse-workspace\\Shouryas\\screenshot\\07.png"));
         

	
	}

}
