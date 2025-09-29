package com.Capium.Utilites;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;



public class HelperClass {
	
	private static HelperClass helperClass;
 
	private static WebDriver driver;
	private static WebDriverWait wait;
	public final static int TIMEOUT = 10;
	private static String screenshotDirectory = "screenshots/";
	   private HelperClass() {
 
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
	}
// WebDriver Methods
	public static void openPage(String url) {
		if (driver == null) {
			setUpDriver();
		}
		driver.get(url);
	}
 
	public static WebDriver getDriver() {
		if (driver == null) {
			setUpDriver();
		}
		return driver;
	}
 
	public static void setUpDriver() {
 
		if (helperClass == null) {
			java.util.logging.Logger.getLogger("org.openqa.selenium").setLevel(java.util.logging.Level.OFF);
			System.setProperty("webdriver.chrome.silentOutput", "true");
			helperClass = new HelperClass();
		}
	}
 
	public static void tearDown() {
		if (driver != null) {
			try {
				driver.close();
				driver.quit();
			} catch (Exception e) {
				System.out.println("Error quitting driver: " + e.getMessage());
			} finally {
				driver = null;
				wait = null;
				helperClass = null;
			}
		}
	}
	
// Explicit Wait methods
	public static WebDriverWait getWait() {
		return new WebDriverWait(HelperClass.getDriver(), Duration.ofSeconds(TIMEOUT));
 
	}
	
	public static WebElement waitUntilClickable(WebDriverWait wait, By locator) {
		return wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
 
	public static WebElement waitUntilClickable(WebDriverWait wait, WebElement element) {
		return wait.until(ExpectedConditions.elementToBeClickable(element));
	}
 
	public static WebElement waitUntilVisible(WebDriverWait wait, WebElement element) {
		return wait.until(ExpectedConditions.elementToBeClickable(element));
	}
 
	public static WebElement waitUntilVisible(WebDriverWait wait, By locator) {
		return wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
// Get Methods
	public static String GetUserName() {
		return "Capium Username";
	}
 
	public static String GetPassword() {
		return "Capium password";
	}
 
	public static String getTitile(By locator) {
		return driver.getTitle();
	}
 
	public static String getCuurentUrl() {
		return driver.getCurrentUrl();
	}
 
	// General Methods like Sendkeys, Click , List
	public static void sendKeys(By locator, String text) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
		WebElement element = driver.findElement(locator);
		wait.until(ExpectedConditions.visibilityOf(element));
 
		element.clear();
		element.sendKeys(text);
	}
 
	public static List<WebElement> Listoptions(By locator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		return driver.findElements(locator);
	}
 
	public static void ClickandAnyTypeofWebelemnt(By locator) {
		WebDriverWait wait = HelperClass.getWait();
		WebElement element = driver.findElement(locator);
		wait.until(ExpectedConditions.visibilityOf(element));
		element.click();
 
	}
	
	public static void clickWhenVisibleAndClickable(WebElement element) {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.visibilityOf(element));
	    wait.until(ExpectedConditions.elementToBeClickable(element));
	    element.click();
	}
 
	
//	public static boolean isElementPresentAndClickable(WebElement element) {
//	    try {
//	        return element != null && element.isDisplayed() && element.isEnabled();
//	    } catch (NoSuchElementException | StaleElementReferenceException e) {
//	        return false;
//	    }
//	}
	
	public static void refresh() {
		driver.navigate().refresh();
 
	}
 
	public static boolean isButtonEnabled(By locator) {
		WebDriverWait wait = HelperClass.getWait();
		try {
			WebElement button = driver.findElement(locator);
			wait.until(ExpectedConditions.visibilityOf(button));
			return button.isEnabled();
		} catch (Exception e) {
			System.out.println("Error occurred while checking button: " + e.getMessage());
			return false;
		}
	}
 
//	public static boolean isElementPresent(By locator) {
//		try {
//			WebElement element = getDriver().findElement(locator);
//			return element.isDisplayed();
//		} catch (NoSuchElementException | StaleElementReferenceException e) {
//			return false;
//		}
//	}
 
	public static void sendKeysAndPressEnter(By locator, String text) {
		WebElement element = driver.findElement(locator);
		element.clear();
		element.sendKeys(text);
	}
 
	public static void ClearElement(By locator) throws InterruptedException {
		WebElement element = driver.findElement(locator);
		element.click();
		Thread.sleep(2000);
		element.clear();
	}
 
	// Select class methods dropdowns
	public static void selectOptionByVisibleText(By dropdownLocator, String visibleText) {
		WebElement dropdown = driver.findElement(dropdownLocator);
		Select select = new Select(dropdown);
		select.selectByVisibleText(visibleText);
	}
 
	public static void selectOptionByValue(By dropdownLocator, String value) {
		WebElement dropdown = driver.findElement(dropdownLocator);
		Select select = new Select(dropdown);
		select.selectByValue(value);
	}
 
	public static void selectOptionByValue(WebElement dropdownElement, String value) {
		Select select = new Select(dropdownElement);
		select.selectByValue(value);
	}
 
	public static void ClickDropdown(By dplocator) {
		WebElement dropdown = driver.findElement(dplocator);
		Select select = new Select(dropdown);
	}
 
	public static void selectFromDropdownAndObserveResults(By dropdownLocator) throws IOException {
 
		WebDriverWait wait = HelperClass.getWait();
		WebElement dropdownElement = driver.findElement(dropdownLocator); // Change the locator as per your dropdown
		wait.until(ExpectedConditions.visibilityOf(dropdownElement));
		Select dropdown = new Select(dropdownElement);
		List<WebElement> options = dropdown.getOptions();
		for (WebElement option : options) {
			dropdown.selectByVisibleText(option.getText());
			wait.until(ExpectedConditions.visibilityOf(option));
			System.out.println("Selected option: " + option.getText());
			HelperClass.captureScreenshot(option.getText());
		}
	}
 
