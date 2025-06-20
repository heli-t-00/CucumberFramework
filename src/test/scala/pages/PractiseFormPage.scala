package pages

import locators.PractiseFormLocators.{DateField, ExperienceButton, Firstname, GenderButton, Lastname, Submit, continentDrop, cookiesAcceptLocator}
import org.openqa.selenium.By

import java.sql.Date

object PractiseFormPage extends PractiseBasePage {

  // First Name

  def inputFirstName(text: String): Unit =
    inputText(Firstname, text)

  // Last name
  def inputLastName(text: String): Unit =
    inputText(Lastname, text)

  // Enter Date
def inputDate( text: String): Unit = {
  inputText(DateField, text)
}
// Click Accept Cookie
  def clickCookies(): Unit = {
    acceptCookie (cookiesAcceptLocator)
  }

  // Click Gender
  def gender(): Unit ={
    clickOn(GenderButton)
  }

  // Click Experience
  def experience():Unit ={
    clickOn(ExperienceButton)
  }

  // Scroll to Gender so it appears
def scrollGender(): Unit={
  scroll(GenderButton)
}

  // Select continent
  def selectContinent(text:String): Unit={
    selectDropdown(continentDrop, text)
  }

  // Upload File
//  def upLoadFile(filePath: String): Unit = {
//    driver.findElement(By.id)
//  }

  // click Submit
  def clickSubmit(): Unit = {
    clickOn(Submit)
  }

}

