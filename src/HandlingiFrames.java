import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.gargoylesoftware.htmlunit.javascript.host.Screen;

public class HandlingiFrames {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kredd\\Desktop\\se drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	
		// HANDLING IFRAMES***********
		
		//driver.get("http://demo.automationtesting.in/Frames.html");
		/*String heading = driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div/div/div/div[2]/h1")).getText();
		System.out.println(heading);	*/
		
		/*int framecount = driver.findElements(By.tagName("iframe")).size();
		System.out.println(framecount);*/
		
		/*driver.switchTo().frame(0);
		String heading = driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div/div/div/div[2]/h1")).getText();
		System.out.println(heading);*/
		
		//To switch to second frame*****
		//driver.switchTo().defaultContent();
		
		/*driver.switchTo().frame(1);
		String heading = driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div/div/div/div[2]/h1")).getText();
		System.out.println(heading);*/
		
		//Based on name
		//driver.switchTo().frame("SingleFrame");
		
		//SELENIUM HEADLESS BROWSER TEST***********
		//html unit driver
		/*WebDriver driver = new HtmlUnitDriver();
		driver.get("https://www.keycdn.com/blog/headless-browsers");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());*/
		
		//chrome driver
		
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\kredd\\Desktop\\se drivers\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("headless"); //OR option.setHeadless(ture);
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.keycdn.com/blog/headless-browsers");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());*/
		
		//firefox(gecko) driver
		
		/*System.setProperty("webdriver.gecko.driver", "C:\\Users\\kredd\\Desktop\\se drivers\\geckodriver.exe");
		FirefoxOptions option = new FirefoxOptions();  
		option.setHeadless(true);
		WebDriver driver = new FirefoxDriver(option);
		driver.get("https://www.keycdn.com/blog/headless-browsers");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());*/
		
		//******verify if dropdown are sorted or not**********************
		
		/*driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		WebElement dropdown = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div/div/div[2]/div[2]/div/div/p/select"));
		Select se = new Select(dropdown);
		//OR
		
		
		Select se = new Select(driver.findElement(By.id("select-demo")));
		List<WebElement> options = se.getOptions();
		List values = new ArrayList();
		
		for(WebElement opt:options) {
			values.add(opt.getText());
		}
		
		System.out.println(values);
		
		List tempvalues = new ArrayList(values);
		Collections.sort(tempvalues);
		System.out.println(tempvalues);
		boolean sort = values.equals(tempvalues);
		
		if(sort) {
			System.out.println("dropdown is sorted");
		}
			else {
			System.out.println("dropdown is Not sorted");
		}*/
		
		//*****HANDLE MULTIPE WINDOWS AND  TABS***********
		
		/*driver.get("file:///C:/Users/user/Desktop/Selenium.html");

        driver.findElement(By.xpath("//*[@id=\'c\']")).click();
        driver.findElement(By.xpath("//*[@id=\'java\']")).click();
        driver.findElement(By.xpath("//*[@id=\'python\']")).click();

        Set<String> windows = driver.getWindowHandles();
        int size = windows.size();
        System.out.println(windows);
        String ids[] = new String[size];

        Iterator<String> itr = windows.iterator();

        for(int i=0; i<size; i++) {
          ids[i] = itr.next();
        }

        System.out.println("Parent window Title : "+driver.getTitle());

        driver.switchTo().window(ids[2]);
        System.out.println("2nd Child window Title : "+driver.getTitle());

        driver.switchTo().window(ids[3]);
        System.out.println("3rd Child window Title : "+driver.getTitle());

        driver.switchTo().window(ids[1]);
        System.out.println("1st Child window Title : "+driver.getTitle());

        driver.switchTo().window(ids[0]);
        System.out.println("Parent window Title : "+driver.getTitle());
        driver.quit();*/
		
		//******MOUSE AND KEYBOARD EVENTS*********
		/*driver.get("file:///C:/Users/user/Desktop/Selenium.html");

        Actions act = new Actions(driver);*/
        
        //below code used to move cursor******
        /*WebElement element1 =  driver.findElement(By.xpath("//*[@id=\'box6\']"));
        WebElement element2 = driver.findElement(By.xpath("//*[@id=\'box106\']"));
        WebElement element3 = driver.findElement(By.xpath("//*[@id=\'header\']/nav/div/div[2]/ul/li[6]/ul/li[1]/ul/li[2]/a"));

        act.moveToElement(element1).build().perform();
        act.moveToElement(element2).build().perform();
        act.moveToElement(element3).click().build().perform();

        act.moveToElement(element1).moveToElement(element2).moveToElement(element3).click().build().perform();*/
       
