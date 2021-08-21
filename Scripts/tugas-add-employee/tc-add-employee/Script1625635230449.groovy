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
import com.github.javafaker.Faker as Faker

Faker faker = new Faker()

String firstName = faker.name().firstName()

String lastName = faker.name().lastName()

WebUI.click(findTestObject('add-employee/pim'))

WebUI.click(findTestObject('add-employee/mn-employee-list'))

WebUI.click(findTestObject('add-employee/btn-add'))

WebUI.setText(findTestObject('add-employee/first-name'), firstName)

WebUI.setText(findTestObject('add-employee/last-name'), lastName)

WebUI.click(findTestObject('add-employee/btn-save'))

WebUI.verifyElementAttributeValue(findTestObject('add-employee/txt-first-name-details'), 'value', firstName, 0)

WebUI.verifyElementAttributeValue(findTestObject('add-employee/txt-last-name-details'), 'value', lastName, 0)

WebUI.verifyElementVisible(findTestObject('add-employee/txt-employeeeid-details'), FailureHandling.STOP_ON_FAILURE)

//def actual = WebUI.getText(findTestObject('add-employee/photo-profilepicture'))

//WebUI.verifyMatch('actual', 'data.getValue(firstName, lastName)', false)

