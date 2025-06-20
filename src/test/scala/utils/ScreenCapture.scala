package utils

import org.openqa.selenium.io.FileHandler
import org.openqa.selenium.{OutputType, TakesScreenshot}
import pages.LoginPage.driver

import java.io.File
import java.text.SimpleDateFormat
import java.util.Date


object ScreenCapture {
  val srcFull: File = driver.asInstanceOf[TakesScreenshot].getScreenshotAs(OutputType.FILE)
  FileHandler.copy(srcFull, new File("/Users/helen.to/Documents/screenshotAutomation/TestResult.png"))
println("Screenshot")
  val timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date())
  val srcTimestamp: File = driver.asInstanceOf[TakesScreenshot].getScreenshotAs(OutputType.FILE)
  FileHandler.copy(srcTimestamp, new File(s"/Users/helen.to/Documents/screenshotAutomation/TestResult_$timeStamp.png"))
println("Screenshot with timestamp")


}