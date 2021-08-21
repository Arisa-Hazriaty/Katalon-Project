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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://development-accounts.bhinneka.com/login')

WebUI.verifyElementText(findTestObject('Latihan/text'), 'Silakan masuk ke akun Anda')

WebUI.setText(findTestObject('Latihan/input_email'), 'qa-testing3@getnada.com')

WebUI.click(findTestObject('Latihan/Submit'))

WebUI.setEncryptedText(findTestObject('Latihan/input_password'), 'iFGeFYmXIrU6ruIopQUS+w==')

WebUI.click(findTestObject('Latihan/Button'))

WebUI.mouseOver(findTestObject('Latihan/Button_orang'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Latihan/Akun-saya'))

WebUI.click(findTestObject('Latihan/Transaksi'))

