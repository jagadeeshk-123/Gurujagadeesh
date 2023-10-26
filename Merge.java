package Week1day13;

	import java.time.Duration;
	import java.util.ArrayList;
	import java.util.List;
	import java.util.Set;

	import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Merge {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://leaftaps.com/opentaps/control/login");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
			driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Merge Leads")).click();
			driver.findElement(By.xpath("(//tr//img)[1]")).click();
			Set<String> childWindow = driver.getWindowHandles();
			List<String> child= new ArrayList<String>(childWindow);
			driver.switchTo().window(child.get(1));
			driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]")).click();
			driver.switchTo().window(child.get(0));
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//tr//img)[2]")).click();
			Set<String> childWindow1 = driver.getWindowHandles();
			List<String> child1= new ArrayList<String>(childWindow1);
			driver.switchTo().window(child1.get(1));
			driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[2]")).click();
			driver.switchTo().window(child1.get(0));
			driver.findElement(By.xpath("//a[text()='Merge']")).click();
			driver.switchTo().alert().dismiss();
			driver.close();
			
		}

	}

