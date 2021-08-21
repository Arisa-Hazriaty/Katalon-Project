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

Scanner scan = new Scanner(System.in);

System.out.println("===CASES===\n");
System.out.println("Inputkan nomor case:");
caseNumber = scan.nextInt();

switch(caseNumber) {
	case 1:
	println ("Case 1 dieksekusi")
	WebUI.setText(findTestObject('orange-hrm/username'), 'admin')
	WebUI.setEncryptedText(findTestObject('orange-hrm/password'), 'hUKwJTbofgPU9eVlw/CnDQ==')
	WebUI.click(findTestObject('orange-hrm/login-btn'))
	break
	
	case 2:
	println ("Case 2 dieksekusi")
	def data = findTestData('Orange HRM/New Test Data')

	for (def rowlogin = 1; rowlogin <= data.getRowNumbers(); rowlogin++) {
    WebUI.setText(findTestObject('orange-hrm/username'), data.getValue('username', rowlogin))

    WebUI.setText(findTestObject('orange-hrm/password'), data.getValue('password', rowlogin))

    WebUI.click(findTestObject('orange-hrm/login-btn'))

    def actual = WebUI.getText(findTestObject('orange-hrm/txt_errormessage'))

    WebUI.verifyMatch(actual, data.getValue('expected result', rowlogin), false)
	}
	break
	
	case 500:
	println ("Case 500 dieksekusi")
	WebUI.openBrowser('')
	WebUI.maximizeWindow()
 	WebUI.navigateToUrl(GlobalVariable.baseUrl)	
	break
	
	case 1754:
	println("Case 1754 dieksekusi") 
	break
	
	default:
	println("Case default dieksekusi")
	break
}