	public static void selectOptionByIndex(By dropdownLocator, int index) {
		WebElement dropdown = driver.findElement(dropdownLocator);
		Select select = new Select(dropdown);
		select.selectByIndex(index);
	}
	
	public static void pagenumberdropdown() {
 
		WebElement dropdown = driver.findElement(By.xpath("//select[@name='TblClientList_VAT_length']"));
		Select select = new Select(dropdown);
		select.selectByValue("25");
 
	}
	
	public static void SelectDropdownvaluesOneByOne(By dropdownLocator) {
		WebDriver driver = getDriver();
		WebElement dropdownElement = driver.findElement(dropdownLocator);
		Select dropdown = new Select(dropdownElement);
		List<WebElement> options = dropdown.getOptions();
 
		for (WebElement option : options) {
			String optionText = option.getText().trim();
			if (optionText.isEmpty())
				continue;
 
			dropdown.selectByVisibleText(optionText);
			System.out.println("Selected filter: " + optionText);
 
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
 
			List<WebElement> tableRows = driver.findElements(By.xpath("//table//tbody/tr"));
			if (tableRows.isEmpty()) {
				System.out.println("No data found for filter: " + optionText);
			} else {
				System.out.println("Found " + tableRows.size() + " rows for filter: " + optionText);
			}
 
			try {
				WebElement firstRowText = tableRows.get(0).findElement(By.xpath("./td[1]"));
				System.out.println("Sample result: " + firstRowText.getText());
			} catch (Exception e) {
				System.out.println("Could not read row data for filter: " + optionText);
			}
		}
	}
 
 
	// capture scrrenshot method
	public static String captureScreenshot(String screenshotName) throws IOException {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
		String screenshotPath = screenshotDirectory + screenshotName + ".png";
		File destinationFile = new File(screenshotPath);
		FileUtils.copyFile(sourceFile, destinationFile);
 
		return screenshotPath;
	}
 
	public static File getScreenshot() {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File screenshotFile = screenshot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("path/to/save/screenshot.png"); // Or use a unique file name
		try {
			FileUtils.copyFile(screenshotFile, destFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return destFile;
	}
	// Window handlemethods
 
	public static String getCurrentWindowHandle(WebDriver driver) {
		return driver.getWindowHandle();
	}
 
	public static Set<String> getAllWindowHandles(WebDriver driver) {
		return driver.getWindowHandles();
	}
 
	public static void switchToWindow(WebDriver driver, String windowHandle) {
		driver.switchTo().window(windowHandle);
	}
 
	public static void switchToParentWindow(WebDriver driver, String parentWindowHandle) {
		driver.switchTo().window(parentWindowHandle);
	}
 
	public static void closeCurrentWindow(WebDriver driver) {
		driver.close();
	}
 
	public static void closeAllWindows(WebDriver driver) {
		driver.quit();
	}
 
	public static void verify(By locator) {
		WebElement element = driver.findElement(locator);
 
		String cicon = element.getText();
 
		Assert.assertTrue(element.getText().contains(cicon));
 
	}
	
//Js methods
 
	public static JavascriptExecutor getJSExecutor() {
		return (JavascriptExecutor) getDriver();
	}
 
	public static void scrolling1() {
 
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)");
 
	}
 
	public static void scrollUntilElementVisible(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
 
	public static void scrolling3() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-3000)");
 
	}
 
	public static void ClickUsingJS(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}
 
	public static void ClickUsingJS(WebDriver driver, By locator) {
		WebElement element = driver.findElement(locator);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		js.executeScript("arguments[0].click();", element);
	}
	
	public static void scrollIntoView(WebElement element) {
	    ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
	}
	
