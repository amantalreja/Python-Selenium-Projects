package BharwoStack;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//import org.apache.http.client.fluent.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;

class RunIt implements Runnable {
	long[] clickTime={System.currentTimeMillis()};
	String args[];
	static int counter=0;
	int constant=0;
	//public LinkedHashMap<ArrayList<String>,Boolean>fullOldList = new LinkedHashMap<ArrayList<String>,Boolean>() ;
public  ArrayList<String> tabs;
public int signUpOkay=0;
public int lol=0;
public int itsOver=2;
public ChromeOptions options;
public ChromeDriver[] driverArray;
//public final ChromeDriver driver;
public int whenReset=0;
public String aliLink;
int oldCondition=0;
long[] personalClickTime={System.currentTimeMillis()};
RunIt(String args[],ChromeDriver[] driver1,int old){
	if(counter==0){
	constant=0;
	counter=counter+3;
	}
	else{
		constant=counter;
	}
	this.args=args;
	aliLink=args[0];
	driverArray=driver1;
//	this.driver=driverArray[0];
	//if(driver==driverArray[0]){
		//System.out.println("true");
	//}
	//driver1[0]=null;
	oldCondition=old;
}
void changeIpPlus(ChromeDriver driver) throws InterruptedException {
	
//	((JavascriptExecutor)driver).executeScript("window.open();");
	//tabs = new ArrayList<String> (driver.getWindowHandles());
	//driver.switchTo().window(tabs.get(3));
	//1
	System.out.println("executing changeIpPLus");
	tabs = new ArrayList<String> (driver.getWindowHandles());
	driver.switchTo().window(tabs.get(0));
	String originalSite= driver.getCurrentUrl();
	
	driver.get("http://admin:admin@192.168.0.1/");
	new WebDriverWait(driver, 20).until(
		      webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
	driver.switchTo().defaultContent();
	System.out.println("Clicking Network");
	new WebDriverWait(driver, 20).until(
		      webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
	driver.switchTo().frame(driver.findElement(By.xpath("html/frameset/frameset/frame[1]")));
	driver.findElement(By.xpath("html/body/menu/ol[4]/a")).click();
	TimeUnit.SECONDS.sleep(8);
	driver.switchTo().defaultContent();
	new WebDriverWait(driver, 20).until(
		      webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
	driver.switchTo().frame(driver.findElement(By.xpath("html/frameset/frameset/frame[2]")));
	driver.findElement(By.xpath("html/body/form/table/tbody/tr[27]/td[2]/input[2]")).click();
	new WebDriverWait(driver, 20).until(
		      webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
	TimeUnit.SECONDS.sleep(8);
	driver.findElement(By.xpath("html/body/form/table/tbody/tr[27]/td[2]/input[1]")).click();
	///
//	//
	///
	///html/body/form/table/tbody/tr[27]/td[2]/input[2];
	///html/body/form/table/tbody/tr[27]/td[2]/input[1];
	System.out.println("trial successful");
	//driver.findElement(By.xpath("/html/body/form/table/tbody/tr[26]/td[3]/input")).click();
	//driver.findElement(By.xpath("html/body/form/table/tbody/tr[29]/td[3]/input")).click();
	//System.out.println("trial successful 2");
	TimeUnit.SECONDS.sleep(8);
	driver.navigate().to(originalSite);
}

public void playZen(ChromeDriver driver) throws InterruptedException{
	((JavascriptExecutor)driver).executeScript("window.open();");
	tabs = new ArrayList<String> (driver.getWindowHandles());
	driver.switchTo().window(tabs.get(tabs.size()-1));

	driver.get("chrome-extension://fdcgdnkidjaadafnichfpabhfomcebme/index.html");
	new WebDriverWait(driver, 30).until(
		      webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
	TimeUnit.SECONDS.sleep(3);
	driver.get("chrome-extension://fdcgdnkidjaadafnichfpabhfomcebme/index.html");
	new WebDriverWait(driver, 30).until(
		      webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
	System.out.println("i did");
try{
	WebDriverWait wait2 = new WebDriverWait(driver,8);
	WebElement aboutMe1= wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/main/app-campaign/app-transparent-campaign/div/app-header/div/a")));
	driver.findElement(By.xpath("/html/body/app-root/main/app-campaign/app-transparent-campaign/div/app-header/div/a")).click();
}
catch(Exception f){}
	WebDriverWait wait50 = new WebDriverWait(driver,20);
	WebElement aboutMe50= wait50.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/main/app-home/div/div[2]/div[4]/div/a")));
	driver.findElement(By.xpath("/html/body/app-root/main/app-home/div/div[2]/div[4]/div/a")).click();
System.out.println("flawless");
	WebDriverWait wait500 = new WebDriverWait(driver,20);
	WebElement aboutMe500= wait500.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/main/app-servers/div/div[4]/mat-tab-group/div/mat-tab-body[1]/div/div/div[1]/app-servers-list/div[1]/p/span[1]")));
	driver.findElement(By.xpath("/html/body/app-root/main/app-servers/div/div[4]/mat-tab-group/div/mat-tab-body[1]/div/div/div[1]/app-servers-list/div[2]")).click();
	TimeUnit.SECONDS.sleep(2);
	// switch back to main screen      
driver.close();
}

public void generalManager(int manage) throws InterruptedException{
	System.setProperty("webdriver.chrome.driver", "bin\\BrowserStack\\chromedriver.exe");
//driverArray=driver1;
//driverArray[0]=driver1;
	Map<String, String> mobileEmulation = new HashMap<>();
	String[] deviceList={"Pixel 2","Pixel 3","Pixel 4","Nexus 5","Nexus 6"};
	mobileEmulation.put("deviceName", "Galaxy S5");
	ChromeOptions options = new ChromeOptions();
	options.setPageLoadStrategy(PageLoadStrategy.NONE);
	
	options.addExtensions(new File("bin\\BrowserStack\\extension_7_5_0_0.crx"));
	options.setExperimentalOption("mobileEmulation", mobileEmulation);
	options.setExperimentalOption("useAutomationExtension", false);
	options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
	
	options.addArguments("--enable-blink-features=ExperimentalProductivityFeatures");
	options.addArguments("--window-size=1920x1080");
//	options.addArguments("--enable-blink-features=gyroscope");
	//options.addArguments("--enable-blink-features=accelerometer");
	options.addArguments("--disable-blink-features=AutomationControlled");
	//options.addArguments("--auto-open-devtools-for-tabs");
	driverArray[0] = new ChromeDriver(options);
	ChromeDriver driver= driverArray[0];
	boolean current=driver==driverArray[0];
	System.out.println(current+"mother of god");
for(int i=0;i<100;i++){
	try{
	if(i!=0){
		tabs = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
		//disconnectZen(driver);
		driver.switchTo().window(tabs.get(0));
		
	}tabs = new ArrayList<String> (driver.getWindowHandles());
	driver.switchTo().window(tabs.get(0));
	try{
	driver.get("https://temp-mail.org");}
	
	catch(Exception e){if(manage>1){manage=0;changeIpPlus(driver);}}
	//closeAllTabs();	
	tabs = new ArrayList<String> (driver.getWindowHandles());
	if(i==0){
	while(tabs.size()>0){
		try{
			tabs = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));

		driver.close();
		break;

		}
		catch(Exception e){}
		}
	}
	tabs = new ArrayList<String> (driver.getWindowHandles());
	driver.switchTo().window(tabs.get(0));
	 ((JavascriptExecutor)driver).executeScript("window.open();");
	 tabs = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.get("https://mobile.twitter.com/i/flow/signup");
		 ((JavascriptExecutor)driver).executeScript("window.open();");
		 tabs = new ArrayList<String> (driver.getWindowHandles());
			driver.switchTo().window(tabs.get(2));
			driver.get(aliLink);
			WebDriverWait wait = new WebDriverWait(driver,20);
			WebElement aboutMe;
			aboutMe= wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("ModalChallengStage--goBtn--3aVcaz6")));
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}
			WebElement open1 = driver.findElement(By.className("ModalChallengStage--goBtn--3aVcaz6"));
			open1.click();
			WebDriverWait wait1 = new WebDriverWait(driver,20);
			aboutMe= wait1.until(ExpectedConditions.visibilityOfElementLocated(By.className("link-option")));
			WebElement moreOptions = driver.findElement(By.className("link-option"));
			moreOptions.click();
			
			driver.switchTo().window(tabs.get(0));
			WebDriverWait wait3 = new WebDriverWait(driver,20);
			aboutMe= wait3.until(ExpectedConditions.visibilityOfElementLocated(By.id("mail")));
			signUpOkay=0;
			lol=0;
			String email=null;
			int loopCount=0;
			while(signUpOkay!=1) {
				try {
					String TxtBoxContent = driver.findElement(By.id("mail")).getAttribute("value");
					//System.out.println("Printing " + TxtBoxContent);
					email=TxtBoxContent;
				//	int noBoth=0;
					try{
					if(email.indexOf(".com")!=-1||email.indexOf(".net")!=-1) {System.out.println(email);break;}
					if(email.indexOf("oading")==-1){loopCount++;if(loopCount>30){loopCount=0;throw new Exception("e");}}
					}
					catch(Exception p){
						loopCount++;
						if(loopCount>40) {
							TimeUnit.SECONDS.sleep(1);
							break;
						//driver.get("https://temp-mail.org");
						}
					}
				}
				catch(Exception e) {
				try {
					TimeUnit.SECONDS.sleep(2);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				lol=1+lol;
			//	System.out.println("caught worked");
				if(lol>=12) {System.out.println("lol worked");break;}
				}
			}
			driver.switchTo().window(tabs.get(1));
			signUpOkay=0;
			lol=0;
			int half=1/2;
			while(signUpOkay!=1) {
				try {
					driver.findElement(By.xpath("/html/body/div/div/div/div[2]/main/div/div/div/div[2]/div[2]/div/div[2]/label/div/div[2]/div/input")).sendKeys("egherhfhger");
				
					//driver.findElement(By.xpath("/html/body/div/div/div/div[2]/main/div/div/div/div[2]/div[2]/div/div[2]/label/div/div[2]/div/input")).sendKeys("egherhfhger");

					driver.findElement(By.xpath("/html/body/div/div/div/div[2]/main/div/div/div/div[2]/div[2]/div/div[5]/div[3]/div/label/div/div[2]/div/input")).sendKeys("02021956");

					driver.findElement(By.xpath("/html/body/div/div/div/div[2]/main/div/div/div/div[2]/div[2]/div/div[4]/span")).click();
					
					driver.findElement(By.xpath("/html/body/div/div/div/div[2]/main/div/div/div/div[2]/div[2]/div/div[3]/label/div/div[2]/div/input")).sendKeys(email);
					
					break;
				}
				catch(Exception e) {
					//TimeUnit.SECONDS.sleep(1);
					lol=1+lol;
					System.out.println("caught seems shit here");
					try{
						WebElement labadi =driver.findElement(By.xpath("/html/body/div/div/div/div[2]/main/div/div/div/div[2]/div[2]/div/div/div[1]/span"));
						System.out.println(labadi.getText());
						if(labadi.getText().indexOf("Add a phone number")!=-1){throw new Exception("Exception message");}
						
					}
					catch(Exception z){}
					if(lol>1){
						try{
						WebDriverWait wait12 = new WebDriverWait(driver,20);
						WebElement aboutMe12;
						aboutMe12= wait12.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div/div[2]/main/div/div/div/div[2]/div[2]/div/div[3]/label/div/div[2]/div/input")));}
						catch(Exception l){driver.get(driver.getCurrentUrl());}
						
					
					}
					if(lol>=18) {System.out.println("lol worked");break;}
					}
			}
			signUpOkay=0;
			lol=0;
			int lal=0;
			while(0!=1) {
//				System.out.println(next1.getAttribute("aria-disabled"));
				try {
					TimeUnit.SECONDS.sleep(half);
					WebElement next1= driver.findElement(By.xpath("/html/body/div/div/div/div[2]/main/div/div/div/div[2]/div[1]/div/div/div/div[3]/div"));
					next1.click();
			//*		System.out.println("next click worked");
					lal++;
					if(lal>20){break;}
				}
				catch(Exception e) {
					//TimeUnit.SECONDS.sleep(1);
			//*		System.out.println("next caught worked");
					lol++;
					if(lol>1) {break;}
							}
				}
			lol=0;
			System.out.println("checkmark1"+lol);
					lol=0;
					try {
					WebElement ruined=  driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/div/div/div/div[2]/div[1]"));
					ruined.click();}
					catch(Exception e){}
					
					try{
					WebElement next3= driver.findElement(By.xpath("/html/body/div/div/div/div[2]/main/div/div/div/div[2]/div[2]/div/div/div[5]"));
					next3.click();
					}
					catch(Exception f){TimeUnit.SECONDS.sleep(1);}
					
					if(i==0){
					//loginZen(driver);
					}
					driver.switchTo().window(tabs.get(0));
				
					driver.switchTo().window(tabs.get(0));

					String code=null;
					
					signUpOkay=0;
					lol=0;
					System.out.println("trying to get code");
					while(signUpOkay!=1) {
						try {
							((JavascriptExecutor)driver).executeScript("window.scrollBy(0,100)");
							WebDriverWait wait4 = new WebDriverWait(driver,15);
							wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/main/div[1]/div/div[2]/div[2]/div/div[1]/div/div[4]/ul/li[2]/div[1]/a/span[4]")));
							WebElement vcode= driver.findElement(By.xpath("/html/body/main/div[1]/div/div[2]/div[2]/div/div[1]/div/div[4]/ul/li[2]/div[1]/a/span[4]"));
							 System.out.println(vcode.getText());
										code= vcode.getText().substring(0,6);//* System.out.println(vcode.getText());
						//*	System.out.println(code);
							break;
						}
						catch(Exception e) {
							TimeUnit.SECONDS.sleep(1);
							lol=1+lol;
				//*			System.out.println("temp mail caught worked");
							if(lol==2){
								//disconnectZen(driver);
								tabs = new ArrayList<String> (driver.getWindowHandles());
							driver.switchTo().window(tabs.get(0));}
							if(lol>=3) {System.out.println("lol worked");break;}
							}
						}
					WebElement vcode= driver.findElement(By.xpath("/html/body/main/div[1]/div/div[2]/div[2]/div/div[1]/div/div[4]/ul/li[2]/div[1]/a/span[4]"));			
				//*	System.out.println(vcode.getText());
					//playZen(driver);
					driver.switchTo().window(tabs.get(1));
	//https://mobile.twitter.com/i/flow/signup
					driver.findElement(By.xpath("/html/body/div/div/div/div[2]/main/div/div/div/div[2]/div[2]/div/div/div[2]/label/div/div[2]/div/input")).sendKeys(code);
					driver.findElement(By.xpath("/html/body/div/div/div/div[2]/main/div/div/div/div[2]/div[1]/div/div/div/div[3]/div")).click();
					signUpOkay=0;
					lol=0;
					int numberCondition=0;
					while(signUpOkay!=1) {
						try {
							driver.findElement(By.xpath("/html/body/div/div/div/div[2]/main/div/div/div/div[2]/div[2]/div/div[2]/div/label/div/div[2]/div/input")).sendKeys("kuchbhi12");
							break;
						}
						catch(Exception e) {
				     int exceptionRectifier=0;
							TimeUnit.SECONDS.sleep(1);
							lol=1+lol;
					//*		System.out.println("requiring phone number");
							try{
								WebElement labadi =driver.findElement(By.xpath("/html/body/div/div/div/div[2]/main/div/div/div/div[2]/div[2]/div/div/div[1]/span"));
					//*			System.out.println(labadi.getText());
								String currentText=labadi.getText();
								if(currentText.indexOf("a phone number")!=-1){exceptionRectifier=1;numberCondition++;changeIpPlus(driver);break;}
								
							}
							catch(Exception z){
								
								if(exceptionRectifier==1){
								}
							}
							if(lol>=9) {System.out.println("broke the code cuz of phone num");numberCondition++;changeIpPlus(driver);break;}
							}
						}
					if(numberCondition!=0){
				//*	System.out.println("Closing all tabs");
						closeAllTabs(driver);
						TimeUnit.SECONDS.sleep(1);
						
						
		}
					else{
						int red=0;
						while(0!=1) {
//					//*		System.out.println(next1.getAttribute("aria-disabled"));
							try {
								TimeUnit.SECONDS.sleep(1);
							WebElement next4= driver.findElement(By.xpath("/html/body/div/div/div/div[2]/main/div/div/div/div[2]/div[1]/div/div/div/div[3]/div"));
							if(next4.getText().indexOf("ex")==-1){break;}
								next4.click();
					//*			System.out.println("trying next4");
								lol++;
								if(lol>=15) {break;}
							}
							catch(Exception e) {
								
						//*		System.out.println("next4 exception");
								red++;
								if(red>2) {break;}
								//if(lol>10) {System.out.println("next4 didn't work");}
								}
							}
						//disconnectZen(driver);
						driver.switchTo().window(tabs.get(2));
						WebElement clicktwitter = driver.findElement(By.xpath("/html/body/div/section/div/div[3]/a"));clicktwitter.click();
						tabs = new ArrayList<String> (driver.getWindowHandles());
						driver.switchTo().window(tabs.get(3));
						WebDriverWait wait4 = new WebDriverWait(driver,20);
						aboutMe= wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/form/fieldset/input[1]")));
						new WebDriverWait(driver, 20).until(
							      webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
						TimeUnit.SECONDS.sleep(1);
						driver.findElement(By.xpath("/html/body/div[2]/div/form/fieldset/input[1]")).click();
						driver.switchTo().window(tabs.get(2));
						int sawOpen=0;
						for(int f=0;f<50;f++){
							try{
								open1 = driver.findElement(By.className("ModalChallengStage--goBtn--3aVcaz6"));
							sawOpen++;break;}
							catch(Exception e){}
							try{
								 open1 = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[4]"));
								 sawOpen++;break;}
							catch(Exception e){}
							TimeUnit.SECONDS.sleep(1);
						}
					
								
							if(sawOpen==0)	{
									try{
										//TimeUnit.SECONDS.sleep(10);
									clicktwitter = driver.findElement(By.xpath("/html/body/div/section/div/div[3]/a"));clicktwitter.click();
									tabs = new ArrayList<String> (driver.getWindowHandles());
									driver.switchTo().window(tabs.get(tabs.size()-1));
									wait4 = new WebDriverWait(driver,10);
									aboutMe= wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/form/fieldset/input[1]")));
									new WebDriverWait(driver, 10).until(
										      webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
								//	TimeUnit.SECONDS.sleep(1);
									driver.findElement(By.xpath("/html/body/div[2]/div/form/fieldset/input[1]")).click();
									}
									catch(Exception p) {}
								}
						driver.switchTo().window(tabs.get(2));
						lol=0;
						int didItWork=0;
						while(0!=1){
							if(System.currentTimeMillis()-clickTime[0]>50000){
								System.out.println("took this much sec for click"+(System.currentTimeMillis()-clickTime[0])/1000);
								break;
							}
						}
						TimeUnit.SECONDS.sleep(constant+1);
						while(0!=1){
							if(System.currentTimeMillis()-clickTime[0]>50000){
								System.out.println("took this much sec for click"+(System.currentTimeMillis()-clickTime[0])/1000);
								break;
							}
						}
						System.out.println(constant);
						clickTime[0]=System.currentTimeMillis()+30000;
				while(0!=1){
							
							try{driver.findElement(By.className("ModalChallengStage--goBtn--3aVcaz6")).click();didItWork++;
							}
							catch(Exception e){break;}
						}

				while(0!=1){
							
							try{driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[4]")).click();didItWork++;
							}
							catch(Exception e){TimeUnit.SECONDS.sleep(0);break;}
				}
						int unlimited=0;
						int countThankYou=0;
						int something=0;
						int verifySystemError=0;
						int sliderExceptionCounter=0;
						for(int j=0;j<60;j++) {
							try{
							try{
								if(
							driver.findElement(By.tagName("body")).getText().indexOf("at this time")!=-1||driver.findElement(By.tagName("body")).getText().indexOf("country")!=-1){
							 System.out.println("I found one system error");
							 verifySystemError++;
							 if(verifySystemError==2){
								 driver.get(driver.getCurrentUrl());
									new WebDriverWait(driver, 20).until(
										      webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
									driver.findElement(By.className("MoneyBag--money-bag-open-text-wrapper--_PjDTlz")).click();
							 }
							 if(verifySystemError>10){clickTime[0]=0;
							 System.out.println("click time when broken"+clickTime[0]); System.out.println("system error broke");break;}
							 }
									
							}
							catch(Exception o){}
						
								try{driver.switchTo().defaultContent();
									
									try{driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div[2]/div[2]/iframe")));
										if(1==1){
									WebDriverWait wait500 = new WebDriverWait(driver,30);
									WebElement aboutMe500= wait500.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[2]/div[1]/div/div[2]/center/div/div/div[1]/div/div[3]")));
									
									{
										driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div[2]/center/div/div/div[1]/div/div[3]")).click();
									WebElement slider= driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div[2]/center/div/div/div[1]/div/div[3]"));
							if(1==0){	
									Actions move = new Actions(driver);
									Action action = move.dragAndDropBy(slider, 250, 0).build();
									action.perform();}
							TouchActions fuckingAction=new TouchActions(driver);
							fuckingAction.singleTap(slider);
							fuckingAction.move(200,0);
							fuckingAction.build();
							fuckingAction.perform();
									System.out.println("slider worked");driver.switchTo().defaultContent();}
										if(0==1){
											
										WebDriverWait wait300 = new WebDriverWait(driver,30);
										WebElement aboutMe300= wait300.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[2]/div[1]/div/div[2]/center/div/div/div[1]/div/div[3]")));

										driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div[2]/center/div/div/div[1]/div/div[3]")).click();
										WebElement slider= driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div[2]/center/div/div/div[1]/div/div[3]"));
										Actions move = new Actions(driver);
										move.clickAndHold(slider);
										move.moveByOffset(245,0);
										move.perform();
										System.out.println("slider worked");driver.switchTo().defaultContent();
	
										}}
									}
									catch(Exception woah){sliderExceptionCounter++;driver.switchTo().defaultContent();woah.printStackTrace();
									}
									}
									catch(Exception good){driver.switchTo().defaultContent();}
						}
							catch(Exception f){}
							
							//try{driver.findElement(By.xpath("/html/body/div[2]"));driver.getCurrentUrl();}
						//	catch(Exception p){}
						try {
							driver.switchTo().defaultContent();
							TimeUnit.SECONDS.sleep(1);
							try {open1 = driver.findElement(By.className("ModalChallengStage--goBtn--3aVcaz6"));
							unlimited++; if(unlimited>5){break;}
							open1.click();
							TimeUnit.SECONDS.sleep(1);
							}
							catch(Exception e) {
							WebElement open2= driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[4]"));
							open2.click();}
							System.out.println("last open worked somehow");
							
							//didItWork=1;
							didItWork++;
							if(didItWork==1){
								
							//TimeUnit.SECONDS.sleep(2);
							//driver.get(whichLink);
								}
							if(didItWork>10){}
								
						}
						
						catch(Exception e){
							TimeUnit.SECONDS.sleep(1);
								
								
							if(didItWork>0){
					//			System.out.println("couldn't find last open");
							//if(something==1){System.out.println("breaking");break;}
							
								try {
									System.out.println("I came to Click");
									driver.findElement(By.className("MainContent--twoLineOverflow--44fRZ6C"));
									System.out.println("i hope it worked. cick+");
									personalClickTime[0]=System.currentTimeMillis();
									clickTime[0]=System.currentTimeMillis();
									System.out.println("combined ="+clickTime[0]+"personal ="+personalClickTime[0]);
									something=1;
									break;
									}
								catch(Exception p){//System.out.println(p);
								countThankYou++;}
							if(lol>20){break;}
							
							lol++;}
						}
					}
						driver.switchTo().window(tabs.get(0));
						closeAllTabs(driver);
					}
}
	
catch(Exception e){e.printStackTrace();//connectZen(0,driver);
closeAllTabs(driver);}
	}
//	loginZen();
}
public void run(){
	
	try {
		if(oldCondition==1){
	oldManager(aliLink);}
	} catch (Exception e1) {
		// TODO Auto-generated catch block
	}
	try {
		//ChromeDriver driver1[]={null};
		//generalManager(driverArray);
		int manage=0;
		for(int i=0;i<100;i++){
			try{
		generalManager(manage);
			}
			catch(Exception e){
				e.printStackTrace();				
			driverArray[0].quit();	
			}
		}
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public void start() {
    System.out.println("Thread started");
	 Thread guruthread = new Thread(this);
	 guruthread.start();
	  // guruthread.run();  
}
public void interrupt(){Thread.currentThread().interrupt();}
public void closeAllTabs(ChromeDriver driver) throws InterruptedException{
	
	try{
	while(tabs.size()!=1){
    tabs = new ArrayList<String> (driver.getWindowHandles());
	driver.switchTo().window(tabs.get(tabs.size()-1));
	//driver.manage().getCookies();
	//TimeUnit.SECONDS.sleep(1);
	//((JavascriptExecutor)driver).executeScript("(function () {\r\n    var cookies = document.cookie.split(\"; \");\r\n    for (var c = 0; c < cookies.length; c++) {\r\n        var d = window.location.hostname.split(\".\");\r\n        while (d.length > 0) {\r\n            var cookieBase = encodeURIComponent(cookies[c].split(\";\")[0].split(\"=\")[0]) + '=; expires=Thu, 01-Jan-1970 00:00:01 GMT; domain=' + d.join('.') + ' ;path=';\r\n            var p = location.pathname.split('/');\r\n            document.cookie = cookieBase + '/';\r\n            while (p.length > 0) {\r\n                document.cookie = cookieBase + p.join('/');\r\n                p.pop();\r\n            };\r\n            d.shift();\r\n        }\r\n    }\r\n})();");  
	if(tabs.size()!=1){      
		driver.close();}
	}
	}
	catch(Exception e){}
	tabs = new ArrayList<String> (driver.getWindowHandles());
	driver.switchTo().window(tabs.get(tabs.size()-1));
	driver.get("chrome://settings/clearBrowserData");
	//WebDriverWait wait2 = new WebDriverWait(driver,10);
	//WebElement aboutMe1= wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//settings-ui")));
	//driver.findElement(By.id("clearBrowsingDataConfirm")).click();
	//driver.switchTo().activeElement();
    //driver.findElement(By.id("* /deep/ #clearBrowsingDataConfirm")).click();
  
	//driver.findElement(By.xpath("//settings-ui")).sendKeys(Keys.ENTER);
	TimeUnit.SECONDS.sleep(3);
	//injectjQuery();
	//((JavascriptExecutor)driver).executeScript("$.noConflict();");
	((JavascriptExecutor)driver).executeScript("document.querySelector('settings-ui').shadowRoot.querySelector('settings-main').shadowRoot.querySelector('settings-basic-page').shadowRoot.querySelector('settings-section > settings-privacy-page').shadowRoot.querySelector('settings-clear-browsing-data-dialog').shadowRoot.querySelector('#clearBrowsingDataDialog').querySelector('#clearBrowsingDataConfirm').click()");
}

public void loginZen(ChromeDriver driver) throws InterruptedException{
	tabs = new ArrayList<String> (driver.getWindowHandles());
	driver.switchTo().window(tabs.get(tabs.size()-1));
	((JavascriptExecutor)driver).executeScript("window.open();");
	tabs = new ArrayList<String> (driver.getWindowHandles());
	driver.switchTo().window(tabs.get(tabs.size()-1));

	driver.get("chrome-extension://fdcgdnkidjaadafnichfpabhfomcebme/index.html");
	new WebDriverWait(driver, 30).until(
		      webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
	TimeUnit.SECONDS.sleep(3);
	driver.get("chrome-extension://fdcgdnkidjaadafnichfpabhfomcebme/index.html");
	new WebDriverWait(driver, 30).until(
		      webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
	System.out.println("i did");
	try{
		WebDriverWait wait2 = new WebDriverWait(driver,5);
		WebElement aboutMe1= wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/main/app-campaign/app-transparent-campaign/div/app-header/div/a")));
		driver.findElement(By.xpath("/html/body/app-root/main/app-campaign/app-transparent-campaign/div/app-header/div/a")).click();
	}
	catch(Exception f){}
		//WebDriverWait wait50 = new WebDriverWait(driver,20);
		//WebElement aboutMe50= wait50.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/main/app-home/div/div[2]/div[4]/div/a")));
		
	driver.findElement(By.xpath("/html/body/app-root/main/app-home/div/div[1]/a[1]")).click();
	TimeUnit.SECONDS.sleep(1);
	driver.findElement(By.xpath("/html/body/app-root/main/app-menu/div/div[2]/a")).click();
	driver.findElement(By.xpath("/html/body/app-root/main/app-login/div/div/form/div[1]/input")).sendKeys("chopourian1996@gmail.com");
	driver.findElement(By.xpath("/html/body/app-root/main/app-login/div/div/form/div[2]/input")).sendKeys("Maxx@0147");
	driver.findElement(By.xpath("/html/body/app-root/main/app-login/div/div/form/div[4]/button")).click();
	WebDriverWait wait50 = new WebDriverWait(driver,20);
	WebElement aboutMe50= wait50.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/main/app-home/div/div[2]/div[4]/div/a")));
	//driver.findElement(By.xpath("/html/body/app-root/main/app-home/div/div[2]/div[4]/div/a")).click();
	//WebDriverWait wait500 = new WebDriverWait(driver,20);
	//WebElement aboutMe500= wait500.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/main/app-servers/div/div[4]/mat-tab-group/div/mat-tab-body[1]/div/div/div[1]/app-servers-list/div[1]/p/span[1]")));
	driver.close();
}
public void connectZen(int number,ChromeDriver driver) throws InterruptedException{
	tabs = new ArrayList<String> (driver.getWindowHandles());
	driver.switchTo().window(tabs.get(tabs.size()-1));
	driver.switchTo().window(tabs.get(0));
	((JavascriptExecutor)driver).executeScript("window.open();");
	tabs = new ArrayList<String> (driver.getWindowHandles());
	driver.switchTo().window(tabs.get(tabs.size()-1));

	driver.get("chrome-extension://fdcgdnkidjaadafnichfpabhfomcebme/index.html");
	WebDriverWait wait50 = new WebDriverWait(driver,20);
	WebElement aboutMe50= wait50.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/main/app-home/div/div[2]/div[4]/div/a")));
	driver.findElement(By.xpath("/html/body/app-root/main/app-home/div/div[2]/div[4]/div/a")).click();
	WebDriverWait wait500 = new WebDriverWait(driver,20);
	WebElement aboutMe500= wait500.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/main/app-servers/div/div[4]/mat-tab-group/div/mat-tab-body[1]/div/div/div[1]/app-servers-list/div[1]/p/span[1]")));
	int randomNum = ThreadLocalRandom.current().nextInt(0, 73 + 1);
	
	int[]perfectNumber={9,12,16,23,34,44,50,54,58,73,74,76};
	int randomFromList = ThreadLocalRandom.current().nextInt(1, perfectNumber.length);
	
	if(number!=0){randomNum = perfectNumber[randomFromList];}
	while(randomNum==17||randomNum==65||randomNum==43||randomNum==30||randomNum==29||randomNum==35||randomNum==75){
		randomNum = ThreadLocalRandom.current().nextInt(2, 73 + 1);
		}
	driver.findElement(By.xpath("/html/body/app-root/main/app-servers/div/div[4]/mat-tab-group/div/mat-tab-body[1]/div/div/div[1]/app-servers-list/div["+randomNum+"]")).click();
	System.out.println("choosen Random number "+randomNum);
	TimeUnit.SECONDS.sleep(2);
	// switch back to main screen      
driver.close();
}
public void disconnectZen(ChromeDriver driver) throws InterruptedException{
	driver.switchTo().window(tabs.get(0));
	((JavascriptExecutor)driver).executeScript("window.open();");
	tabs = new ArrayList<String> (driver.getWindowHandles());
	driver.switchTo().window(tabs.get(tabs.size()-1));

	driver.get("chrome-extension://fdcgdnkidjaadafnichfpabhfomcebme/index.html");
	WebDriverWait wait = new WebDriverWait(driver,20);
	WebElement aboutMe;
	aboutMe= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/main/app-home/div/div[2]/div[3]")));
	TimeUnit.SECONDS.sleep(1);
	driver.findElement(By.xpath("/html/body/app-root/main/app-home/div/div[2]/div[3]")).click();
	driver.close();
}
public void DoOld(String email, String password,String aliLink1,ChromeDriver driver) throws InterruptedException {
	
	
	{
	tabs = new ArrayList<String> (driver.getWindowHandles());
	driver.switchTo().window(tabs.get(0)); // switch back to main screen        
	System.out.println(aliLink1 +"prining alilink2");
	//driver.get(aliLink1);
	WebElement open1;
	 WebDriverWait wait450 = new WebDriverWait(driver,30);
		
		wait450.until(ExpectedConditions.visibilityOfElementLocated(By.className("ModalChallengStage--goBtn--3aVcaz6")));
		try{
			open1=driver.findElement(By.className("ModalChallengStage--goBtn--3aVcaz6"));open1.click();
		}
		catch(Exception e){TimeUnit.SECONDS.sleep(0);}
	WebDriverWait wait = new WebDriverWait(driver,20);
	WebElement aboutMe;

	WebDriverWait wait1 = new WebDriverWait(driver,20);
	aboutMe= wait1.until(ExpectedConditions.visibilityOfElementLocated(By.className("link-option")));
	WebElement moreOptions = driver.findElement(By.className("link-option"));
	moreOptions.click();
	
	WebDriverWait wait2 = new WebDriverWait(driver,30);
	wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[2]/div/div/div[1]/input")));

	driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div[1]/input")).sendKeys(email);
	driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div[2]/input")).sendKeys(password);
	TimeUnit.SECONDS.sleep(3);
	driver.get(driver.getCurrentUrl());
	  
	wait2 = new WebDriverWait(driver,30);
	wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[2]/div/div/div[1]/input")));
	  driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div[1]/input")).sendKeys(email);
			driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div[2]/input")).sendKeys(password);
		   
	int  hope= 0;
		while(0!=1) {
			try { 
				driver.findElement(By.xpath("/html/body/div/div[2]/div/div/button")).click();
				System.out.println("click done");
				TimeUnit.SECONDS.sleep(1);
				hope++;
				if(hope>15) {itsOver=10;System.out.println("pretended that login failed");return;}
				else {itsOver=2;}
			}
			
			catch(Exception e) {System.out.println("exception recived");break;}
			
		}
		
		
		//connectZen(0,driver);
		tabs = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
		
	lol=0;
	int didItWork=0;
	TimeUnit.SECONDS.sleep(2);
	clickTime[0]=System.currentTimeMillis();
	personalClickTime[0]=System.currentTimeMillis();
while(0!=1){
		
		try{driver.findElement(By.className("ModalChallengStage--goBtn--3aVcaz6")).click();didItWork++;
		}
		catch(Exception e){TimeUnit.SECONDS.sleep(0);break;}
	}

while(0!=1){
		
		try{driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[4]")).click();didItWork++;
		}
		catch(Exception e){TimeUnit.SECONDS.sleep(0);break;}
	}

	int unlimited=0;
	int countThankYou=0;
	int something=0;
	int verifySystemError=0;
	for(int j=0;j<60;j++) {
		try{
			if(
		driver.findElement(By.tagName("body")).getText().indexOf("at this time")!=-1||driver.findElement(By.tagName("body")).getText().indexOf("country")!=-1){
		 System.out.println("I found one system error");
		 verifySystemError++;
		 itsOver=1;
		 if(verifySystemError>1){clickTime[0]=0;
		 System.out.println("click time when broken"+clickTime[0]);break;}
		 }
				
		}
		catch(Exception o){}
	
			try{driver.switchTo().defaultContent();
				driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div[2]/div[2]/iframe")));
				try{
					if(1==1){
				WebDriverWait wait500 = new WebDriverWait(driver,30);
				WebElement aboutMe500= wait500.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[2]/div[1]/div/div[2]/center/div/div/div[1]/div/div[3]")));

				driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div[2]/center/div/div/div[1]/div/div[3]")).click();
				WebElement slider= driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div[2]/center/div/div/div[1]/div/div[3]"));
				Actions move = new Actions(driver);
				Action action = move.dragAndDropBy(slider, 250, 0).build();
				action.perform();
				System.out.println("slider worked");driver.switchTo().defaultContent();}
					if(0==1){
					WebDriverWait wait500 = new WebDriverWait(driver,30);
					WebElement aboutMe500= wait500.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[2]/div[1]/div/div[2]/center/div/div/div[1]/div/div[3]")));

					driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div[2]/center/div/div/div[1]/div/div[3]")).click();
					WebElement slider= driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div[2]/center/div/div/div[1]/div/div[3]"));
					Actions move = new Actions(driver);
					move.clickAndHold(slider);
					move.moveByOffset(245,0);
					move.perform();
					System.out.println("slider worked");driver.switchTo().defaultContent();

					}}
				
				catch(Exception woah){driver.switchTo().defaultContent();//woah.printStackTrace();
				}
				}
				catch(Exception good){}
			
		
		try{driver.findElement(By.xpath("/html/body/div[2]"));driver.getCurrentUrl();}
		catch(Exception p){}
	try {
		driver.switchTo().defaultContent();
		TimeUnit.SECONDS.sleep(1);
		try {open1 = driver.findElement(By.className("ModalChallengStage--goBtn--3aVcaz6"));
		unlimited++; if(unlimited>5){break;}
		open1.click();
		TimeUnit.SECONDS.sleep(1);
		}
		catch(Exception e) {
		WebElement open2= driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[4]"));
		open2.click();}
		System.out.println("last open worked somehow");
		
		//didItWork=1;
		didItWork++;
		if(didItWork==1){
			
		//TimeUnit.SECONDS.sleep(2);
		//driver.get(whichLink);
			}
		if(didItWork>10){}
			
	}
	
	catch(Exception e){
		TimeUnit.SECONDS.sleep(1);
			
			
		if(didItWork>0){
//			System.out.println("couldn't find last open");
		//if(something==1){System.out.println("breaking");break;}
		
			try {
				driver.findElement(By.className("MainContent--twoLineOverflow--44fRZ6C"));
				System.out.println("i hope it worked. cick+");
				itsOver=1;
				personalClickTime[0]=System.currentTimeMillis();
				clickTime[0]=System.currentTimeMillis();
				System.out.println("combined ="+clickTime[0]+"personal ="+personalClickTime[0]);
				something=1;
				break;
				}
			catch(Exception p){//System.out.println(p);
			countThankYou++;}
		if(lol>20){break;}
		
		lol++;}
	}
}
	}
}
public void oldManager(String aliLink) throws IOException, CsvException, InterruptedException{
	CSVReader reader = new CSVReader(new FileReader("bin\\BrowserStack\\oldlist.csv"));
	List<String[]> csvBody = reader.readAll();
	
	//writer.writeAll(csvBody);
	reader.close();
	this.aliLink=aliLink;
	
	try{
		System.setProperty("webdriver.chrome.driver", "bin\\BrowserStack\\chromedriver.exe");

		Map<String, String> mobileEmulation = new HashMap<>();
		mobileEmulation.put("deviceName", "Pixel 3");
		ChromeOptions options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		options.addExtensions(new File("bin\\BrowserStack\\extension_2_0_0_0.crx"));
		options.addExtensions(new File("bin\\BrowserStack\\extension_7_5_0_0.crx"));
		options.addArguments("--auto-open-devtools-for-tabs");
		options.setExperimentalOption("mobileEmulation", mobileEmulation);
		options.setExperimentalOption("useAutomationExtension", false);
		options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		options.addArguments("--disable-blink-features=AutomationControlled");
		driverArray[0] = new ChromeDriver(options);
		driverArray[0].manage().window().setSize(new Dimension(411,823));
		ChromeDriver driver= driverArray[0];
		driver.get(aliLink);
		boolean current=driver==driverArray[0];
		System.out.println(current+"mother of god");
		tabs = new ArrayList<String> (driver.getWindowHandles());
		while(tabs.size()>0){
			try{
				tabs = new ArrayList<String> (driver.getWindowHandles());
			driver.switchTo().window(tabs.get(1));

			driver.close();
			break;

			}
			catch(Exception e){}
			}
		driver.switchTo().window(tabs.get(0));
		loginZen(driver);
		driver.switchTo().window(tabs.get(0));
	for(int i=1;i<csvBody.size();i++){
		
		if(csvBody.get(i)[2].indexOf("1")==-1){
		for(int p=0;p<3;p++) {
			System.out.println(aliLink +"printing alilink here");
			tabs = new ArrayList<String> (driver.getWindowHandles());
			driver.switchTo().window(tabs.get(0));
			driver.get(aliLink);
			try{
			DoOld(csvBody.get(i)[0],csvBody.get(i)[1],aliLink,driver);
			}
			catch(Exception e){
				
			}
		//	connectZen(75);
			//disconnectZen(driver);
			closeAllTabs(driver);
			System.out.println(itsOver +"This was ur shit value for itsover");
			if(itsOver==1) {itsOver=2;csvBody.get(i)[2]="1";CSVWriter writer = new CSVWriter(new FileWriter("bin\\BrowserStack\\oldlist.csv"));writer.writeAll(csvBody);
			writer.flush();
			writer.close();System.out.println("Broke through itsOver.");closeAllTabs(driver);break;}
			 else if (itsOver>=10){closeAllTabs(driver);
			 //connectZen(75,driver);disconnectZen(driver);
			 }
			
			
		}
		
		if(i%4==0){
			int lol=0;
			int breaker=0;
			while(lol!=1 || breaker>6){
			try{
				//changeIpPlus();
				//driver.get("https://google.com");
				lol++;
			}
			catch(Exception e){
				breaker++;
			}
			}
		}
		
		}
		
	}}
	catch(Exception p){
		p.printStackTrace();
	}
	
	System.out.println("I did it complete.");
	
}

}


public class FinalHitPlus {
	static int oldCondition1=0;
	static int oldCondition2=0;
	
	
	static long[]clickTime={System.currentTimeMillis()};
	static long[]sharingClickTime={System.currentTimeMillis()};
	public static void main(String args[]) throws InterruptedException{
	//	oldCondition1= Integer.parseInt(args[1]);
		if(0==1){
			System.setProperty("webdriver.chrome.driver", "bin\\BrowserStack\\chromedriver.exe");
			
				Map<String, String> mobileEmulation = new HashMap<>();
				String[] deviceList={"Pixel 2","Pixel 3","Pixel 4","Nexus 5","Nexus 6"};
				mobileEmulation.put("deviceName", "Nexus 5");
				ChromeOptions options = new ChromeOptions();
				//options.setPageLoadStrategy(PageLoadStrategy.NONE);
				options.addExtensions(new File("bin\\BrowserStack\\extension_7_5_0_0.crx"));
				options.setExperimentalOption("mobileEmulation", mobileEmulation);
				options.setExperimentalOption("useAutomationExtension", false);
				options.addArguments("--auto-open-devtools-for-tabs");
				options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
				options.addArguments("--disable-blink-features=AutomationControlled");
				ChromeDriver driver = new ChromeDriver(options);
				driver.get("C:\\Users\\Kaa Hai Sasura\\Desktop\\Bonus Buddies.html");
				ArrayList<String> tabs= new ArrayList<String>();
				tabs = new ArrayList<String> (driver.getWindowHandles());
				
				while(tabs.size()>0){
					try{
						tabs = new ArrayList<String> (driver.getWindowHandles());
					driver.switchTo().window(tabs.get(1));

					driver.close();
					break;

					}
					catch(Exception e){}
					}
				driver.switchTo().window(tabs.get(0));				
				TimeUnit.SECONDS.sleep(100000);}
		
		ChromeDriver[] driver1={null};
		ChromeDriver[] driver2={null};
		//long[] newClickTime= {System.currentTimeMillis()};
		
	   clickTime[0]=System.currentTimeMillis();
	   long[] personalClickTime1={System.currentTimeMillis()};
	   long[] personalClickTime2={System.currentTimeMillis()};
	RunIt firstRun=new RunIt(args,driver1,oldCondition1);
	firstRun.clickTime=clickTime;
	firstRun.personalClickTime=personalClickTime1;
	firstRun.start();
	String newArgs[]={"https://a.aliexpress.com/_mPxz4hN"};
	newArgs=args;
	RunIt secondRun=new RunIt(newArgs,driver2,oldCondition2);
	secondRun.clickTime=clickTime;
	secondRun.personalClickTime=personalClickTime2;
	//secondRun.start();

	if(oldCondition2==0&&oldCondition2==1&&1==0){
	while(true){
		TimeUnit.SECONDS.sleep(5);
		if(System.currentTimeMillis()-personalClickTime1[0]>300000){
			if(System.currentTimeMillis()-personalClickTime1[0]>300000){
				driver1[0].quit();
				
				firstRun.interrupt();
				   personalClickTime1[0]=System.currentTimeMillis();
					firstRun=new RunIt(args,driver1,oldCondition1);
					firstRun.clickTime=clickTime;
					firstRun.personalClickTime=personalClickTime1;
					firstRun.start();
				//	TimeUnit.SECONDS.sleep(100);
			//	firstRun.interrupt();
					System.out.println("frist closed and started");
				//driver2[0].quit();
			}
			
	}
		if(System.currentTimeMillis()-personalClickTime2[0]>300000){
			driver2[0].quit();
			secondRun.interrupt();
			secondRun=new RunIt(newArgs,driver2,oldCondition2);
			secondRun.clickTime=clickTime;
			personalClickTime2[0]=System.currentTimeMillis();
			secondRun.personalClickTime=personalClickTime2;
			secondRun.start();
			//TimeUnit.SECONDS.sleep(100);
			System.out.println("second closed and started");
		}
	}
	}
		
	
	}
}
