package support

import io.cucumber.scala.{EN, ScalaDsl}
import org.openqa.selenium.chrome.{ChromeDriver, ChromeOptions}
import pages.LoginPage.driver
import utils.ScreenCapture


class Hooks extends ScalaDsl with EN {

  val options = new ChromeOptions()
  options.addArguments("--headless=new") // COMMENT OUT - to see the test run

  Before {
    println("Launching browser before scenario...")
    DriverManager.driver = new ChromeDriver(options)
    DriverManager.driver.manage().window().maximize()
  }

  After {
ScreenCapture.capture(driver)
    println("Closing browser after scenario and screencapture...")

    DriverManager.driver.quit() // COMMENT OUT - to see the test results

  }
}