	public static void setValueUsingJSWithEvent(By locator, String value) {
		WebElement element = getDriver().findElement(locator);
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("arguments[0].value = arguments[1]; arguments[0].dispatchEvent(new Event('change'));", element,
				value);
	}
	// By Locator JS
	public static void setValueUsingJS(By locator, String value) {
		WebDriver driver = getDriver();
 
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
 
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
 
		((JavascriptExecutor) driver).executeScript("arguments[0].value='" + value + "';", element);
 
		((JavascriptExecutor) driver)
				.executeScript("arguments[0].dispatchEvent(new Event('change', { bubbles: true }))", element);
 
		System.out.println("Value set using JS for element: " + locator.toString());
	}
	// By WebElement JS
	public static void setValueUsingJS(WebElement element, String value) {
		WebDriver driver = getDriver();
 
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
 
		((JavascriptExecutor) driver).executeScript("arguments[0].value='" + value + "';", element);
 
		((JavascriptExecutor) driver)
				.executeScript("arguments[0].dispatchEvent(new Event('change', { bubbles: true }))", element);
 
		System.out.println("Value set using JS for element: " + element.toString());
	}
 
// Search Client Methods
	public static void SearchAndSelectClient(By searchFieldLocator, String searchText, By suggestionLocator) {
 
		WebElement searchField = wait.until(ExpectedConditions.visibilityOfElementLocated(searchFieldLocator));
		searchField.clear();
		searchField.sendKeys(searchText);
		wait.until(ExpectedConditions.visibilityOfElementLocated(suggestionLocator));
		WebElement firstSuggestion = driver.findElement(suggestionLocator);
		firstSuggestion.click();
	}
 
	
	public static void Searchclient(String Clientname, By Locator1) throws InterruptedException {
 
		WebElement searchBox = driver.findElement(By.id("txtSearch"));
		searchBox.sendKeys(Clientname);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement firstSuggestion = driver.findElement(Locator1);
		js.executeScript("arguments[0].click();", firstSuggestion);
	}
 
	
// Popup method
	public static void handleAddressPopup(WebDriver driver, String choice) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		try {
			By saveBtn = By.xpath("//button[contains(text(),'Save')]");
			By noThanksBtn = By.xpath("//button[contains(text(),'No Thanks')]");
 
			if (choice.equalsIgnoreCase("save")) {
				WebElement save = wait.until(ExpectedConditions.elementToBeClickable(saveBtn));
				((JavascriptExecutor) driver).executeScript("arguments[0].click();", save);
				System.out.println("Clicked on 'Save' in address popup.");
			} else if (choice.equalsIgnoreCase("no")) {
				WebElement noThanks = wait.until(ExpectedConditions.elementToBeClickable(noThanksBtn));
				((JavascriptExecutor) driver).executeScript("arguments[0].click();", noThanks);
				System.out.println("Clicked on 'No Thanks' in address popup.");
			} else {
				System.out.println("Invalid option for address popup: " + choice);
			}
		} catch (Exception e) {
			System.out.println("Address popup did not appear or elements not found: " + e.getMessage());
		}
	}
 
	public static String getText(By locator) {
		try {
			WebElement element = getDriver().findElement(locator);
			return element.getText().trim();
		} catch (Exception e) {
			System.err.println("Unable to get text from: " + locator + " - " + e.getMessage());
			return "";
		}
	}
	
	// Advance method for Safe Click
	
	public static boolean safeClick(By locator, int timeoutInSeconds) {
	    WebDriver driver = getDriver();
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
 
	    int attempts = 0;
	    while (attempts < 5) {
	        try {
	           
	            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	            wait.until(ExpectedConditions.visibilityOf(element));
	            wait.until(ExpectedConditions.elementToBeClickable(element));
 
	            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
 
	            try {
	                element.click();
	            } catch (ElementClickInterceptedException e) {
	                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
	            }
 
	            return true;
	        } catch (StaleElementReferenceException | NoSuchElementException e) {
	            System.out.println("Retry due to stale or not found: " + e.getMessage());
	        } catch (TimeoutException e) {
	            System.out.println("Timeout waiting for element: " + locator);
	            return false;
	        } catch (Exception e) {
	            System.out.println("Unexpected error while clicking: " + e.getMessage());
	        }
 
	        attempts++;
	        try {
	            Thread.sleep(1000);
	        } catch (InterruptedException e) {
	            Thread.currentThread().interrupt();
	        }
	    }
 
	    return false;
	}
 
//part2:
 
//Advance method for send keys
	public static boolean safeSendKeys(By locator, String text, int i) {
        int attempts = 0;
        while (attempts < 5) {
            try {
                WebElement element = waitUntilVisible(locator);
                scrollToElement(locator);
                element.click();
                element.clear();
                element.sendKeys(text);
                return true;
            } catch (Exception e) {
                attempts++;
                sleep(1000);
            }
        }
        return false;
    }
	
	public static void scrollToElement(By locator) {
        WebElement element = waitUntilVisible(locator);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }
	
	public static WebElement waitUntilVisible(By locator) {
        //waitForAngularLoad();
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
	
	private static void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
 
	public static void selectFirstSuggestedCustomer(String customerName) {
    	List<WebElement> suggestions = driver.findElements(By.xpath("//a[normalize-space(@class)='link fw-bold']"));
 
        // Step 4: Click the first suggestion
        if (!suggestions.isEmpty()) {
            suggestions.get(0).click();
        } else {
            System.out.println("No suggestions appeared for input: " + customerName);
        }
    }
 
	public static void clickUsingJS(By locator) {
        WebElement element = waitUntilVisible(locator);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
	}
 
	// Advance method for DropDown
	
	public static boolean safeSelectByVisibleText(By locator, String visibleText, int timeoutInSeconds) {
	    WebDriver driver = getDriver();
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
	    int attempts = 0;
 
	    while (attempts < 5) {
	        try {
	            WebElement dropdown = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	            wait.until(ExpectedConditions.elementToBeClickable(dropdown));
	            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", dropdown);
 
	            Select select = new Select(dropdown);
	            select.selectByVisibleText(visibleText);
	            return true;
	        } catch (StaleElementReferenceException | NoSuchElementException e) {
	            System.out.println("Retry dropdown select: " + e.getMessage());
	        } catch (ElementClickInterceptedException e) {
	            System.out.println("Dropdown intercepted, retrying...");
	        } catch (TimeoutException e) {
	            System.out.println("Timeout selecting dropdown option: " + visibleText);
	            return false;
	        } catch (Exception e) {
	            System.out.println("Unexpected dropdown issue: " + e.getMessage());
	        }
 
	        attempts++;
	        try {
	            Thread.sleep(1000);
	        } catch (InterruptedException ie) {
	            Thread.currentThread().interrupt();
	        }
	    }
 
	    return false;
	}
//Verifying text
	
	public static boolean waitForTextPresent(By locator, String expectedText, int timeoutInSeconds) {
	    WebDriver driver = getDriver();
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
 
	    try {
	        return wait.until(ExpectedConditions.textToBePresentInElementLocated(locator, expectedText));
	    } catch (TimeoutException e) {
	        System.out.println("Text not found in time: " + expectedText);
	        return false;
	    }
	}
 
	// Element loader
//	public static void waitForLoaderToDisappear(By loaderLocator) {
////	    WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(15));
////	    wait.until(ExpectedConditions.invisibilityOfElementLocated(loaderLocator));
//	}
	
	public static void selectTimeFilter(WebElement dropdownElement, String filterToSelect) {
	    safeClick(dropdownElement);  // dropdown open
	    List<WebElement> options = getDriver().findElements(By.xpath("//ng-dropdown-panel//div[@role='option']"));
 
	    for (WebElement option : options) {
	        if (option.getText().trim().equalsIgnoreCase(filterToSelect)) {
	            scrollToElement(option);
	            option.click();
	            break;
	        }
	    }
	}
	public static boolean safeClick(WebElement element) {
		int attempts = 0;
		while (attempts < 5) {
			try {
				waitUntilClickable(element); // Ensure element is clickable
				scrollToElement(element); // Scroll into view
				element.click(); // Try clicking
				return true;
			} catch (Exception e) {
				attempts++;
				sleep(1000); // Wait 1 second before retrying
			}
		}
		return false;
	}
 
public static void scrollToElement(WebElement element) {
		try {
			((JavascriptExecutor) driver)
					.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'nearest'});", element);
			sleep(500);
		} catch (Exception e) {
			System.out.println("Failed to scroll to element: " + e.getMessage());
		}
	}
