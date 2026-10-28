
package com.sdet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.sdet.utils.WaitUtils;

public class HomePage {

    private final WebDriver driver;
    private final WaitUtils waitUtils;

    // Constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.waitUtils = new WaitUtils(driver);
    }

    // Locators
    private final By downloadsLink = By.linkText("Downloads");

    // Actions
    public void openHomePage() {
        driver.get("https://www.selenium.dev/");
    }

    public void clickDownloads() {
        waitUtils.waitForClickable(downloadsLink).click();
    }

    public String getPageTitle() {
        return driver.getTitle();
    }

    public boolean isDownloadsPageOpened() {
        return waitUtils.waitForUrl("downloads");
    }
}
