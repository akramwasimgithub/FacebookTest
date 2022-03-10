package com.bridelabz;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.awt.*;

public class MouseNagivation {
    @Test
    public void MouseTesting() throws InterruptedException, AWTException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\63not\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.amazon.com/");
        Thread.sleep(5000);
        Robot robot = new Robot();
        robot.mouseMove(500, 300);
        Thread.sleep(3000);
        robot.mouseWheel(1000);
        Thread.sleep(7000);
        driver.close();
    }
}