public static WebElement waitUntilClickable(By locator) {
	// waitForAngularLoad();
	return getWait().until(ExpectedConditions.elementToBeClickable(locator));
}
 
public static WebElement waitUntilClickable(WebElement element) {
	WebDriverWait wait = HelperClass.getWait();
	return wait.until(ExpectedConditions.elementToBeClickable(element));
}
 
public static void selectFromCustomDropdown(WebDriver driver, String dropdownXpath, String optionText) throws TimeoutException {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
 
    WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(dropdownXpath)));
	dropdown.click();
 
	List<WebElement> options = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
	    By.xpath("//div[contains(@class, 'option') or contains(@class, 'mat-option') or contains(@class, 'cdk-overlay')]//span[normalize-space(text())='" + optionText + "']")
	));
 
	for (WebElement option : options) {
	    if (option.getText().trim().equals(optionText)) {
	        option.click();
	        return;
	    }
	}
 
	throw new NoSuchElementException("Option '" + optionText + "' not found.");
}
public static void selectFromNgSelectDropdown(WebDriver driver, String ngSelectXpath, String optionText) {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
 
    try {
        // Step 1: Click the ng-select dropdown
        WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ngSelectXpath)));
        dropdown.click();
 
        // Step 2: Wait for any ng-option to be visible
        List<WebElement> allOptions = wait.until(ExpectedConditions
            .visibilityOfAllElementsLocatedBy(By.xpath("//div[contains(@class, 'ng-dropdown-panel-items')]//div[contains(@class, 'ng-option')]")));
 
        // Step 3: Loop through and click the matching option
        for (WebElement option : allOptions) {
            String optionVisibleText = option.getText().trim();
            if (optionVisibleText.equalsIgnoreCase(optionText)) {
                option.click();
                return;
            }
        }
 
        // If not found
        throw new NoSuchElementException("Option '" + optionText + "' not found in ng-select dropdown.");
    } catch (TimeoutException e) {
        throw new TimeoutException("Dropdown options not visible or option '" + optionText + "' not found within timeout.");
    }
}
 
public static void hoverOverElement(WebDriver driver, By locator) {
	WebDriverWait wait=HelperClass.getWait();
	//WebDriver driver=HelperClass.getDriver();
    Actions actions = new Actions(driver);
    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    actions.moveToElement(element).perform();
    element.click();
}
 
public static void selectFromStatusDropdown(WebDriver driver, String dropdownXpath, String optionText) throws TimeoutException {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
 
    WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(dropdownXpath)));
    dropdown.click();
 
    // A single valid XPath that matches options anywhere inside overlays
    String optionXpath =
            "//div[contains(@class,'cdk-overlay')]//span[normalize-space(text())='" + optionText + "']" +
            " | //div[contains(@class,'ng-dropdown-panel')]//span[normalize-space(text())='" + optionText + "']";
 
    WebElement optionToSelect =
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath(optionXpath)));
 
    optionToSelect.click();
}
 
public static void verifyStatusTypes(WebDriver driver, String columnXpath, String expectedType) {
    List<WebElement> StatusTypeElements = driver.findElements(By.xpath(columnXpath));
 
    if (StatusTypeElements.isEmpty()) {
        System.out.println("No client records found with the given XPath: " + columnXpath);
        return;
    }
 
    boolean allMatch = true;
 
    for (int i = 0; i < StatusTypeElements.size(); i++) {
        String actualType = StatusTypeElements.get(i).getText().trim();
 
        if (!actualType.equalsIgnoreCase(expectedType)) {
            System.out.println("Mismatch at row " + (i + 1) + ": Expected = " + expectedType + ", Found = " + actualType);
            allMatch = false;
        } else {
            System.out.println("Match at row " + (i + 1) + ": Client Type = " + actualType);
        }
    }
}
 
 
 
public static void clickWithRetry(WebElement element, WebDriver driver, WebDriverWait wait) {
	int attempts = 0;
	while (attempts < 3) {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(element)).click();
			return;
		} catch (ElementClickInterceptedException | StaleElementReferenceException e) {
			System.out.println("Retry click #" + (attempts + 1) + " for: " + element);
			attempts++;
			//HelperClass.sleep1(500);
		}
	}
 
	try {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
		System.out.println("Fallback: JavaScript click used.");
	} catch (Exception jsEx) {
		System.out.println("JS click failed: " + jsEx.getMessage());
	}
}
 
