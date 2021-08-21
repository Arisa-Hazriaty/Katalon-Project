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

String username = faker.name().username()

WebUI.click(findTestObject('user-hrm1/menu-adm'))

WebUI.click(findTestObject('user-hrm1/btn-add'))

WebUI.selectOptionByValue(findTestObject('user-hrm1/dropdownlist-user-type'), '1', false)

WebUI.setText(findTestObject('user-hrm1/Txt_employee_name'), 'Ananya Dash')

WebUI.setText(findTestObject('user-hrm1/txt-username'), username)

WebUI.selectOptionByValue(findTestObject('user-hrm1/dropdownlist-user-type'), '1', false)

WebUI.setEncryptedText(findTestObject('user-hrm1/txt_password'), 'iFGeFYmXIrXdMr0br4q/0w==')

WebUI.setEncryptedText(findTestObject('user-hrm1/txt_confirmpassword'), 'iFGeFYmXIrXdMr0br4q/0w==')

WebUI.click(findTestObject('user-hrm1/btn_saveuser'))

