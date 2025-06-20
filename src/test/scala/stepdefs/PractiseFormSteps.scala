package stepdefs

import io.cucumber.scala.{EN, ScalaDsl}
import pages.PractiseFormPage.{browserLaunch, clickCookies, clickSubmit, experience, gender, inputDate, inputFirstName, inputLastName, scrollGender, selectContinent}
import testdata.PractiseData.{continentText, dateText, firstnameText, lastnameText}

class PractiseFormSteps extends ScalaDsl with EN {

  Given("""the user is on the form submission page""") { () =>
    browserLaunch()
    clickCookies()

  }
  When("""the user enters First name Last name date""") { () =>
    inputFirstName(firstnameText)
    inputLastName(lastnameText)
    inputDate("12 June 2025")

  }
  And("""the user clicks radio button and checkbox""") { () =>
    scrollGender()
    gender()
    experience()
  }

  And("""the user select dropdown""") { () =>
    selectContinent(continentText)


  }
  And("""the user uploads file""") { () =>

  }
  And("""the user clicks submit button""") { () =>
    clickSubmit()
  }

  Then("""forms should be submitted""") { () =>

  }

}