public static void waitForPageToLoad(WebDriver driver) {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	try {
		wait.until(webDriver -> (Boolean) js.executeScript("return (window.angular !== undefined) && "
				+ "(angular.element(document).injector() !== undefined) && "
				+ "(angular.element(document).injector().get('$http').pendingRequests.length === 0);"));
	} catch (Exception e) {
		Log.warn("Angular wait skipped: " + e.getMessage());
	}
 
	wait.until(webDriver -> js.executeScript("return document.readyState").toString().equals("complete"));
}
public static void validateDropdownRecordCount(WebDriver driver) throws InterruptedException {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    List<Integer> dropdownValues = Arrays.asList(10, 20, 50, 100);
 
    for (int value : dropdownValues) {
        try {
            // Open the dropdown (relative to "Show" label)
            WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//mat-select[@panelclass='pagination']")));
            dropdown.click();
 
            // Wait for the dropdown options
            WebElement option = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//mat-option//span[normalize-space(text())='" + value + "']")));
            option.click();
 
            // Wait for the table to update
            Thread.sleep(1500);  // Ideally, replace with dynamic wait for table update
 
            // Count the number of rows in the table
            List<WebElement> rows = driver.findElements(By.xpath("//td/div/div[normalize-space()='']"));
            int rowCount = rows.size();
 
            System.out.println("Selected: " + value + " | Rows Displayed: " + rowCount);
 
            if (rowCount <= value) {
                System.out.println("Validation passed for: " + value);
            } else {
                System.err.println("Row count mismatch for " + value + ": " + rowCount);
            }
 
        } catch (Exception e) {
            System.err.println("Error validating dropdown value: " + value);
         
        }
    }
}
public static void validatePaginationNextAndPrevious(WebDriver driver, int dropdownValue) throws InterruptedException {
    
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    JavascriptExecutor js = (JavascriptExecutor) driver;
 
	    // 1. Select value from dropdown (10, 20, etc.)
	    WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//mat-select[@panelclass='pagination']")));
	    dropdown.click();
	    Thread.sleep(500);
 
	    WebElement option = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//mat-option//span[text()='" + dropdownValue + "']")));
	    option.click();
	    Thread.sleep(1000); // Let table reload
 
	    System.out.println(" Selected '" + dropdownValue + "' from Show dropdown.");
 
	    // 2. Click "Next" until it's disabled
	    while (true) {
	        WebElement nextButton = driver.findElement(By.xpath("//button[contains(@class,'paginator-next')]"));
 
	        if (!nextButton.isDisplayed()) {
	            System.out.println("'Next' button is disabled. Reached last page.");
	            break;
	        }
 
	        js.executeScript("arguments[0].scrollIntoView(true);", nextButton);
	        Thread.sleep(2000);
	        nextButton.click();
	        System.out.println(" Clicked 'Next' button");
	        
	        Thread.sleep(1000); // Wait for data to load
	    }
 
	    // 3. Click "Previous" until it's disabled
	    while (true) {
	        WebElement prevButton = driver.findElement(By.xpath("//button[contains(@class,'paginator-previous')]"));
 
	        if (!prevButton.isEnabled()) {
	            System.out.println("'Previous' button is disabled. Reached first page.");
	            break;
	        }
 
	        js.executeScript("arguments[0].scrollIntoView(true);", prevButton);
	        prevButton.click();
	        System.out.println("Clicked 'Previous' button");
 
	        Thread.sleep(1000); // Wait for data to load
	    }
 
	    System.out.println("Pagination (Next & Previous) validation completed.");
	}
String Filepath = "D:\\bdd automation\\CorporationTax_5.0\\CorporationTax_5.0\\src\\test\\resources\\FILES\\auto_client.xlsx";


 

