
package com.sdet.utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils {

    private final WebDriverWait wait;

    public WaitUtils(WebDriver driver) {
        this.wait = new WebDriverWait(
            driver,
            Duration.ofSeconds(10)
        );
    }

    // Wait until an element is visible
    public WebElement waitForVisibility(By locator) {
        return wait.until(
            ExpectedConditions.visibilityOfElementLocated(locator)
        );
    }

    // Wait until an element is clickable
    public WebElement waitForClickable(By locator) {
        return wait.until(
            ExpectedConditions.elementToBeClickable(locator)
        );
    }

    // Wait until an element exists in the DOM
    public WebElement waitForPresence(By locator) {
        return wait.until(
            ExpectedConditions.presenceOfElementLocated(locator)
        );
    }

    // Wait until the page title contains expected text
    public boolean waitForTitle(String title) {
        return wait.until(
            ExpectedConditions.titleContains(title)
        );
    }

    // Wait until the URL contains expected text
    public boolean waitForUrl(String urlPart) {
        return wait.until(
            ExpectedConditions.urlContains(urlPart)
        );
    }
}
