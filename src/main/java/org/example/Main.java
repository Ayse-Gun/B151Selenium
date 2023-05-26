package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        System.out.println(System.getProperty("webdriver.chrome.driver"));

        WebDriver driver = new ChromeDriver();
        driver.get("https://techproeducation.com");

    }
}