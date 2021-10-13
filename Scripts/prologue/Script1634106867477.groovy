import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import my.TestObjectFactory

// modify WebUI.* keywords which take TestObject as arg0
// so that they call Highlight.on() automatically
CustomKeywords.'com.kazurayam.ksbackyard.HighlightElement.pandemic'()

// open browser, navigate to the start page
WebUI.openBrowser("http://demoaut.katalon.com/")

// click the "Make Appointment" button on the start page
TestObject anchorMakeAppointment = TestObjectFactory.create("//a[@id='btn-make-appointment']")
WebUI.waitForElementPresent(anchorMakeAppointment, 0)
WebUI.click(anchorMakeAppointment)

// set username and password, and do login
TestObject inputUsername = TestObjectFactory.create("//input[@id='txt-username']")
WebUI.waitForElementPresent(inputUsername, 10)
WebUI.setText(inputUsername, "John Doe")

TestObject inputPassword = TestObjectFactory.create("//input[@id='txt-password']")
WebUI.waitForElementPresent(inputPassword, 10)
WebUI.setText(inputPassword, "ThisIsNotAPassword")

TestObject buttonLogin = TestObjectFactory.create("//button[@id='btn-login']")
WebUI.waitForElementPresent(buttonLogin, 10)
WebUI.click(buttonLogin)