        //Below code is used to click and hold**********
       /* WebElement source =  driver.findElement(By.xpath("//*[@id=\'box1\']"));
        WebElement destination = driver.findElement(By.xpath("//*[@id=\'box101\']"));
        act.clickAndHold(source).moveToElement(destination).release().build().perform();*/
        
        //Below code is used to drag and drop....and....clickandhold.***
       /* WebElement source2 =  driver.findElement(By.xpath("//*[@id=\'box1\']"));
        WebElement destination2 = driver.findElement(By.xpath("//*[@id=\'box101\']"));

        act.dragAndDrop(source, destination).build().perform();
        act.clickAndHold(source2).moveToElement(destination2).release().build().perform();*/
        
        //below code is used to right click********
       /* Thread.sleep(5000);
        WebElement button = driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
        act.contextClick(button).build().perform();
        act.moveToElement(driver.findElement(By.xpath("/html/body/ul/li[5]/span"))).click().build().perform();*/
        
        //below codes is used to hold keys like shift,ctrl...*****
        
       /* WebElement name = driver.findElement(By.id("name"));
        act.keyDown(name, Keys.SHIFT).sendKeys("abhishek").build().perform();*/
		
        //FINDOUT BROKEN LINKS****************
        
		/*driver.get("https://de.wikipedia.org/wiki/Wikipedia:Hauptseite");

        List<WebElement> links = driver.findElements(By.tagName("a"));

        System.out.println(links.size());

       for(int i=0; i<links.size(); i++) {
          WebElement element = links.get(i);
          String url = element.getAttribute("href");

          URL link=new URL(url);

          HttpURLConnection httpcon = (HttpURLConnection) link.openConnection();
          httpcon.connect();

          int rescode = httpcon.getResponseCode();

          if(rescode>=400) {
            System.out.println(url + "---> is broken link");
          }else {
            System.out.println(url + "---> is valid link");
          }
        }*/
		
		//DOWNLOAD FILES USING SELENIUM***************
		
		//BELOW CODE FOR CHROME****
		/*driver.get("http://demo.automationtesting.in/FileDownload.html");
	      driver.findElement(By.xpath("//*[@id=\"textbox\"]")).sendKeys("Testing text file");
	      driver.findElement(By.xpath("//*[@id=\"createTxt\"]")).click();
	      driver.findElement(By.xpath("//*[@id=\"link-to-download\"]")).click();*/
		
		//BELOW CODE FOR FIREFOX****
		 /* FirefoxProfile profile = new FirefoxProfile();
		    profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/pdf");
		    profile.setPreference("browser.download.manager.showWhenStarting", false);
		    profile.setPreference("pdfjs.disabled", true);

		    FirefoxOptions option = new FirefoxOptions();
		    option.setProfile(profile);

		      System.setProperty("webdriver.gecko.driver", "E:\\Drivers\\geckodriver.exe");
		    WebDriver driver1 = new FirefoxDriver(option);
		    driver1.manage().window().maximize();

		      driver1.get("http://demo.automationtesting.in/FileDownload.html");
		      driver1.findElement(By.xpath("//*[@id=\"textbox\"]")).sendKeys("Testing text file");
		      driver1.findElement(By.xpath("//*[@id=\"createTxt\"]")).click();
		      driver1.findElement(By.xpath("//*[@id=\"link-to-download\"]")).click();*/
		
		//Create Your Own Dynamic XPATH in selenium**************
		//driver.get("file:///C:/Users/user/Desktop/Selenium.html");

	    // driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Abhishek");
	    // driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Abhishek");

	    // driver.findElement(By.xpath("//button[text()='Login with Google']")).click();
	    //driver.findElement(By.xpath("button[contains(text(),'kjasg')]")).click();
	    //driver.findElement(By.xpath("button[starts-with(text(),'kjasg')]")).click();
	    //driver.findElement(By.xpath("button[ends-with(text(),'kjasg')]")).click();

	    //input[@id='login']/following-sibling::button
	    //input[@id='login']/preceding-sibling::button

	    //input[@id='login']/parent::form

	    //input[@type='text' and @placeholder='surname']
		
		//SUKULI TOOL**************
		
		 /*driver.get("file:///C:/Users/user/Desktop/Selenium.html");

		    Actions act = new Actions(driver);

		    act.click(driver.findElement(By.xpath("//*[@id=\'file\']"))).build().perform();

		    Pattern p1 = new Pattern("C:\\Users\\user\\Desktop\\ImageRecog\\textbox.PNG");
		    Pattern p2 = new Pattern("C:\\Users\\user\\Desktop\\ImageRecog\\openbotton.PNG");

		    Screen sc = new Screen();

		    sc.type(p1, "E:\\Abhishek Project\\Base Paper final.pdf");
		    sc.click(p2);*/
	
		//SIKULI VIDEO****
		
