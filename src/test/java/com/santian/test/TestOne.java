package com.santian.test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import org.testng.Assert;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import java.net.MalformedURLException;
import java.net.URL;

import java.util.concurrent.TimeUnit;

public class TestOne {
    AndroidDriver<WebElement> driver;

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

    @Test(enabled = false)
    public void TestJk() throws InterruptedException {
//        Thread.sleep(18000);
        //显示元素等待
//        WebDriverWait webDriverWait = new WebDriverWait(driver,10);
//        WebElement  webElement= webDriverWait.until(new ExpectedCondition<WebElement>() {
//            public WebElement apply(WebDriver arg0){
//                return driver.findElementById("com.handsgo.jiakao.android:id/permission_btn");
//
//            }
//        });
//        webElement.click();

        driver.findElementById("com.handsgo.jiakao.android:id/permission_btn").click();
//        Thread.sleep(1000);
        driver.findElementById("com.android.packageinstaller:id/permission_allow_button").click();
        driver.findElementById("com.android.packageinstaller:id/permission_allow_button").click();
        driver.findElementById("com.android.packageinstaller:id/permission_allow_button").click();
//        Thread.sleep(1000);
        driver.findElementById("com.handsgo.jiakao.android:id/select_text").click();
//        Thread.sleep(1000);
        driver.findElementById("com.handsgo.jiakao.android:id/edt_search_q").sendKeys("长");
//        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.RelativeLayout").click();
//        List<WebElement> list1=driver.findElementsById("com.handsgo.jiakao.android:id/item_title");
//        list1.get(2).click();
//        driver.findElementByAndroidUIAutomator("new UiSelector().text(\"长沙\")").click();
        driver.findElementByXPath("//android.widget.TextView[@text='长沙']").click();
//        Thread.sleep(1000);
        driver.findElementById("com.handsgo.jiakao.android:id/item_car").click();
        driver.findElementById("com.handsgo.jiakao.android:id/ok_button").click();
//        Thread.sleep(1000);
        driver.findElementById("com.handsgo.jiakao.android:id/gender_male_btn").click();
        driver.findElementById("com.handsgo.jiakao.android:id/jiakao_not_sign_up_btn").click();
        driver.findElementById("com.handsgo.jiakao.android:id/naben_btn").click();
        driver.findElementById("com.handsgo.jiakao.android:id/btn_next").click();
        Thread.sleep(3000);
        String actual = driver.currentActivity();
        String expect = "cn.mucang.android.mars.student.refactor.business.inquiry.activity.InquiryActivity";

        Assert.assertEquals(actual, expect);


    }

    @Test()
    public void JkRefresh() throws InterruptedException {


//        TouchAction touchAction=new TouchAction(driver);
        PointOption pointOption1 = PointOption.point(359, 1104);
        PointOption pointOption2 = PointOption.point(359, 385);
//        touchAction.press(pointOption1);
//        touchAction.moveTo(pointOption2);
//        touchAction.release();
//        touchAction.perform();
        Thread.sleep(10000);

        TouchAction touchAction = new TouchAction(driver);
        touchAction.press(pointOption1).moveTo(pointOption2).release().perform();
        touchAction.press(pointOption2).moveTo(pointOption1).release().perform();


//
//        touchAction.press(pointOption1);
//        touchAction.moveTo(pointOption2);
//        touchAction.release();
//        touchAction.perform();


    }

//    @AfterTest
//    public void TearDown(){
//        driver.quit();
//    }
}
