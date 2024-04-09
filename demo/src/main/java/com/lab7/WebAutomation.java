package com.lab7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebAutomation {

    public static void main(String[] args) {
        // Set the path to chromedriver executable
        System.setProperty("webdriver.chrome.driver", "/Users/sahilnarwal/Documents/Sem-6/Test Automation Lab/chromedriver-mac-arm64/chromedriver");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Open the web application
        driver.get("file://./home.html");

        // Close the browser
        driver.quit();
    }
}