		/*public static void main(String[] args) throws FindFailed {

		    System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();

		    driver.get("file:///C:/Users/user/Desktop/Selenium.html");

		    Pattern p1 = new Pattern("C:\\Users\\user\\Desktop\\Sikuli\\play.PNG");
		    Pattern p2 = new Pattern("C:\\Users\\user\\Desktop\\Sikuli\\mute.PNG");
		    Pattern p3 = new Pattern("C:\\Users\\user\\Desktop\\Sikuli\\maximize.PNG");

		    Screen sc = new Screen();

		    sc.click(p1);
		    sc.click(p2);
		    sc.click(p3);

		  }*/
		

		//DATA DRIVEN TEST*************
		
		/*FileInputStream file = new FileInputStream("C:\Users\kredd\Downloads\tests-example.xlsx");

	    XSSFWorkbook wb = new XSSFWorkbook(file);

	    XSSFSheet s = wb.getSheetAt(0);

	    int row = s.getLastRowNum();

	    int column = s.getRow(0).getLastCellNum();

	    for(int i=0; i<=row; i++) { // read to use each row
	      XSSFRow currentrow = s.getRow(i);

	      for(int j=0; j<column; j++) { 	// read to use each cell on current row
	        String value = currentrow.getCell(j).toString();
	        System.out.print(value+"   ");
	      }
	      System.out.println();
	    }*/
		
		//another excel********
		
		/*System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("http://localhost:8084/KothaAbhishekProject/");

    FileInputStream file = new FileInputStream("C:\\Users\\user\\Desktop\\EmpInfo.xlsx");
    XSSFWorkbook workbook = new XSSFWorkbook(file);
    XSSFSheet sheet = workbook.getSheet("Sheet3");

    int rowcount = sheet.getLastRowNum();

    for(int i=1; i<=rowcount; i++) {
      XSSFRow row = sheet.getRow(i);

      String cell1 = row.getCell(0).getStringCellValue();
      String cell2 = row.getCell(1).getStringCellValue();
      String cell3 = row.getCell(2).getStringCellValue();
      int cell4 = (int)row.getCell(3).getNumericCellValue();
      String cell5 = row.getCell(4).getStringCellValue();

      driver.findElement(By.xpath("//input[@name='name']")).sendKeys(cell1);
      driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(cell2);
      driver.findElement(By.xpath("//input[@name='email']")).sendKeys(cell3);
      driver.findElement(By.xpath("//input[@name='number']")).sendKeys(String.valueOf(cell4));
//    		driver.findElement(By.xpath("//input[@name='gender']")).sendKeys(cell5).click();

      List radiobutton = driver.findElements(By.name("gender"));
      int size = radiobutton.size();

      for(int j=0; j<size; j++) {
        String val = radiobutton.get(j).getAttribute("value");

        if(val.equalsIgnoreCase(cell5)) {
          radiobutton.get(j).click();
          break;
        }

      }

      driver.findElement(By.xpath("//input[@name='Register']")).click();

      driver.get("http://localhost:8084/KothaAbhishekProject/");

    }
    driver.close();

    workbook.close();*/
		
		//ROBOT CLASS***************
		
		 /*System.setProperty("webdriver.gecko.driver", "E:\\Drivers\\geckodriver.exe");
		    WebDriver driver = new FirefoxDriver();
		    driver.manage().window().maximize();
		    driver.get("http://demo.automationtesting.in/FileDownload.html");

		    driver.findElement(By.xpath("//*[@id=\"textbox\"]")).sendKeys("Kotha Abhishek");
		    driver.findElement(By.xpath("//*[@id=\"createTxt\"]")).click();
		    driver.findElement(By.xpath("//*[@id=\"link-to-download\"]")).click();

		    Robot robot = new Robot();
		    Thread.sleep(3000);
		    robot.keyPress(KeyEvent.VK_DOWN);
		    Thread.sleep(3000);
		    robot.keyPress(KeyEvent.VK_TAB);
		    Thread.sleep(3000);
		    robot.keyPress(KeyEvent.VK_TAB);
		    Thread.sleep(3000);
		    robot.keyPress(KeyEvent.VK_TAB);
		    Thread.sleep(3000);
		    robot.keyPress(KeyEvent.VK_ENTER);*/
		
		//Upload or Download using Robot Class in selenium**************
		
		/*System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("file:///C:/Users/user/Desktop/Selenium.html");

	    Actions act = new Actions(driver);
	    act.click(driver.findElement(By.xpath("//*[@id=\"upload\"]"))).build().perform();

	    Robot robot = new Robot();

	    StringSelection select = new StringSelection("C:\\Users\\user\\Desktop\\Abhishek.jpg");
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select, null); //ctrl+c

	    robot.keyPress(KeyEvent.VK_CONTROL);
	    robot.keyPress(KeyEvent.VK_V);   //ctrl+v
	    robot.keyRelease(KeyEvent.VK_CONTROL);
	    robot.keyRelease(KeyEvent.VK_V);
	    robot.keyPress(KeyEvent.VK_ENTER);
	    robot.keyRelease(KeyEvent.VK_ENTER);*/
		