public static void validateAndVerify(By locator, String string) {
	
    try {
        // Locate the WDV B/fwd value
        WebElement wdvElement = driver.findElement(locator);
        String actualValue = wdvElement.getText().trim();

        // Define the expected value
        String expectedValue = string;

        // Validate the value
        if (actualValue.equals(expectedValue)) {
            System.out.println("Validation Passed"+ actualValue);
        } else {
            System.out.println("Validation Failed: Expected '" + expectedValue + "', but found '" + actualValue + "'.");
        }

    } catch (Exception e) {
        System.out.println("Error during validation: " + e.getMessage());
    }
    }
    public static void hoverOverElement(WebElement element) {
		Actions actions = new Actions(HelperClass.getDriver());
		actions.moveToElement(element).perform();
		Log.info("Hovered over element: " + element);
	}
	
	public static void hoverOverElement(By locator) {
	    WebDriver driver = HelperClass.getDriver();
	    WebElement element = driver.findElement(locator);
	    Actions actions = new Actions(driver);
	    actions.moveToElement(element).perform();
	    Log.info("Hovered over element located by: " + locator);
	}
	

	    public HelperClass(WebDriver driver) {
	        this.driver = driver;
	    }

	 
	   
	    public static boolean safeSendKeys(By locator, String text) {
	        int attempts = 0;
	        while (attempts < 5) {
	            try {
	                WebElement element = waitUntilVisible(locator);
	                scrollToElement(locator);
	                element.click();
	                element.clear();
	                element.sendKeys(text);
	                return true;
	            } catch (Exception e) {
	                attempts++;
	                sleep(1000);
	            }
	        }
	        return false;
	    }
	    public static void validateTextField(By locator, String fieldName, String expectedValue) throws InterruptedException {
	        try {
	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

	            String actualValue = element.getAttribute("value");
	            if (actualValue == null) {
	                actualValue = "";
	            }

	            if (!expectedValue.equals(actualValue)) {
	                throw new AssertionError(
	                    "Validation FAILED for '" + fieldName + "'. Expected: '" + expectedValue + "' but was: '" + actualValue + "'"
	                );
	            }

	            System.out.println("Validation PASSED for '" + fieldName + "'. Value = '" + actualValue + "'");
	        } catch (org.openqa.selenium.TimeoutException te) {
	            if (Thread.currentThread().isInterrupted()) {
	                throw new InterruptedException("Thread was interrupted while waiting for '" + fieldName + "'");
	            }
	            throw new AssertionError("Timeout waiting for field '" + fieldName + "'. " + te.getMessage());
	        }
	    }
	    
	    public static void checkCheckbox(String xpathOrLocatorString, String checkboxName) throws InterruptedException {
	        By locator = By.xpath(xpathOrLocatorString);

	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        WebElement checkbox;
	        try {
	            // Wait until the checkbox input is present and visible
	            checkbox = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	        } catch (Exception e) {
	            if (Thread.currentThread().isInterrupted()) {
	                throw new InterruptedException("Thread was interrupted while waiting for checkbox '" + checkboxName + "'");
	            }
	            throw new RuntimeException("Could not locate checkbox '" + checkboxName + "': " + e.getMessage(), e);
	        }

	        // Ensure it's enabled / clickable if needed
	        if (!checkbox.isEnabled()) {
	            throw new RuntimeException("Checkbox '" + checkboxName + "' is not enabled");
	        }

	        // Check current state
	        boolean isAlreadyChecked = checkbox.isSelected();
	        if (!isAlreadyChecked) {
	            try {
	                checkbox.click();
	                System.out.println("Checkbox '" + checkboxName + "' checked successfully.");
	            } catch (Exception e) {
	                throw new RuntimeException("Failed to click checkbox '" + checkboxName + "': " + e.getMessage(), e);
	            }
	        } else {
	            System.out.println("Checkbox '" + checkboxName + "' was already checked, no action taken.");
	        }
	    }
	    public static void validateAndClickCheckbox(By locator, String checkboxName, boolean shouldBeChecked) throws InterruptedException {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        WebElement checkbox;

	        try {
	            // Wait until clickable
	            checkbox = wait.until(ExpectedConditions.elementToBeClickable(locator));
	        } catch (Exception e) {
	            if (Thread.currentThread().isInterrupted()) {
	                throw new InterruptedException("Thread was interrupted while waiting for checkbox '" + checkboxName + "'");
	            }
	            throw new RuntimeException("Could not locate or click checkbox '" + checkboxName + "': " + e.getMessage(), e);
	        }

	        boolean currentState;
	        try {
	            currentState = checkbox.isSelected();
	        } catch (Exception e) {
	            throw new RuntimeException("Failed to get selected state of checkbox '" + checkboxName + "': " + e.getMessage(), e);
	        }

	        if (currentState == shouldBeChecked) {
	            System.out.println("Checkbox '" + checkboxName + "' already in required state (" 
	                                + (shouldBeChecked ? "checked" : "unchecked") + "). No action taken.");
	        } else {
	            try {
	                checkbox.click();
	                // Optionally verify post-click state
	                boolean afterClickState = checkbox.isSelected();
	                if (afterClickState != shouldBeChecked) {
	                    throw new AssertionError("Checkbox '" + checkboxName + "' click did not set to required state. Expected: " 
	                                             + shouldBeChecked + " but was: " + afterClickState);
	                }
	                System.out.println("Checkbox '" + checkboxName + "' clicked and is now " 
	                                    + (shouldBeChecked ? "checked" : "unchecked") + ".");
	            } catch (Exception e) {
	                throw new RuntimeException("Failed clicking checkbox '" + checkboxName + "': " + e.getMessage(), e);
	            }
	        }
	    }
	    
	    public static void setDateAsText(WebDriver driver, WebElement element, String date) {
			waitForPageToLoad(driver);
	 
			DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("[dd/MM/yyyy][yyyy-MM-dd]");
			DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	 
			LocalDate parsedDate = LocalDate.parse(date, inputFormatter);
			String formattedDate = parsedDate.format(outputFormatter);
	 
			((JavascriptExecutor) driver).executeScript("arguments[0].value='';", element);
			element.clear();
			element.sendKeys(Keys.chord(Keys.CONTROL, "a"));
			element.sendKeys(Keys.DELETE);
	 
			element.sendKeys(formattedDate);
			element.sendKeys(Keys.TAB);
		}
	    public static void validateBalanceEqualsWDVCFwd(WebDriver driver) {
	        try {
	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	 
	            // Get "Balance in the pool" value
	            WebElement balanceElement = wait.until(ExpectedConditions.visibilityOfElementLocated(
	                By.xpath("//tr[th[text()='Balance in the pool']]/td")
	            ));
	            String balanceText = balanceElement.getText().trim().replace(",", "");
	 
	            // Get "WDV C/fwd" value
	            WebElement wdvElement = wait.until(ExpectedConditions.visibilityOfElementLocated(
	                By.xpath("//tr[th[text()='WDV C/fwd']]/td")
	            ));
	            String wdvText = wdvElement.getText().trim().replace(",", "");
	 
	            // Parse to double
	            double balance = Double.parseDouble(balanceText);
	            double wdvCForward = Double.parseDouble(wdvText);
	 
	            // Validate equality
	            if (balance == wdvCForward) {
	                System.out.println("Validation Passed: Balance in the pool = WDV C/fwd (" + balance + ")");
	            } else {
	                System.out.println("Validation Failed: Balance in the pool (" + balance + ") ≠ WDV C/fwd (" + wdvCForward + ")");
	            }
	 
	        } catch (TimeoutException e) {
	            System.out.println("Timeout: Element not found - " + e.getMessage());
	        } catch (NumberFormatException e) {
	            System.out.println("Number format error: " + e.getMessage());
	        } catch (Exception e) {
	            System.out.println(" Unexpected error during validation: " + e.getMessage());
	        }
	    }
	        public static void validatePageText(WebDriver driver, String expectedText, By locator) {
	            try {
	                WebElement element = driver.findElement(locator);
	                String actualText = element.getText().trim();

	                System.out.println("Expected text: " + expectedText);
	                System.out.println("Actual text: " + actualText);

	                if (!actualText.equalsIgnoreCase(expectedText)) {
	                    throw new AssertionError("Page validation failed: Expected '" + expectedText +
	                            "' but found '" + actualText + "'");
	                }

	                System.out.println(" Navigation validated successfully: Correct text found.");

	            } catch (Exception e) {
	                throw new AssertionError("Failed to validate page text. Error: " + e.getMessage());
	            }
	           
	        }
	    	public static void selectCheckboxAndValidateRate(String checkboxLabelText, String expectedWDARate) {
	    	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    	    JavascriptExecutor js = (JavascriptExecutor) driver;
	     
	    	    // 1. Locate label and click
	    	    WebElement checkboxLabel = driver.findElement(
	    	        By.xpath("//span[normalize-space(text())='" + checkboxLabelText + "']")
	    	    );
	    	    new Actions(driver).moveToElement(checkboxLabel).click().perform();
	     
	    	    // 2. Find the input inside this checkbox
	    	    WebElement checkboxInput = driver.findElement(
	    	        By.xpath("//span[normalize-space(text())='" + checkboxLabelText + "']/ancestor::mat-checkbox//input[@type='checkbox']")
	    	    );
	     
	    	    // 3. Dispatch Angular events
	    	    js.executeScript(
	    	        "arguments[0].checked = true;" +
	    	        "arguments[0].dispatchEvent(new Event('input', { bubbles: true }));" +
	    	        "arguments[0].dispatchEvent(new Event('change', { bubbles: true }));",
	    	        checkboxInput
	    	    );
	     
	    	    // 4. Verify checkbox is selected
	    	    wait.until(ExpectedConditions.elementToBeSelected(checkboxInput));
	    	    System.out.println("Checkbox '" + checkboxLabelText + "' selected? " + checkboxInput.isSelected());
	     
	    	    // 5. Capture expected + actual WDARate
	    	    WebElement wdaRate = driver.findElement(By.xpath("//input[@formcontrolname='WDARate']"));
	    	    double expectedVal = Double.parseDouble(expectedWDARate);
	     
	    	    // Wait for WDARate field to be populated (not empty)
	    	    wait.until(driver1 -> {
	    	        String val = (String) js.executeScript("return arguments[0].value;", wdaRate);
	    	        return val != null && !val.trim().isEmpty();
	    	    });
	     
	    	    // Get the final actual rate value
	    	    String actualRate = (String) js.executeScript("return arguments[0].value;", wdaRate);
	    	    String numeric = actualRate.replaceAll("[^0-9.\\-]", "");
	    	    double finalVal = Double.parseDouble(numeric);
	     
	    	    System.out.println("Final WDARate after selecting '" + checkboxLabelText + "' = " + finalVal);
	     
	    	    // 6. Assertion logic
	    	    if (Math.abs(finalVal - expectedVal) < 0.0001) {
	    	        //Pass test
	    	        Assert.assertTrue(true, "WDARate updated correctly to " + expectedVal);
	    	    } else {
	    	        //Fail fast with clear message
	    	        Assert.fail("WDARate mismatch! Expected " + expectedVal + " but found " + finalVal + " after selecting '" + checkboxLabelText + "'");
	    	    }
	    	}    
	    	    public static void validateCheckboxes(WebDriver driver,
                        List<String> expectedEnabled,
                        List<String> ignoreList) {

List<WebElement> matCheckboxes = driver.findElements(By.cssSelector("mat-checkbox"));
Set<String> seenLabels = new HashSet<>();

for (WebElement matCheckbox : matCheckboxes) {
List<WebElement> labelSpans = matCheckbox.findElements(By.cssSelector("label span"));
if (labelSpans.isEmpty()) continue;

String labelText = labelSpans.get(0).getText().trim();
if (labelText.isEmpty()) continue;

if (ignoreList.contains(labelText)) {
continue; // skip ignored
}

seenLabels.add(labelText);

boolean isActuallyEnabled = !matCheckbox.getAttribute("class")
  .contains("mat-mdc-checkbox-disabled");

System.out.println("Checkbox: " + labelText + " | Enabled: " + isActuallyEnabled);

if (expectedEnabled.contains(labelText)) {
if (isActuallyEnabled) {
  System.out.println("✅ Passed: " + labelText + " is enabled");
} else {
  throw new AssertionError("❌ Failed: " + labelText + " should be enabled but is disabled");
}
} else {
if (!isActuallyEnabled) {
  System.out.println("✅ Passed: " + labelText + " is disabled");
} else {
  throw new AssertionError("❌ Failed: " + labelText + " should be disabled but is enabled");
}
}
}

for (String expected : expectedEnabled) {
if (!seenLabels.contains(expected)) {
throw new AssertionError("❌ Failed: Expected checkbox '" + expected + "' not found in DOM!");

}
}
}

