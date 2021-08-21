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

String middleName = faker.name().firstName()

WebUI.click(findTestObject('add-employee/pim'))

WebUI.click(findTestObject('add-employee/mn-employee-list'))

WebUI.click(findTestObject('add-employee/btn-add'))

WebUI.setText(findTestObject('add-employee/first-name'), firstName)

WebUI.setText(findTestObject('add-employee/middle-name'), middleName)

WebUI.setText(findTestObject('add-employee/last-name'), lastName)

WebUI.verifyElementVisible(findTestObject('add-employee/txt-employee-id'), FailureHandling.STOP_ON_FAILURE)

WebUI.uploadFile(findTestObject('add-employee/photo-file'), '/Users/arisahazriaty/Downloads/IMG_0301.JPG')

WebUI.check(findTestObject('add-employee/chx-create-login-detail'))

WebUI.setText(findTestObject('add-employee/txt-user-name'), 'a')

WebUI.setEncryptedText(findTestObject('add-employee/txt-password'), 'iFGeFYmXIrU6ruIopQUS+w==')

WebUI.setEncryptedText(findTestObject('add-employee/txt-password'), 'iFGeFYmXIrU6ruIopQUS+w==')

WebUI.click(findTestObject('add-employee/btn-save'))

WebUI.verifyElementText(findTestObject('add-employee/alert-username'), 'Should have at least 5 characters')