		//DATE PICKER************
		
		/* System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://jqueryui.com/datepicker/");

    String date = "32-December-2020";
    String arr[] = date.split("-");			// index 0

    driver.switchTo().frame(0);			// frame swift

    driver.findElement(By.xpath("//*[@id=\'datepicker\']")).click();

    String month = driver.findElement(By.xpath("//*[@id=\'ui-datepicker-div\']/div/div/span[1]")).getText();
    String year = driver.findElement(By.xpath("//*[@id=\'ui-datepicker-div\']/div/div/span[2]")).getText();
    int rows = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr")).size();
    int cols=7;

    boolean flag=false;

    while(true) {
      if(month.equals(arr[1]) && year.equals(arr[2])) {
        for(int i=1; i<=rows; i++) {			// rows tr
          for(int j=1; j<=cols; j++) {		// columns
            String day = driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr["+i+"]/td["+j+"]")).getText();

            if(day.equals(arr[0])) {
              driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr["+i+"]/td["+j+"]")).click();
              flag=true;
              break;		// columns stop (inner for loop)
            }
          }
        if(flag) {				// stops rows
          break;				// rows stops (outer for loop)
        }
        }
        if(flag) {
          System.out.println("success");
          break;				// while loop stop
        }else {
          System.out.println("Please Enter Correct Date");
          driver.close();
          break;
        }
      }else {
        driver.findElement(By.xpath("//*[@id=\'ui-datepicker-div\']/div/a[2]/span")).click();
        month = driver.findElement(By.xpath("//*[@id=\'ui-datepicker-div\']/div/div/span[1]")).getText();
        year = driver.findElement(By.xpath("//*[@id=\'ui-datepicker-div\']/div/div/span[2]")).getText();
        rows = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr")).size();
      }

    }*/
		//2nd method
		
/* System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://jqueryui.com/datepicker/#other-months");

    String date = "29-February-2024";
    String arr[] = date.split("-");			// index 0

    driver.switchTo().frame(0);			// frame swift

    driver.findElement(By.xpath("//*[@id=\'datepicker\']")).click();

    String month = driver.findElement(By.xpath("//*[@id=\'ui-datepicker-div\']/div/div/span[1]")).getText();
    String year = driver.findElement(By.xpath("//*[@id=\'ui-datepicker-div\']/div/div/span[2]")).getText();

    boolean flag=false; 	// to stop program execution

    while(true) {
      if(month.equals(arr[1]) && year.equals(arr[2])) {

      List days = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td[not(contains(@class,' ui-datepicker-other-month '))]"));
      int size = days.size();

      for(int i=0; i<size; i++) {			// iterate LIST
        WebElement currentday = days.get(i);	// reads current webelement
        String day = currentday.getText();

        if(day.equals(arr[0])) {
          currentday.click();
          flag=true;
          break;		// stops for loop
        }
      }
        if(flag) {
          System.out.println("Success");
          break;			// stops while loop
        }else {
          System.out.println("Please Enter Valid Date");
          driver.close();
          break;			// stops while loop
        }
      }else {
        driver.findElement(By.xpath("//*[@id=\'ui-datepicker-div\']/div/a[2]/span")).click();
        month = driver.findElement(By.xpath("//*[@id=\'ui-datepicker-div\']/div/div/span[1]")).getText();
        year = driver.findElement(By.xpath("//*[@id=\'ui-datepicker-div\']/div/div/span[2]")).getText();
      }

    }*/
		
		//3rd method*****************
		
		/* System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://jqueryui.com/datepicker/#dropdown-month-year");

    String date = "29-Feb-2024";		//My birthday
    String arr[] = date.split("-");			// index 0

    driver.switchTo().frame(0);			// frame swift

    driver.findElement(By.xpath("//*[@id=\'datepicker\']")).click();

    Select month = new Select(driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]")));

    month.selectByVisibleText(arr[1]);

    Select year = new Select(driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]")));

    year.selectByVisibleText(arr[2]);

    List days = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
    int size = days.size();

    boolean flag=false;

    for(int i=0; i<size; i++) {
      WebElement currentday = days.get(i);
      String day = currentday.getText();

      if(day.equals(arr[0])) {
        currentday.click();
        flag=true;
        break;
      }
    }
    if(flag) {
      System.out.println("Success");
    }else {
      driver.close();
      System.out.println("Please Enter a Valid Date");
    }*/
		
		
		

		

	}

}