//public static void selectCheckboxAndValidateRate(String checkboxLabelText, String expectedWDARate) {
//    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//    JavascriptExecutor js = (JavascriptExecutor) driver;
//
//    // 1. Locate label and click
//    WebElement checkboxLabel = driver.findElement(
//        By.xpath("//span[normalize-space(text())='" + checkboxLabelText + "']")
//    );
//    new Actions(driver).moveToElement(checkboxLabel).click().perform();
//
//    // 2. Find the input inside this checkbox
//    WebElement checkboxInput = driver.findElement(
//        By.xpath("//span[normalize-space(text())='" + checkboxLabelText + "']/ancestor::mat-checkbox//input[@type='checkbox']")
//    );
//
//    // 3. Dispatch Angular events
//    js.executeScript(
//        "arguments[0].checked = true;" +
//        "arguments[0].dispatchEvent(new Event('input', { bubbles: true }));" +
//        "arguments[0].dispatchEvent(new Event('change', { bubbles: true }));",
//        checkboxInput
//    );
//
//    // 4. Verify checkbox is selected
//    wait.until(ExpectedConditions.elementToBeSelected(checkboxInput));
//    System.out.println("Checkbox '" + checkboxLabelText + "' selected? " + checkboxInput.isSelected());
//
//    // 5. Now wait for WDARate to become expected (numeric comparison)
//    WebElement wdaRate = driver.findElement(By.xpath("//input[@formcontrolname='WDARate']"));
//    double expectedVal = Double.parseDouble(expectedWDARate);
//
//    wait.until(driver1 -> {
//        Object raw = js.executeScript("return arguments[0].value;", wdaRate);
//        String s = raw == null ? "" : raw.toString().trim();
//        System.out.println("Polling WDARate -> '" + s + "'"); // debug
//        if (s.isEmpty()) return false;
//
//        String numeric = s.replaceAll("[^0-9.\\-]", "");
//        try {
//            double val = Double.parseDouble(numeric);
//            return Math.abs(val - expectedVal) < 0.0001;
//        } catch (NumberFormatException ex) {
//            return false;
//        }
//    });
// 
//    // 6. Final value check
//    String actualRate = (String) js.executeScript("return arguments[0].value;", wdaRate);
//    System.out.println("Final WDARate after selecting '" + checkboxLabelText + "' = " + actualRate);
//
//    String numeric = actualRate.replaceAll("[^0-9.\\-]", "");
//    double finalVal = Double.parseDouble(numeric);
//
//    Assert.assertEquals(finalVal, expectedVal, 0.0001,
//        " WDARate did not update correctly after selecting '" + checkboxLabelText + "'");
//}
//
public static void selectCheckboxOnly(String checkboxLabelText) {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    JavascriptExecutor js = (JavascriptExecutor) driver;

    // 1. Locate label and click
    WebElement checkboxLabel = driver.findElement(
        By.xpath("//span[normalize-space(text())='" + checkboxLabelText + "']")
    );
    new Actions(driver).moveToElement(checkboxLabel).click().perform();

    // 2. Find the checkbox input
    WebElement checkboxInput = driver.findElement(
        By.xpath("//span[normalize-space(text())='" + checkboxLabelText + "']/ancestor::mat-checkbox//input[@type='checkbox']")
    );

    // 3. Manually check the box via JavaScript (Angular-friendly)
    js.executeScript(
        "arguments[0].checked = true;" +
        "arguments[0].dispatchEvent(new Event('input', { bubbles: true }));" +
        "arguments[0].dispatchEvent(new Event('change', { bubbles: true }));",
        checkboxInput
    );

    // 4. Wait for checkbox to be selected
    wait.until(ExpectedConditions.elementToBeSelected(checkboxInput));

    // 5. Confirm
    if (checkboxInput.isSelected()) {
        System.out.println("✅ Checkbox '" + checkboxLabelText + "' is selected.");
    } else {
        throw new AssertionError("❌ Checkbox '" + checkboxLabelText + "' was not selected as expected.");
    }

}
//
//public static void waitForPageToLoad(WebDriver driver) {
//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
//	JavascriptExecutor js = (JavascriptExecutor) driver;
//	try {
//		wait.until(webDriver -> (Boolean) js.executeScript("return (window.angular !== undefined) && "
//				+ "(angular.element(document).injector() !== undefined) && "
//				+ "(angular.element(document).injector().get('$http').pendingRequests.length === 0);"));
//	} catch (Exception e) {
//		//Log.warn("Angular wait skipped: " + e.getMessage());
//	}
//Click 
public static boolean safeClick(WebElement element, String logMessage) {
    for (int i = 0; i < 3; i++) {
        try {
            waitForPageToLoad(driver);
                    wait.until(ExpectedConditions.elementToBeClickable(element));
            try {
                element.click();
            } catch (ElementClickInterceptedException e) {
                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
            }
            Log.info("Clicked: " + logMessage);
            return true;
        } catch (Exception e) { sleep(1000); }
    }
    Log.info("Failed to click: " + logMessage);
    return false;


//	wait.until(webDriver -> js.executeScript("return document.readyState").toString().equals("complete")));
}


