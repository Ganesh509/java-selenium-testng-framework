
package com.sdet.tests;

import com.sdet.base.BaseTest;
import com.sdet.pages.HomePage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumSmokeTest extends BaseTest {

    @Test
    public void verifySeleniumHomePageTitle() {
        HomePage homePage = new HomePage(driver);

        homePage.openHomePage();

        Assert.assertTrue(
            homePage.getPageTitle().contains("Selenium"),
            "Home page title should contain Selenium"
        );
    }

    @Test
    public void verifyDownloadsNavigation() {
        HomePage homePage = new HomePage(driver);

        homePage.openHomePage();
        homePage.clickDownloads();

        Assert.assertTrue(
            homePage.isDownloadsPageOpened(),
            "Downloads page URL should contain downloads"
        );
    }
}
