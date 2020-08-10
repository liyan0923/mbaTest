package com.santian.test;


import io.appium.java_client.android.AndroidDriver;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



import java.io.File;
import java.io.IOException;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class TestApi {
    public AndroidDriver<WebElement> driver;

    @BeforeTest
    public void InitializeTestJk() throws MalformedURLException {
        //创建配置对象
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
//        添加配置
//        测试设备
        desiredCapabilities.setCapability("deviceName", "127.0.0.1:5555");
//        测试平台
        desiredCapabilities.setCapability("platformName", "Android");
//        测试包名
        desiredCapabilities.setCapability("appPackage", "com.handsgo.jiakao.android");
//        测试app启动入口
        desiredCapabilities.setCapability("appActivity", "com.handsgo.jiakao.android.splash.Login");
        //不清除数据
        desiredCapabilities.setCapability("noReset", "true");

        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void TestApi1() throws InterruptedException, IOException {
        Thread.sleep(8000);
//        Activity activity=new Activity("com.android.browser","com.android.browser.BrowserActivity");
//        driver.startActivity(activity);
//        Thread.sleep(8000);
//        System.out.println(driver.currentActivity());
//        System.out.println(driver.isAppInstalled("com.sponge.mba"));
//        driver.resetApp();

        //物理按键事件触发
//        KeyEvent keyEvent=new KeyEvent();
//        keyEvent.withKey(AndroidKey.HOME);
//        driver.pressKey(keyEvent);




//        File file =driver.getScreenshotAs(OutputType.FILE);
//        File file1=new File("/Users/liyan/Documents/file/home.png");
//        FileUtils.copyFile(file,file1);
        FileUtils.copyFile(driver.getScreenshotAs(OutputType.FILE),new File("/Users/liyan/Documents/file/home1.png"));



    }

//    @AfterTest
//    public void TearDown(){
//        driver.quit();
//    }
}