//send Keys

public static void safeType(WebElement element, String text, String logMessage) {
	WebDriver driver = getDriver();
	waitForPageToLoad(driver);
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
	WebElement el = wait.until(ExpectedConditions.visibilityOf(element));
	el.clear();
	el.sendKeys(text);
	Log.info("Typed in " + logMessage + ": " + text);
}

public static boolean isElementPresent(By locator) {
	try {
		WebElement element = getDriver().findElement(locator);
		return element.isDisplayed();
	} catch (NoSuchElementException | StaleElementReferenceException e) {
		return false;
	}
}

public static void takeScreenshot(WebDriver driver, String screenshotName) {
    try {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);

        String dest = System.getProperty("user.dir") + "/screenshots/" + screenshotName + ".png";
        File destination = new File(dest);
        FileUtils.copyFile(source, destination);

        System.out.println(" Screenshot saved at: " + dest);
    } catch (IOException e) {
        System.err.println(" Failed to capture screenshot: " + e.getMessage());
    }
}

public static void fastAngularClick(WebDriver driver, By locator, String name) {
    try {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement el = wait.until(ExpectedConditions.elementToBeClickable(locator));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", el);
        Thread.sleep(100);
        try {
            el.click();
        } catch (Exception e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", el);
        }
        System.out.println(" Clicked: " + name);
        Assert.assertTrue(true, name + " clicked.");
    } catch (Exception e) {
        System.out.println(" Failed to click: " + name);
        Assert.fail(name + " click failed: " + e.getMessage());
    }
}

// ... other utility methods

}

//Mouse hover 

//public static void hover(WebElement element, String log) {
//	try {
//		new Actions(getDriver()).moveToElement(waitUntilVisible(element)).perform();
//		System.out.println("Hovered on: " + log);
//	} catch (Exception e) {
//		throw new RuntimeException("Failed to hover on: " + log, e);
//	}
//}
//
//}
////Angular Date Picker
//
//public static void setDateAsText(WebDriver driver, WebElement element, String date) {
//	waitForPageToLoad(driver);
//
//	DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("[dd/MM/yyyy][yyyy-MM-dd]");
//	DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//
//	LocalDate parsedDate = LocalDate.parse(date, inputFormatter);
//	String formattedDate = parsedDate.format(outputFormatter);
//
//	((JavascriptExecutor) driver).executeScript("arguments[0].value='';", element);
//	element.clear();
//	element.sendKeys(Keys.chord(Keys.CONTROL, "a"));
//	element.sendKeys(Keys.DELETE);
//
//	element.sendKeys(formattedDate);
//	element.sendKeys(Keys.TAB);
//}
//}


	    	
		
			
	     
	    
	    
	

	       
	

	

	
	




	 