package com.zentao.first;

import org.openqa.selenium.WebDriver;

/**
 * @author Linglijun
 * @version 1.0.0
 * @since 
 * 
 * 创建时间：2018年3月14日
 * 功能描述：
 * 邮箱地址：840877890@qq.com
 */
public class DriverUtils {
	 protected static WebDriver driver;
	 public DriverUtils(WebDriver dr) {
		 this.driver=dr;
	 }
	 public static void openWeb(String url) {
		 driver.get(url);
	 }
	 public void back() {
		 driver.navigate().back();
	 }
	 public void forword() {
		 driver.navigate().forward();
	 }
	 
}
