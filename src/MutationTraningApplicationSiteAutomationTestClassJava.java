import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MutationTraningApplicationSiteAutomationTestClassJava {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\do't click (soft)\\webSoft\\selenium\\slenium-files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		//front page
		
		driver.get("https://trland7.land.gov.bd/");
		driver.findElement(By.id("appSubmit")).click();
		
		// select Division
		
		Thread.sleep(1000);
		Select division = new Select(driver.findElement(By.id("division-id"))); Thread.sleep(1000); 
		division.selectByVisibleText("রাজশাহী"); Thread.sleep(1000); 
		Select district = new Select(driver.findElement(By.id("district-id"))); 
		district.selectByVisibleText("রাজশাহী"); Thread.sleep(1000); 
		Select upazila = new Select(driver.findElement(By.id("upazila-id")));
		upazila.selectByVisibleText("পবা"); Thread.sleep(1000); 
		Select mouja = new Select(driver.findElement(By.id("mouja-id")));
		mouja.selectByVisibleText("চক দর্শনপাড়া (জে.এল নং : ৩)"); Thread.sleep(1000); 
		
		// 1st khatian
		
		Select khatiyanType = new Select(driver.findElement(By.id("application-land-schedules-0-land-record-type-id")));
		khatiyanType.selectByVisibleText("আর.এস/বি.এস"); Thread.sleep(500); 
		
		// 1st khatian number
		
		driver.findElement(By.id("application-land-schedules-0-khatian-no")).sendKeys("25"); Thread.sleep(500); 
		
		// 1st khatian 1st dag number
		
		driver.findElement(By.id("application-land-schedules-0-dag-no")).sendKeys("42"); Thread.sleep(500);
		driver.findElement(By.id("application-land-schedules-0-amount-of-land")).sendKeys("350"); Thread.sleep(500);
		Select landAmmountType = new Select(driver.findElement(By.id("application-land-schedules-0-land-amount-type-id")));
		landAmmountType.selectByVisibleText("একর"); Thread.sleep(500);
		
		// 1st khatian 1st dag 1st dalil number
		
		driver.findElement(By.name("application_land_schedules[0][dalil_no][]")).sendKeys("4545"); Thread.sleep(500);
		driver.findElement(By.id("application-land-schedules-0-dalil-date")).sendKeys("2021-08-23"); Thread.sleep(500);
		driver.findElement(By.id("application-land-schedules-0-sub-register-office-name")).sendKeys("পবা"); Thread.sleep(500);
		
		// 1st khatian 1st dag e dalil add
		driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div[2]/div[2]/div/div[2]/form/div[2]/table[2]/tbody/tr[2]/td[10]/span")).click(); Thread.sleep(1000);
		
		// 1st khatian 1st dag 2nd dalil number

		driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div[2]/div[2]/div/div[2]/form/div[2]/table[2]/tbody/tr[3]/td[2]/div/input")).sendKeys("445"); Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div[2]/div[2]/div/div[2]/form/div[2]/table[2]/tbody/tr[3]/td[3]/div/input")).sendKeys("2021-08-23"); Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div[2]/div[2]/div/div[2]/form/div[2]/table[2]/tbody/tr[3]/td[4]/div/input")).sendKeys("পবা"); Thread.sleep(500);
		
		// 1st khatian e 2nd dag add
		
		driver.findElement(By.id("add_dag")).click(); Thread.sleep(2000);
		
		// 1st khatian 2nd dag 

		driver.findElement(By.id("application-land-schedules-3-dag-no")).sendKeys("343"); Thread.sleep(500);
		driver.findElement(By.id("application-land-schedules-3-amount-of-land")).sendKeys("223"); Thread.sleep(500);
		Select landAmmountType2 = new Select(driver.findElement(By.id("application-land-schedules-3-land-amount-type-id"))); 
		landAmmountType2.selectByVisibleText("একর"); Thread.sleep(500);
		
		// 1st khatian 2nd dag 1st dalil number
		
		driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div[2]/div[2]/div/div[2]/form/div[2]/table[2]/tbody/tr[4]/td[7]/div/input")).sendKeys("675"); Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div[2]/div[2]/div/div[2]/form/div[2]/table[2]/tbody/tr[4]/td[8]/div/input")).sendKeys("2021-08-23"); Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div[2]/div[2]/div/div[2]/form/div[2]/table[2]/tbody/tr[4]/td[9]/div/input")).sendKeys("পবা"); Thread.sleep(500);
		
		// 2nd khatian add
		
		driver.findElement(By.id("add_khotian")).click(); Thread.sleep(2000);
		
		//2nd khatian

		Select secondKhatiyanType = new Select(driver.findElement(By.id("application-land-schedules-4-land-record-type-id")));
		secondKhatiyanType.selectByVisibleText("মহানগর"); Thread.sleep(500);
		
		// 2nd khatian number

		driver.findElement(By.id("application-land-schedules-4-khatian-no")).sendKeys("765"); Thread.sleep(500);
		
		// 2nd khatian 1st dag number
		
		driver.findElement(By.id("application-land-schedules-4-dag-no")).sendKeys("444");  Thread.sleep(500);
		driver.findElement(By.id("application-land-schedules-4-amount-of-land")).sendKeys("8676"); Thread.sleep(500);
		Select landAmmountType3 = new Select(driver.findElement(By.id("application-land-schedules-4-land-amount-type-id")));
		landAmmountType3.selectByVisibleText("একর"); Thread.sleep(500);
		
		// 2nd khatian 1st dag number 1st dalil number

		driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div[2]/div[2]/div/div[2]/form/div[2]/table[2]/tbody/tr[6]/td[7]/div/input")).sendKeys("4545"); Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div[2]/div[2]/div/div[2]/form/div[2]/table[2]/tbody/tr[6]/td[8]/div/input")).sendKeys("2021-08-23"); Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div[2]/div[2]/div/div[2]/form/div[2]/table[2]/tbody/tr[6]/td[9]/div/input")).sendKeys("পবা"); Thread.sleep(500);
		
		// 2nd khatian 1st dag number2nd dalil add
		
		driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div[2]/div[2]/div/div[2]/form/div[2]/table[2]/tbody/tr[6]/td[10]/table/tbody/tr/td[1]/span")).click(); Thread.sleep(2000);
		
		// 2nd khatian 1st dag number 2nd dalil number

		driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div[2]/div[2]/div/div[2]/form/div[2]/table[2]/tbody/tr[7]/td[2]/div/input")).sendKeys("445"); Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div[2]/div[2]/div/div[2]/form/div[2]/table[2]/tbody/tr[7]/td[3]/div/input")).sendKeys("2021-08-23"); Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div[2]/div[2]/div/div[2]/form/div[2]/table[2]/tbody/tr[7]/td[4]/div/input")).sendKeys("পবা"); Thread.sleep(500);
		
		// 2nd khatian 2nd dag number add
		
		driver.findElement(By.id("add_dag")).click(); Thread.sleep(2000);
		
		// 2nd khatian 2nd dag number 
		
		driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div[2]/div[2]/div/div[2]/form/div[2]/table[2]/tbody/tr[8]/td[4]/div/input")).sendKeys("343"); Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div[2]/div[2]/div/div[2]/form/div[2]/table[2]/tbody/tr[8]/td[5]/div/input")).sendKeys("223"); Thread.sleep(500);
		Select landAmmountType4 = new Select(driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div[2]/div[2]/div/div[2]/form/div[2]/table[2]/tbody/tr[8]/td[6]/div/select"))); 
		landAmmountType4.selectByVisibleText("একর"); Thread.sleep(500);
		
		// 2nd khatian 2nd dag 1st dalil 

		driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div[2]/div[2]/div/div[2]/form/div[2]/table[2]/tbody/tr[8]/td[7]/div/input")).sendKeys("675"); Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div[2]/div[2]/div/div[2]/form/div[2]/table[2]/tbody/tr[8]/td[8]/div/input")).sendKeys("2021-08-23"); Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div[2]/div[2]/div/div[2]/form/div[2]/table[2]/tbody/tr[8]/td[9]/div/input")).sendKeys("পবা"); Thread.sleep(500);
		
		// total land ammount
		
		driver.findElement(By.id("total-land-amount-txt")).sendKeys("একশত বায়ান্ন একর"); Thread.sleep(1000);
	
		//সর্বশেষ খারিজ খতিয়ান
		
		driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div[2]/div[2]/div/div[2]/form/div[2]/table[3]/tbody/tr/td[1]/table/tbody/tr/td[2]/div/input")).sendKeys("675"); Thread.sleep(500); 
		driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div[2]/div[2]/div/div[2]/form/div[2]/table[3]/tbody/tr/td[1]/table/tbody/tr/td[3]/div/input")).sendKeys("203"); Thread.sleep(500); 
		driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div[2]/div[2]/div/div[2]/form/div[2]/table[3]/tbody/tr/td[1]/table/tbody/tr/td[4]/div/input")).sendKeys("121"); Thread.sleep(500); 
		Select landAmmountType5 = new Select(driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div[2]/div[2]/div/div[2]/form/div[2]/table[3]/tbody/tr/td[1]/table/tbody/tr/td[5]/div/select")));
		landAmmountType5.selectByVisibleText("একর"); Thread.sleep(500); 
		
		//রেকর্ডীয় মালিকের নাম ও ঠিকানা
		
		driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div[2]/div[2]/div/div[2]/form/div[2]/table[3]/tbody/tr/td[2]/table/tbody/tr/td[1]/div/input")).sendKeys("Sajib"); Thread.sleep(500); 
		driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div[2]/div[2]/div/div[2]/form/div[2]/table[3]/tbody/tr/td[2]/table/tbody/tr/td[2]/div/textarea")).sendKeys("dhaka"); Thread.sleep(500); 
		
		//আবেদনকারীর তথ্য
		
		driver.findElement(By.id("verify-type-1-2")).click(); Thread.sleep(1000); 
		driver.findElement(By.id("application-citizens-1-name")).sendKeys("Sajib"); Thread.sleep(500); 
		driver.findElement(By.id("application-citizens-1-address")).sendKeys("Dhaka"); Thread.sleep(500); 
		driver.findElement(By.id("application-citizens-1-mobile-no")).sendKeys("01917667871"); Thread.sleep(500); 
		driver.findElement(By.id("application-citizens-1-national-id-no")).sendKeys("1214343432221"); Thread.sleep(500); 
		driver.findElement(By.id("application-citizens-1-email")).sendKeys("a@a.com"); Thread.sleep(500); 
		driver.findElement(By.id("application-citizens-1-picture")).sendKeys("E:\\browser_download\\asd.jpg");Thread.sleep(1000);
		driver.findElement(By.id("application-citizens-1-signature-url")).sendKeys("E:\\browser_download\\sign.png");Thread.sleep(500);
		
		//যাদের নাম হতে কর্তন হবে/২য় পক্ষের (বিবাদি) নাম ও পূর্ণ ঠিকানা
		
		driver.findElement(By.id("application-citizens-2-name")).sendKeys("Mahmud"); Thread.sleep(500); 
		driver.findElement(By.id("application-citizens-2-address")).sendKeys("Dhaka"); Thread.sleep(500); 
		driver.findElement(By.id("application-citizens-2-mobile-no")).sendKeys("01917667871"); Thread.sleep(1000); 
		
		//আবেদনকারী নিজে না হয়ে প্রতিনিধি হলে এখানে ক্লিক করুন
		
		driver.findElement(By.id("if_representative")).click(); Thread.sleep(2000); 
		driver.findElement(By.id("application-citizens-3-name")).sendKeys("Kabir"); Thread.sleep(500); 
		driver.findElement(By.id("application-citizens-3-address")).sendKeys("Dhaka"); Thread.sleep(500); 
		driver.findElement(By.id("application-citizens-3-mobile-no")).sendKeys("01917667871"); Thread.sleep(500); 
		driver.findElement(By.id("application-citizens-3-national-id-no")).sendKeys("1214343432221"); Thread.sleep(500); 
		driver.findElement(By.id("application-citizens-3-email")).sendKeys("a@a.com"); Thread.sleep(500); 
		driver.findElement(By.id("application-citizens-3-age")).sendKeys("43"); Thread.sleep(500); 
		driver.findElement(By.id("application-citizens-3-relation")).sendKeys("ভাই"); Thread.sleep(500); 
		driver.findElement(By.id("application-citizens-3-picture")).sendKeys("E:\\browser_download\\asd.jpg"); Thread.sleep(1000); 
		driver.findElement(By.id("application-citizens-3-signature-url")).sendKeys("E:\\browser_download\\sign.png"); Thread.sleep(500); 
		
		//কাগজপত্রের স্ক্যান কপি সংযুক্তি	
		
		driver.findElement(By.id("file1")).sendKeys("E:\\browser_download\\sign.png"); Thread.sleep(2000); 
		Select document = new Select(driver.findElement(By.id("application-documents-1-application-required-document-id")));
		document.selectByVisibleText("মূল দলিলের সার্টিফাইড/ফটোকপি"); Thread.sleep(1000); 
		
		driver.findElement(By.id("file1")).sendKeys("E:\\browser_download\\sign.png"); Thread.sleep(2000); 
		Select document2 = new Select(driver.findElement(By.id("application-documents-2-application-required-document-id")));
		document2.selectByVisibleText("আবেদনকারীর জাতীয় পরিচয় পত্র"); Thread.sleep(1000);

		driver.findElement(By.id("file1")).sendKeys("E:\\browser_download\\sign.png"); Thread.sleep(2000); 
		Select document3 = new Select(driver.findElement(By.id("application-documents-3-application-required-document-id")));
		document3.selectByVisibleText("(অনলাইন) মূল ওয়ারিশ সনদপত্র (অনধিক তিন মাসের মধ্যে ইস্যুকৃত)"); Thread.sleep(1000); 
		
		//জরুরী কিনা?
		
		driver.findElement(By.id("application-type")).click(); Thread.sleep(500); 
		driver.findElement(By.id("urgent-reason")).sendKeys("yes"); Thread.sleep(5000); 
		
		//submit
		
		driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div[2]/div[2]/div/div[2]/form/div[3]/span")).click(); Thread.sleep(5000); 
		driver.findElement(By.id("terms-conditions")).click(); Thread.sleep(10000); 
		driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div[2]/div[2]/div/div[2]/form/div[3]/div[1]/div[2]/div/div[3]/button")).click();
	}

}
