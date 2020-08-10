package com.santian.test;

import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import java.util.concurrent.TimeUnit;

public class BaiduTest {
    public static AndroidDriver<WebElement> driver;

    @BeforeTest
    public void InitializeTestBaiduMap() throws MalformedURLException {
        //创建配置对象
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
//        添加配置
//        测试设备
        desiredCapabilities.setCapability("deviceName", "127.0.0.1:62001");
//        测试平台
        desiredCapabilities.setCapability("platformName", "Android");
//        测试包名
        desiredCapabilities.setCapability("appPackage", "com.baidu.BaiduMap");
//        测试app启动入口
        desiredCapabilities.setCapability("appActivity", "com.baidu.baidumaps.WelcomeScreen");
        //不清除数据
        desiredCapabilities.setCapability("noReset", "true");
        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void BaiduButton() {
        driver.findElementById("com.baidu.BaiduMap:id/zoom_in").click();
        driver.findElementById("com.baidu.BaiduMap:id/zoom_out").click();
    }


    @Test()
    public void BaiduMapZoomIn() throws InterruptedException {
        Thread.sleep(6000);
        MultiTouchAction multiTouchAction = new MultiTouchAction(driver);
        int x = driver.manage().window().getSize().getWidth();
        int y = driver.manage().window().getSize().getHeight();

        TouchAction touchAction_down = new TouchAction(driver);

        new TouchAction(driver).press(PointOption.point(x * 4 / 10, y * 4 / 10)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).moveTo(PointOption.point(x * 2 / 10, y * 2 / 10)).release();
        touchAction_down.press(PointOption.point(x * 6 / 10, y * 6 / 10)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).moveTo(PointOption.point(x * 8 / 10, y * 8 / 10)).release();

        multiTouchAction.add(new TouchAction(driver)).add(touchAction_down);
        multiTouchAction.perform();


    }

    @AfterTest
    public void TearDown() {
        driver.quit();
    }
}
