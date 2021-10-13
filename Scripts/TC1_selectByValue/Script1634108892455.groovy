import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import my.TestObjectFactory

// modify WebUI.* keywords which take TestObject as arg0
// so that they call Highlight.on() automatically
CustomKeywords.'com.kazurayam.ksbackyard.HighlightElement.pandemic'()

WebUI.callTestCase(findTestCase("prologue"), null)

// TestObject to select the <select id='combo_facility'> element 
TestObject selectFacility = TestObjectFactory.create("//select[@id='combo_facility']")

// wait for the "Making Appointment" page is loaded
WebUI.waitForElementPresent(selectFacility, 10)

WebUI.selectOptionByValue(selectFacility, 'Hongkong CURA Healthcare Center', false)
WebUI.delay(3)

//WebUI.selectOptionByLabel(selectFacility, 'Seoul CURA Healthcare Center', false)
//WebUI.delay(3)

//WebUI.selectOptionByIndex(selectFacility, 0)
//WebUI.delay(3)

WebUI.callTestCase(findTestCase("epilogue"), null)
